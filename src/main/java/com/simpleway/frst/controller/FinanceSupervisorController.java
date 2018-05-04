package com.simpleway.frst.controller;

import com.github.pagehelper.Page;
import com.simpleway.frst.domain.dto.FinanceSupervisor;
import com.simpleway.frst.request.finance.FinanceSupervisorForm;
import com.simpleway.frst.request.finance.FinanceSupervisorQuery;
import com.simpleway.frst.response.JsonPage;
import com.simpleway.frst.response.JsonResult;
import com.simpleway.frst.service.FinanceSupervisorService;
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
 * @date 2017/9/28 9:57
 * @since v1.0.0
 */
@RestController
@RequestMapping("/frst/financeSupervisor")
public class FinanceSupervisorController {
    private static Logger logger = LoggerFactory.getLogger(FinanceSupervisorController.class);

    @Resource
    private FinanceSupervisorService financeSupervisorService;

    @RequestMapping(value = "/add")
    public JsonResult add(@Valid FinanceSupervisorForm financeSupervisor) throws Exception {
        Boolean result = financeSupervisorService.addFianceSupervisor(financeSupervisor);
        return new JsonResult(result);
    }

    @RequestMapping(value = "/upd")
    public JsonResult upd(@Valid FinanceSupervisorForm financeSupervisor) throws Exception {
        Boolean result = financeSupervisorService.updFianceSupervisor(financeSupervisor);
        return new JsonResult(result);
    }

    @RequestMapping(value = "/del")
    public JsonResult del(Long id) throws Exception {
        PreconditionsUtil.checkNotNull(id, "id can not be empty");
        Boolean result = financeSupervisorService.delFianceSupervisor(id);
        return new JsonResult(result);
    }
    @RequestMapping(value = "/detail")
    public JsonResult detail(Long id) throws Exception {
        PreconditionsUtil.checkNotNull(id, "id can not be empty");
        FinanceSupervisor result = financeSupervisorService.getFianceSupervisorDetail(id);
        return new JsonResult(true,result);
    }

    @RequestMapping(value = "/page")
    public JsonResult page(FinanceSupervisorQuery query) throws Exception {
        Page page = financeSupervisorService.getFinanceSupervisor(query);
        return new JsonResult(true, new JsonPage(page));
    }
}
