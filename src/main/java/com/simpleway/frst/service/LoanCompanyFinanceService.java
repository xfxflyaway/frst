package com.simpleway.frst.service;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.simpleway.frst.base.BaseConstant;
import com.simpleway.frst.domain.dto.LoanCompanyFinance;
import com.simpleway.frst.domain.dto.LoanCompanyFinanceExample;
import com.simpleway.frst.domain.dto.LoanCompanyInfo;
import com.simpleway.frst.domain.dto.UserLogin;
import com.simpleway.frst.eventbus.EventBusAdaptor;
import com.simpleway.frst.eventbus.listener.LogGenListener;
import com.simpleway.frst.eventbus.listener.events.OperateLogEvent;
import com.simpleway.frst.mapper.LoanCompanyFinanceMapper;
import com.simpleway.frst.mapper.LoanCompanyInfoMapper;
import com.simpleway.frst.request.company.LoanCompanyFinanceForm;
import com.simpleway.frst.request.company.LoanCompanyFinanceQuery;
import com.simpleway.frst.util.SequenceUtil;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.List;

/**
 * @author xiongfeixiang
 * @title LoanCompanyFinanceService
 * @date 2017/9/30 11:20
 * @since v1.0.0
 */
@Service
public class LoanCompanyFinanceService {
    private static Logger logger = LoggerFactory.getLogger(LoanCompanyFinanceService.class);
    @Resource
    LoanCompanyFinanceMapper loanCompanyFinanceMapper;

    @Resource
    LoanCompanyInfoMapper loanCompanyInfoMapper;

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


    public Boolean addLoanCompanyFinance(LoanCompanyFinanceForm companyFinanceForm) throws Exception {

        UserLogin userLogin = (UserLogin) SecurityUtils.getSubject().getSession().getAttribute(BaseConstant.SESSION_USER);
        LoanCompanyInfo companyInfo = loanCompanyInfoMapper.selectByPrimaryKey(userLogin.getInstitutionId());
        if (null == companyInfo) {
            logger.warn("当前登录用户不属于任何公司，不能创建融资矩阵");
            throw new RuntimeException("当前登录用户不属于任何公司，不能创建融资矩阵");
        }
        LoanCompanyFinance loanCompanyFinance = new LoanCompanyFinance();
        BeanUtils.copyProperties(loanCompanyFinance, companyFinanceForm);
        loanCompanyFinance.setId(SequenceUtil.getSeqId());
        loanCompanyFinance.setCompanyId(companyInfo.getCompanyId());
        loanCompanyFinance.setCompanyName(companyInfo.getCompanyName());
        logger.info("新增融资矩阵上报：{}", JSON.toJSONString(loanCompanyFinance));
        return loanCompanyFinanceMapper.insertSelective(loanCompanyFinance) > 0;
    }

    public Boolean updLoanCompanyFinance(LoanCompanyFinanceForm companyFinanceForm) throws Exception {
        LoanCompanyFinance orgin = loanCompanyFinanceMapper.selectByPrimaryKey(companyFinanceForm.getId());
        if (null == orgin) {
            throw new RuntimeException("融资矩阵信息不存在，请核查");
        }
        LoanCompanyFinance loanCompanyFinance = new LoanCompanyFinance();
        BeanUtils.copyProperties(loanCompanyFinance, companyFinanceForm);
        return loanCompanyFinanceMapper.updateByPrimaryKeySelective(loanCompanyFinance) > 0;
    }

    public Boolean delLoanCompanyFinance(Long id) throws Exception {
        LoanCompanyFinance orgin = loanCompanyFinanceMapper.selectByPrimaryKey(id);
        if (null == orgin) {
            throw new RuntimeException("融资矩阵信息不存在，请核查");
        }
        return loanCompanyFinanceMapper.deleteByPrimaryKey(id) > 0;
    }

    public Page getLoanCompanyFinance(LoanCompanyFinanceQuery query) throws Exception {
        UserLogin userLogin = (UserLogin) SecurityUtils.getSubject().getSession().getAttribute(BaseConstant.SESSION_USER);
        LoanCompanyFinanceExample example = new LoanCompanyFinanceExample();
        example.setOrderByClause("end_time desc");
        LoanCompanyFinanceExample.Criteria c = example.createCriteria();
        //市金融办
        if (userLogin.getInstitutionType().intValue() == BaseConstant.INSTITUTION_TYPE_CITY.intValue()) {
            //0.未上报，1：已上报  2：区金融办审核通过  3：市金融办审核通过 4、审核不通过
            c.andStateNotEqualTo(BaseConstant.FINANCE_STATE_UNREPORT);
        } else if (userLogin.getInstitutionType().intValue() == BaseConstant.INSTITUTION_TYPE_AREA.intValue()) {
            //区金融办
            c.andStateNotEqualTo(BaseConstant.FINANCE_STATE_UNREPORT);
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
        if (query.getState() != null) {
            c.andStateEqualTo(query.getState());
        }

        if (query.getApprovalAmount() != null) {
            c.andApprovalAmountEqualTo(query.getApprovalAmount());
        }
        if (StringUtils.isNotBlank(query.getCompanyName())) {
            c.andCompanyNameLike("%" + query.getCompanyName() + "%");
        }
        if (query.getCompState() != null) {
            c.andCompStateEqualTo(query.getCompState());
        }
        if (StringUtils.isNotBlank(query.getFinanceAccount())) {
            c.andFinanceAccountEqualTo(query.getFinanceAccount());
        }
        if (StringUtils.isNotBlank(query.getFinanceProject())) {
            c.andFinanceProjectEqualTo(query.getFinanceProject());
        }
        if (StringUtils.isNotBlank(query.getPartner())) {
            c.andPartnerEqualTo(query.getPartner());
        }
        if (StringUtils.isNotBlank(query.getPayName())) {
            c.andPayNameEqualTo(query.getPayName());
        }
        if (null != query.getResidualAmount()) {
            c.andResidualAmountEqualTo(query.getResidualAmount());
        }
        if (null != query.getBeginTime()) {
            c.andBeginTimeEqualTo(query.getBeginTime());
        }
        if (null != query.getEndTime()) {
            c.andEndTimeEqualTo(query.getEndTime());
        }


        Page<LoanCompanyFinance> page = PageHelper.startPage(query.getPageNo(), query.getPageSize());
        loanCompanyFinanceMapper.selectByExample(example);
        return page;
    }

    public Boolean updState(Long id, Integer state) {
        LoanCompanyFinance original = loanCompanyFinanceMapper.selectByPrimaryKey(id);
        if (null == original) {
            throw new RuntimeException("融资矩阵信息不存在，请核查");
        }
        LoanCompanyFinance info = new LoanCompanyFinance();
        info.setId(id);
        info.setState(state);
        int i = loanCompanyFinanceMapper.updateByPrimaryKeySelective(info);
        if (i > 0) {
            // 异步日志处理
            publish(original, state);
            return true;
        }
        return false;
    }

    private void publish(LoanCompanyFinance info, Integer state) {
//        UserLogin userLogin = new UserLogin();
//        userLogin.setLoginId(1111L);


        UserLogin userLogin = (UserLogin) SecurityUtils.getSubject().getSession().getAttribute(BaseConstant.SESSION_USER);
        String desc;
        switch (state) {
            // 上报
            case BaseConstant.FINANCE_STATE_REPORTED:
                desc = "融资公司【" + info.getCompanyName() + "】，融资矩阵项目编号【" + info.getFinanceProject() + "】的融资矩阵已上报。";
                break;
            //区金融办通过
            case BaseConstant.FINANCE_STATE_APPROVE_TOWNSHIP:
                desc = "融资公司【" + info.getCompanyName() + "】，融资矩阵项目编号【" + info.getFinanceProject() + "】的融资矩阵区金融办已通过。";
                break;
            //市金融办通过
            case BaseConstant.FINANCE_STATE_APPROVE_CITY:
                desc = "融资公司【" + info.getCompanyName() + "】，融资矩阵项目编号【" + info.getFinanceProject() + "】的融资矩阵市金融办已通过。";
                break;
            default://拒绝
                desc = "融资公司【" + info.getCompanyName() + "】，融资矩阵项目编号【" + info.getFinanceProject() + "】的融资矩阵被拒绝。";
                break;
        }
        eventBusAdaptor.publish(new OperateLogEvent("t_loan_company_finance", desc, 1, userLogin.getLoginId()));
    }
}
