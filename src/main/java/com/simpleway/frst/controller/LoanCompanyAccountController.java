package com.simpleway.frst.controller;

import com.github.pagehelper.Page;
import com.simpleway.frst.request.company.LoanCompanyAccountForm;
import com.simpleway.frst.request.company.LoanCompanyAccountQuery;
import com.simpleway.frst.response.JsonPage;
import com.simpleway.frst.response.JsonResult;
import com.simpleway.frst.service.LoanCompanyAccountService;
import com.simpleway.frst.util.PreconditionsUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * @author xiongfeixiang
 * @title FinanceController
 * @date 2017/9/29 9:50
 * @since v1.0.0
 */
@RestController
@RequestMapping("/frst/loanCompanyAccount")
public class LoanCompanyAccountController {
    private static Logger logger = LoggerFactory.getLogger(LoanCompanyAccountController.class);

    @Resource
    private LoanCompanyAccountService loanCompanyAccountService;

    @RequestMapping(value = "/add")
    public JsonResult add(@Valid LoanCompanyAccountForm companyAccountForm) throws Exception {
        Boolean result = loanCompanyAccountService.addLoanCompanyAccount(companyAccountForm);
        return new JsonResult(result);
    }
    @RequestMapping(value = "/upd")
    public JsonResult upd(@Valid LoanCompanyAccountForm companyAccountForm) throws Exception {
        Boolean result = loanCompanyAccountService.updLoanCompanyAccount(companyAccountForm);
        return new JsonResult(result);
    }

    @RequestMapping(value = "/updState")
    public JsonResult updState(Long id,Integer state) throws Exception {
        PreconditionsUtil.checkNotNull(id, "id can not be empty");
        PreconditionsUtil.checkNotNull(id, "state can not be empty");
        Boolean result = loanCompanyAccountService.updLoanCompanyAccountState(id,state);
        return new JsonResult(result);
    }

    @RequestMapping(value = "/del")
    public JsonResult del(Long id) throws Exception {
        PreconditionsUtil.checkNotNull(id, "id can not be empty");
        Boolean result = loanCompanyAccountService.delLoanCompanyAccount(id);
        return new JsonResult(result);
    }

    @RequestMapping(value = "/page")
    public JsonResult page(LoanCompanyAccountQuery query) throws Exception {
        Page page = loanCompanyAccountService.getLoanCompanyAccount(query);
        return new JsonResult(true, new JsonPage(page));
    }




}
