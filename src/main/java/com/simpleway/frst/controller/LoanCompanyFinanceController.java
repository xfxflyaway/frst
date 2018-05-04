package com.simpleway.frst.controller;

import com.github.pagehelper.Page;
import com.simpleway.frst.request.company.LoanCompanyFinanceForm;
import com.simpleway.frst.request.company.LoanCompanyFinanceQuery;
import com.simpleway.frst.response.JsonPage;
import com.simpleway.frst.response.JsonResult;
import com.simpleway.frst.service.LoanCompanyFinanceService;
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
@RequestMapping("/frst/loanCompanyFinance")
public class LoanCompanyFinanceController {
    private static Logger logger = LoggerFactory.getLogger(LoanCompanyFinanceController.class);

    @Resource
    private LoanCompanyFinanceService loanCompanyFinanceService;

    @RequestMapping(value = "/add")
    public JsonResult add(@Valid LoanCompanyFinanceForm companyFinanceForm) throws Exception {
        Boolean result = loanCompanyFinanceService.addLoanCompanyFinance(companyFinanceForm);
        return new JsonResult(result);
    }

    @RequestMapping(value = "/upd")
    public JsonResult upd(@Valid LoanCompanyFinanceForm companyFinanceForm) throws Exception {
        Boolean result = loanCompanyFinanceService.updLoanCompanyFinance(companyFinanceForm);
        return new JsonResult(result);
    }

    @RequestMapping(value = "/del")
    public JsonResult del(Long id) throws Exception {
        PreconditionsUtil.checkNotNull(id, "id can not be empty");
        Boolean result = loanCompanyFinanceService.delLoanCompanyFinance(id);
        return new JsonResult(result);
    }

    @RequestMapping(value = "/page")
    public JsonResult page(LoanCompanyFinanceQuery query) throws Exception {
        Page page = loanCompanyFinanceService.getLoanCompanyFinance(query);
        return new JsonResult(true, new JsonPage(page));
    }

    @RequestMapping(value = "/updState")
    public JsonResult updState(Long id,Integer state) throws Exception {
        PreconditionsUtil.checkNotNull(id, "id can not be empty");
        PreconditionsUtil.checkNotNull(state, "state can not be empty");
        Boolean result = loanCompanyFinanceService.updState(id,state);
        return new JsonResult(result);
    }

}
