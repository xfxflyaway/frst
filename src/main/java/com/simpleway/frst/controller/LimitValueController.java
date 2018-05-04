package com.simpleway.frst.controller;

import java.util.Map;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simpleway.frst.request.limitvalue.LimitValueForm;
import com.simpleway.frst.response.JsonResult;
import com.simpleway.frst.service.LimitValueService;

/**
 * @author xiongfeixiang
 * @title BankFlowController
 * @date 2017/10/14 12:44
 * @since v1.0.0
 */
@RestController
@RequestMapping("/frst/limitValue")
public class LimitValueController {

    private static Logger logger = LoggerFactory.getLogger(LimitValueController.class);

    @Resource
    LimitValueService limitValueService;

    @RequestMapping(value = "/addOrUpd")
    public JsonResult addOrUpd(@Valid LimitValueForm form) throws Exception {
        Boolean result = limitValueService.addOrUpd(form);
        return new JsonResult(result);
    }

    @RequestMapping(value = "/get")
    public JsonResult get() throws Exception {
        Map map = limitValueService.getLimitValue();
        return new JsonResult(true, map);
    }
}
