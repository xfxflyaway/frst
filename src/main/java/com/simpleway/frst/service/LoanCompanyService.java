package com.simpleway.frst.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.simpleway.frst.base.BaseConstant;
import com.simpleway.frst.domain.dto.LoanCompanyInfo;
import com.simpleway.frst.domain.dto.LoanCompanyInfoExample;
import com.simpleway.frst.domain.dto.SmArea;
import com.simpleway.frst.domain.dto.UserLogin;
import com.simpleway.frst.domain.vo.LoanCompanyInfoVo;
import com.simpleway.frst.mapper.LoanCompanyInfoMapper;
import com.simpleway.frst.mapper.SmAreaMapper;
import com.simpleway.frst.request.company.LoanCompanyForm;
import com.simpleway.frst.request.company.LoanCompanyQuery;
import com.simpleway.frst.util.SequenceUtil;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author xiongfeixiang
 * @title LoanCompanyService
 * @date 2017/9/29 10:04
 * @since v1.0.0
 */
@Service
public class LoanCompanyService {
    @Resource
    LoanCompanyInfoMapper loanCompanyInfoMapper;

    @Resource
    SmAreaMapper areaMapper;


    public LoanCompanyInfo getCompanyByLogin() {
        UserLogin userLogin = (UserLogin) SecurityUtils.getSubject().getSession().getAttribute(BaseConstant.SESSION_USER);
        LoanCompanyInfo companyInfo = loanCompanyInfoMapper.selectByPrimaryKey(userLogin.getInstitutionId());
        if (null == companyInfo) {
            throw new RuntimeException("当前登录用户不属于任何公司，不能创建公司账户");
        }
        return companyInfo;
    }

    public String getCompanyById(Long id) {
        LoanCompanyInfo companyInfo = loanCompanyInfoMapper.selectByPrimaryKey(id);
        if (null == companyInfo) {
            return null;
        }
        return companyInfo.getCompanyName();
    }

    public Boolean addLoanCompany(LoanCompanyForm companyForm) throws Exception {
        LoanCompanyInfo record = new LoanCompanyInfo();
        BeanUtils.copyProperties(record, companyForm);
        record.setCompanyId(SequenceUtil.getSeqId());
        int r = loanCompanyInfoMapper.insertSelective(record);
        return r > 0;
    }

    public Boolean updLoanCompany(LoanCompanyForm companyForm) throws Exception {
        LoanCompanyInfo record = new LoanCompanyInfo();
        BeanUtils.copyProperties(record, companyForm);
        int r = loanCompanyInfoMapper.updateByPrimaryKeySelective(record);
        return r > 0;
    }

    public Boolean delLoanCompany(Long id) throws Exception {
        return loanCompanyInfoMapper.deleteByPrimaryKey(id) > 0;
    }

    public Page getLoanCompany(LoanCompanyQuery query) throws Exception {
        Page<LoanCompanyInfo> page = PageHelper.startPage(query.getPageNo(), query.getPageSize());
        LoanCompanyInfoExample example = new LoanCompanyInfoExample();
        example.setOrderByClause("create_time desc");
        LoanCompanyInfoExample.Criteria c = example.createCriteria();
        if (query.getAreaId() != null) {
            c.andAreaIdEqualTo(query.getAreaId());
        }

        if (StringUtils.isNotBlank(query.getCompanyName())) {
            c.andCompanyNameLike("%" + query.getCompanyName() + "%");
        }

        if (StringUtils.isNotBlank(query.getRegisteredCapital())) {
            c.andRegisteredCapitalEqualTo(query.getRegisteredCapital());
        }

        if (StringUtils.isNotBlank(query.getRelaMan())) {
            c.andRelaManLike("%" + query.getRelaMan() + "%");
        }
        if (StringUtils.isNotBlank(query.getRelaMobile())) {
            c.andRelaMobileLike("%" + query.getRelaMobile() + "%");
        }

        loanCompanyInfoMapper.selectByExample(example);
        Page<LoanCompanyInfoVo> voPage = new Page<>();
        BeanUtils.copyProperties(voPage, page);
        voPage.setTotal(page.getTotal());
        for (LoanCompanyInfo info : page) {
            LoanCompanyInfoVo vo = new LoanCompanyInfoVo();
            BeanUtils.copyProperties(vo, info);

            SmArea area = areaMapper.selectByPrimaryKey(info.getAreaId());
            if (null != area && StringUtils.isNotBlank(area.getAreaName())) {
                vo.setAreaName(area.getAreaName());
            }
            voPage.add(vo);
        }

        return voPage;
    }

    public LoanCompanyInfoVo getLoanCompanyDetail(Long id) throws Exception {
        LoanCompanyInfo info = loanCompanyInfoMapper.selectByPrimaryKey(id);
        if (null == info) {
            throw new RuntimeException("根据id：" + id + "查询出的金融公司信息为空");
        }
        LoanCompanyInfoVo vo = new LoanCompanyInfoVo();
        BeanUtils.copyProperties(vo, info);
        SmArea area = areaMapper.selectByPrimaryKey(info.getAreaId());
        if (null != area && StringUtils.isNotBlank(area.getAreaName())) {
            vo.setAreaName(area.getAreaName());
        }
        return vo;
    }

    public List getAllCompany() {
        return loanCompanyInfoMapper.selectByExample(new LoanCompanyInfoExample());
    }

    /**
     * 获取区金融办下的所有公司id集合
     *
     * @param areaId
     * @return
     */
    public List<Long> getCompanyIdByAreaId(Long areaId) {
        LoanCompanyInfoExample example = new LoanCompanyInfoExample();
        example.createCriteria().andAreaIdEqualTo(areaId);
        List<LoanCompanyInfo> list = loanCompanyInfoMapper.selectByExample(example);
        return list.stream()
                .map(LoanCompanyInfo::getCompanyId)
                .collect(Collectors.toList());

    }
}
