package com.simpleway.frst.controller;

import com.github.pagehelper.Page;
import com.simpleway.frst.request.bank.BankFlowForm;
import com.simpleway.frst.request.bank.BankFlowQuery;
import com.simpleway.frst.response.JsonPage;
import com.simpleway.frst.response.JsonResult;
import com.simpleway.frst.service.BankFlowService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * @author xiongfeixiang
 * @title BankFlowController
 * @date 2017/10/2 12:44
 * @since v1.0.0
 */
@RestController
@RequestMapping("/frst/bankFlow")
public class BankFlowController {

    private static Logger logger = LoggerFactory.getLogger(BankFlowController.class);

    @Resource
    BankFlowService bankFlowService;

    @RequestMapping(value = "/add")
    public JsonResult add(@Valid BankFlowForm bankFlowForm) throws Exception {
        Boolean result = bankFlowService.addBankFlow(bankFlowForm);
        return new JsonResult(result);
    }

    @RequestMapping(value = "/page")
    public JsonResult page(BankFlowQuery query) throws Exception {
        Page result = bankFlowService.getBankFlow(query);
        return new JsonResult(true, new JsonPage(result));
    }
}
