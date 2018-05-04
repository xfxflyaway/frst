package com.simpleway.frst.controller;

import com.github.pagehelper.Page;
import com.simpleway.frst.domain.dto.FinanceInfo;
import com.simpleway.frst.request.finance.FinanceForm;
import com.simpleway.frst.request.finance.FinanceQuery;
import com.simpleway.frst.response.JsonPage;
import com.simpleway.frst.response.JsonResult;
import com.simpleway.frst.service.FinanceService;
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
 * @date 2017/9/28 9:57
 * @since v1.0.0
 */


@RestController
@RequestMapping("/frst/finance")
public class FinanceController {
    private static Logger logger = LoggerFactory.getLogger(FinanceController.class);

    @Resource
    private FinanceService financeService;

    @RequestMapping(value = "/add")
    public JsonResult add(@Valid FinanceForm finance) throws Exception {
        Boolean result = financeService.addFiance(finance);
        return new JsonResult(result);
    }

    @RequestMapping(value = "/upd")
    public JsonResult upd(@Valid FinanceForm finance) throws Exception {
        Boolean result = financeService.updFiance(finance);
        return new JsonResult(result);
    }

    @RequestMapping(value = "/del")
    public JsonResult del(Long id) throws Exception {
        PreconditionsUtil.checkNotNull(id, "id can not be empty");
        Boolean result = financeService.delFiance(id);
        return new JsonResult(result);
    }

    @RequestMapping(value = "/detail")
    public JsonResult detail(Long id) throws Exception {
        PreconditionsUtil.checkNotNull(id, "id can not be empty");
        FinanceInfo info = financeService.getFianceDetail(id);
        return new JsonResult(true,info);
    }


    @RequestMapping(value = "/page")
    public JsonResult page(FinanceQuery query) throws Exception{
        Page page = financeService.getFinance(query);
        return new JsonResult(true, new JsonPage(page));
    }

    @RequestMapping(value = "/listByType")
    public JsonResult listByType(Integer type) {
        PreconditionsUtil.checkNotNull(type, "type can not be empty");
        List resultList = financeService.listByType(type);
        return new JsonResult(true, resultList);
    }


}
