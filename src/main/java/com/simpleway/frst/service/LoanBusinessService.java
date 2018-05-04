package com.simpleway.frst.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.simpleway.frst.base.BaseConstant;
import com.simpleway.frst.domain.dto.LoanBusinessInfo;
import com.simpleway.frst.domain.dto.LoanBusinessInfoExample;
import com.simpleway.frst.domain.dto.LoanCompanyInfo;
import com.simpleway.frst.domain.dto.UserLogin;
import com.simpleway.frst.eventbus.EventBusAdaptor;
import com.simpleway.frst.eventbus.listener.LogGenListener;
import com.simpleway.frst.eventbus.listener.events.OperateLogEvent;
import com.simpleway.frst.mapper.LoanBusinessInfoMapper;
import com.simpleway.frst.request.company.LoanBusinessForm;
import com.simpleway.frst.request.company.LoanBusinessQuery;
import com.simpleway.frst.util.SequenceUtil;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * @author xiongfeixiang
 * @title LoanBusinessService
 * @date 2017/10/1 14:54
 * @since v1.0.0
 */
@Service
public class LoanBusinessService {
    @Resource
    LoanBusinessInfoMapper loanBusinessInfoMapper;

    @Resource
    LoanCompanyService loanCompanyService;

    @Resource
    EventBusAdaptor eventBusAdaptor;

    @Resource
    LogGenListener logGenListener;

    @Resource
    LoanCompanyService companyService;

    @PostConstruct
    public void init() {
        eventBusAdaptor.register(logGenListener);
    }

    public Boolean addLoanBusiness(LoanBusinessForm businessForm) throws Exception {
        Long id = SequenceUtil.getSeqId();
        LoanBusinessInfo businessInfo = new LoanBusinessInfo();
        BeanUtils.copyProperties(businessInfo, businessForm);
        businessInfo.setId(id);

        //贷款人银行账号判重，一个贷款对应唯一的一个还款账户
        String loanAccountNo = businessForm.getLoanAccountNo();

        if (isLoanAccountNoRepet(id, loanAccountNo, 1)) {
            throw new RuntimeException("贷款人银行账号已经存在");
        }

        if (null == businessInfo.getCompanyId()) {
            LoanCompanyInfo companyInfo = loanCompanyService.getCompanyByLogin();
            if (null != companyInfo) {
                businessInfo.setCompanyId(companyInfo.getCompanyId());
            }
        }

        int i = loanBusinessInfoMapper.insertSelective(businessInfo);
        return i > 0;
    }

    /**
     * 贷款人银行账号判重
     *
     * @param id 业务id
     *           type  1.add  2.update
     *           loanAccountNo 贷款人银行账号
     * @return
     * @title
     * @tables
     * @simple
     * @author xiongfeixiang
     * @date 2017/10/1 17:39
     * @since v1.0.0
     */
    private Boolean isLoanAccountNoRepet(Long id, String loanAccountNo, Integer type) {
        Boolean result = false;
        LoanBusinessInfo info = null;
        if (type == 1) {
            info = loanBusinessInfoMapper.getByLoanAccountNo(loanAccountNo);
            return null != info;
        }
        if (type == 2) {
            info = loanBusinessInfoMapper.selectByPrimaryKey(id);
            if (Objects.equals(info.getLoanAccountNo(), loanAccountNo)) {
                // 没修改贷款人账号
                return false;
            } else {
                LoanBusinessInfo info4Upd = loanBusinessInfoMapper.getByLoanAccountNo(loanAccountNo);
                return null != info4Upd;
            }
        }
        return result;
    }

    public Boolean updLoanBusiness(LoanBusinessForm businessForm) throws Exception {
        if (businessForm.getId() != null) {
            LoanBusinessInfo orgin = loanBusinessInfoMapper.selectByPrimaryKey(businessForm.getId());
            if (null == orgin) {
                throw new RuntimeException("贷款信息不存在，请核查");
            }
        } else {
            throw new RuntimeException("修改贷款信息时id不能为空，请核查");
        }

        if (isLoanAccountNoRepet(businessForm.getId(), businessForm.getLoanAccountNo(), 2)) {
            throw new RuntimeException("贷款人银行账号已经存在");
        }
        LoanBusinessInfo businessInfo = new LoanBusinessInfo();
        BeanUtils.copyProperties(businessInfo, businessForm);
        int i = loanBusinessInfoMapper.updateByPrimaryKeySelective(businessInfo);
        return i > 0;
    }

    public Boolean delLoanBusiness(Long id) throws Exception {
        LoanBusinessInfo orgin = loanBusinessInfoMapper.selectByPrimaryKey(id);
        if (null == orgin) {
            throw new RuntimeException("贷款信息不存在，请核查");
        }
        return loanBusinessInfoMapper.deleteByPrimaryKey(id) > 0;
    }

    public Page getLoanBusiness(LoanBusinessQuery query) {
        Page<LoanBusinessInfo> page = PageHelper.startPage(query.getPageNo(), query.getPageSize());
        LoanBusinessInfoExample example = new LoanBusinessInfoExample();
        example.setOrderByClause("create_time desc");
        LoanBusinessInfoExample.Criteria c = example.createCriteria();

        UserLogin userLogin = (UserLogin) SecurityUtils.getSubject().getSession().getAttribute(BaseConstant.SESSION_USER);
        //市金融办
        if (userLogin.getInstitutionType().intValue() == BaseConstant.INSTITUTION_TYPE_CITY.intValue()) {
            //查询所有
        } else if (userLogin.getInstitutionType().intValue() == BaseConstant.INSTITUTION_TYPE_AREA.intValue()) {
            //区金融办
            List<Long> companyIds = companyService.getCompanyIdByAreaId(userLogin.getInstitutionId());
            if (CollectionUtils.isNotEmpty(companyIds)) {
                c.andCompanyIdIn(companyIds);
            } else {
                return new Page();
            }
        } else {
            //小贷公司
            c.andCompanyIdEqualTo(userLogin.getInstitutionId());
        }


        if (query.getCompanyId() != null) {
            c.andCompanyIdEqualTo(query.getCompanyId());
        }
        if (StringUtils.isNotBlank(query.getLoanAccountNo())) {
            c.andLoanAccountNoEqualTo(query.getLoanAccountNo());
        }
        if (StringUtils.isNotBlank(query.getLoanIdentify())) {
            c.andLoanIdentifyLike("%" + query.getLoanIdentify() + "%");
        }
        if (StringUtils.isNotBlank(query.getLoanName())) {
            c.andLoanNameLike("%" + query.getLoanName() + "%");
        }
        if (null != query.getOneAmount()) {
            c.andOneAmountEqualTo(query.getOneAmount());
        }
        if (query.getState() != null) {
            c.andStateEqualTo(query.getState());
        }
        loanBusinessInfoMapper.selectByExample(example);
        return page;
    }


    public Boolean updState(Long id) throws Exception {
        LoanBusinessInfo orgin = loanBusinessInfoMapper.selectByPrimaryKey(id);
        if (null == orgin) {
            throw new RuntimeException("贷款信息不存在，请核查");
        }
        //状态【0未放贷,1放贷中，2.已完结,3.还贷异常】
        LoanBusinessInfo info = new LoanBusinessInfo();
        info.setId(id);
        info.setState(1);

        int i = loanBusinessInfoMapper.updateByPrimaryKey(info);
        if (i > 0) {
            // 异步日志处理
            publish(orgin);
            return true;
        }
        return false;
    }

    private void publish(LoanBusinessInfo info) {
        UserLogin userLogin = (UserLogin) SecurityUtils.getSubject().getSession().getAttribute(BaseConstant.SESSION_USER);
//      状态【0未放贷,1放贷中，2.已完结,3.还贷异常】
        String desc = "贷款人【" + info.getLoanName() + "】，身份证号码【" + info.getLoanIdentify() + "】的贷款已上报。";

        eventBusAdaptor.publish(new OperateLogEvent("t_loan_business_info", desc, 1, userLogin.getLoginId()));
    }


    public List<LoanBusinessInfo> loanTotalInfo() {
        return loanBusinessInfoMapper.loanTotalInfo();
    }

    public LoanBusinessInfo getLoanBusinessDetail(Long id) {
        LoanBusinessInfo info = loanBusinessInfoMapper.selectByPrimaryKey(id);
        if (null == info) {
            throw new RuntimeException("根据id：" + id + "查询出的金融公司业务上报信息为空");
        }
        return info;
    }
    
    public List<Map<String,Object>> loanCount(String date){
    	return loanBusinessInfoMapper.loanCount(date);
    }
    
    public List<Map<String,Object>> loanCapital(String date){
    	return loanBusinessInfoMapper.loanCapital(date);
    }
}
















