package com.simpleway.frst.controller;

import com.github.pagehelper.Page;
import com.simpleway.frst.request.warn.WarnQuery;
import com.simpleway.frst.response.JsonPage;
import com.simpleway.frst.response.JsonResult;
import com.simpleway.frst.service.WarnService;
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
@RequestMapping("/frst/warn")
public class WarnController {

    private static Logger logger = LoggerFactory.getLogger(WarnController.class);

    @Resource
    private WarnService warnService;

    @RequestMapping(value = "/page")
    public JsonResult page(@Valid WarnQuery query) throws Exception {
        Page page = warnService.getWarn(query);
        return new JsonResult(true,new JsonPage(page));
    }
}
