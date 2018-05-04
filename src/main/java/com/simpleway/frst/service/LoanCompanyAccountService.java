package com.simpleway.frst.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.simpleway.frst.base.BaseConstant;
import com.simpleway.frst.domain.dto.LoanCompanyAccount;
import com.simpleway.frst.domain.dto.LoanCompanyAccountExample;
import com.simpleway.frst.domain.dto.LoanCompanyInfo;
import com.simpleway.frst.domain.vo.CompanyAccountAdditionalVo;
import com.simpleway.frst.mapper.LoanCompanyAccountMapper;
import com.simpleway.frst.mapper.LoanCompanyInfoMapper;
import com.simpleway.frst.request.company.LoanCompanyAccountForm;
import com.simpleway.frst.request.company.LoanCompanyAccountQuery;
import com.simpleway.frst.util.SequenceUtil;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author xiongfeixiang
 * @title LoanCompanyAccountService
 * @date 2017/9/29 10:47
 * @since v1.0.0
 */
@Service
public class LoanCompanyAccountService {
    private static Logger logger = LoggerFactory.getLogger(LoanCompanyAccountService.class);

    @Resource
    LoanCompanyAccountMapper loanCompanyAccountMapper;
    @Resource
    LoanCompanyService loanCompanyService;
    @Resource
    LoanCompanyInfoMapper companyInfoMapper;

    public Boolean addLoanCompanyAccount(LoanCompanyAccountForm companyAccountForm) throws Exception {

        LoanCompanyAccount account = new LoanCompanyAccount();
        BeanUtils.copyProperties(account, companyAccountForm);
        account.setAccountId(SequenceUtil.getSeqId());
        if (companyAccountForm.getCompanyId() == null) {
            LoanCompanyInfo companyInfo = loanCompanyService.getCompanyByLogin();
            if (null == companyInfo) {
                throw new RuntimeException("当前登录用户不属于任何公司，不能创建公司账户");
            }
            account.setCompanyId(companyInfo.getCompanyId());
            account.setCompanyName(companyInfo.getCompanyName());
        }

        return loanCompanyAccountMapper.insertSelective(account) > 0;
    }

    public Boolean updLoanCompanyAccount(LoanCompanyAccountForm companyAccountForm) throws Exception {
        LoanCompanyAccount account = new LoanCompanyAccount();
        BeanUtils.copyProperties(account, companyAccountForm);
        return loanCompanyAccountMapper.updateByPrimaryKeySelective(account) > 0;
    }

    public Boolean delLoanCompanyAccount(Long id) {
        //逻辑删除
        LoanCompanyAccount account = new LoanCompanyAccount();
        account.setAccountId(id);
        account.setState(BaseConstant.INVALID);
        return loanCompanyAccountMapper.updateByPrimaryKeySelective(account) > 0;
    }

    public Page getLoanCompanyAccount(LoanCompanyAccountQuery query) throws Exception {
        Page<LoanCompanyAccount> page = PageHelper.startPage(query.getPageNo(), query.getPageSize());
        LoanCompanyAccountExample example = new LoanCompanyAccountExample();
        LoanCompanyAccountExample.Criteria c = example.createCriteria();
        //默认有效
//        c.andStateEqualTo(BaseConstant.VALID);
        if (query.getAccountProperty() != null) {
            c.andAccountPropertyEqualTo(query.getAccountProperty());
        }
        if (StringUtils.isNotBlank(query.getBank())) {
            c.andBankEqualTo(query.getBank());
        }
        if (StringUtils.isNotBlank(query.getBankAccount())) {
            c.andBankAccountEqualTo(query.getBankAccount());
        }
        if (query.getCompanyId() != null) {
            c.andCompanyIdEqualTo(query.getCompanyId());
        }
        if (StringUtils.isNotBlank(query.getCompanyName())) {
            c.andCompanyNameLike("%" + query.getCompanyName() + "%");
        }

        loanCompanyAccountMapper.selectByExample(example);

        return getAdditionalPage(page);

    }

    private Page getAdditionalPage(Page<LoanCompanyAccount> page) throws Exception {
        Page<CompanyAccountAdditionalVo> additionalPage = new Page();
        BeanUtils.copyProperties(additionalPage, page);
        page.stream().forEach(account -> {
            CompanyAccountAdditionalVo vo = new CompanyAccountAdditionalVo();
            vo.setAccount(account);
            //设置公司信息
//            LoanCompanyInfo companyInfo = loanCompanyService.getCompanyByLogin();
            LoanCompanyInfo companyInfo = companyInfoMapper.selectByPrimaryKey(1507798719355071L);
            vo.setCompanyInfo(companyInfo);
            additionalPage.add(vo);
        });

        return additionalPage;
    }


    public List<Map<String, Object>> getAreaCompanyInfo() {
        return loanCompanyAccountMapper.getAreaCompanyInfo();
    }

    public Boolean updLoanCompanyAccountState(Long id, Integer state) {
        LoanCompanyAccount orign = loanCompanyAccountMapper.selectByPrimaryKey(id);
        if (orign == null) {
            throw new RuntimeException("根据ID:" + id + " 查询小贷公司账户返回空");
        }
        orign.setState(state);
        int i = loanCompanyAccountMapper.updateByPrimaryKeySelective(orign);
        return i > 0;
    }
}

