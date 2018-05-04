package com.simpleway.frst.controller;

import com.simpleway.frst.response.JsonResult;
import com.simpleway.frst.service.SmAreaService;
import com.simpleway.frst.util.PreconditionsUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author xiongfeixiang
 * @title SmAreaController
 * @date 2017/10/3 9:50
 * @since v1.0.0
 */

@RestController
@RequestMapping("/frst/area")
public class SmAreaController {

    private static Logger logger = LoggerFactory.getLogger(SmAreaController.class);

    @Resource
    SmAreaService smAreaService;

    @RequestMapping(value = "/getListById")
    public JsonResult getListById(Long id) throws Exception {
        PreconditionsUtil.checkNotNull(id,"id can not be null");
        List result = smAreaService.getListById(id);
        return new JsonResult(true,result);
    }

}
