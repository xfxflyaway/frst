package com.simpleway.frst.controller;

import com.github.pagehelper.Page;
import com.simpleway.frst.domain.vo.LoanCompanyInfoVo;
import com.simpleway.frst.request.company.LoanCompanyForm;
import com.simpleway.frst.request.company.LoanCompanyQuery;
import com.simpleway.frst.response.JsonPage;
import com.simpleway.frst.response.JsonResult;
import com.simpleway.frst.service.LoanCompanyService;
import com.simpleway.frst.util.PreconditionsUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

/**
 * @author xiongfeixiang
 * @title FinanceController
 * @date 2017/9/29 9:50
 * @since v1.0.0
 */
@RestController
@RequestMapping("/frst/loanCompany")
public class LoanCompanyController {
    private static Logger logger = LoggerFactory.getLogger(LoanCompanyController.class);

    @Resource
    private LoanCompanyService loanCompanyService;

    @RequestMapping(value = "/add")
    public JsonResult add(@Valid LoanCompanyForm companyForm) throws Exception {
        Boolean result = loanCompanyService.addLoanCompany(companyForm);
        return new JsonResult(result);
    }

    @RequestMapping(value = "/upd")
    public JsonResult upd(@Valid LoanCompanyForm companyForm) throws Exception {
        Boolean result = loanCompanyService.updLoanCompany(companyForm);
        return new JsonResult(result);
    }

    @RequestMapping(value = "/del")
    public JsonResult del(Long id) throws Exception {
        PreconditionsUtil.checkNotNull(id, "id can not be empty");
        Boolean result = loanCompanyService.delLoanCompany(id);
        return new JsonResult(result);
    }

    @RequestMapping(value = "/detail")
    public JsonResult detail(Long id) throws Exception {
        PreconditionsUtil.checkNotNull(id, "id can not be empty");
        LoanCompanyInfoVo result = loanCompanyService.getLoanCompanyDetail(id);
        return new JsonResult(true, result);
    }


    @RequestMapping(value = "/page")
    public JsonResult page(LoanCompanyQuery query) throws Exception {
        Page page = loanCompanyService.getLoanCompany(query);
        return new JsonResult(true, new JsonPage(page));
    }

    @RequestMapping(value = "/getAll")
    public JsonResult getAll() throws Exception {
        List resultList = loanCompanyService.getAllCompany();
        return new JsonResult(true,resultList);
    }
}
