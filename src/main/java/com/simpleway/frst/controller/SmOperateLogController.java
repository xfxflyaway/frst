package com.simpleway.frst.controller;

import com.github.pagehelper.Page;
import com.simpleway.frst.request.operatelog.OperateLogQuery;
import com.simpleway.frst.response.JsonPage;
import com.simpleway.frst.response.JsonResult;
import com.simpleway.frst.service.SmOperateLogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author xiongfeixiang
 * @title SmOperateLogController
 * @date 2017/10/3 20:51
 * @since v1.0.0
 */

@RestController
@RequestMapping("/frst/smOperateLog")
public class SmOperateLogController {

    private static Logger logger = LoggerFactory.getLogger(SmOperateLogController.class);

    @Resource
    private SmOperateLogService smOperateLogService;

    @RequestMapping(value = "/page")
    public JsonResult page(OperateLogQuery query) throws Exception {
        Page page = smOperateLogService.getSmOperateLog(query);
        return new JsonResult(true,new JsonPage(page));
    }

}
