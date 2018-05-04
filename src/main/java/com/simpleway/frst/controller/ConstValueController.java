package com.simpleway.frst.controller;

import com.simpleway.frst.domain.dto.SmConstValue;
import com.simpleway.frst.response.JsonPage;
import com.simpleway.frst.response.JsonResult;
import com.simpleway.frst.service.ConstService;
import com.yuntu.commons.log.LogTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/frst/const/constValue")
public class ConstValueController {

    @Autowired
    private ConstService constService;

    /**
     * 获取静态值对象
     *
     * @param constValueId
     * @return
     */
    @RequestMapping(value = "/getById", method = {RequestMethod.POST})
    public JsonResult getConstValue(Long constValueId) {
        SmConstValue result = constService.getConstValue(constValueId);
        if (null != result) {
            return new JsonResult(true, result);
        } else {
            return new JsonResult(false);
        }
    }


    /**
     * 新增静态值信息
     *
     * @param
     * @return
     */
    @RequestMapping(value = "/add", method = {RequestMethod.POST})
    public JsonResult addConstValue(SmConstValue smConstValue) {
        try {
            constService.addConstValue(smConstValue);
            return new JsonResult(true);
        } catch (Exception e) {
            LogTool.error(ConstValueController.class, "----新增静态值信息失败----", e);
            return new JsonResult(false);
        }
    }

    /**
     * 修改静态值信息
     *
     * @param
     * @return
     */
    @RequestMapping(value = "/update", method = {RequestMethod.POST})
    public JsonResult updateConstValue(SmConstValue smConstValue) {
        try {
            constService.updateConstValue(smConstValue);
            return new JsonResult(true);
        } catch (Exception e) {
            LogTool.error(ConstValueController.class, "----修改静态值信息失败----", e);
            return new JsonResult(false);
        }
    }

    /**
     * 删除静态值信息
     *
     * @param constTypeId
     * @return
     */
    @RequestMapping(value = "/delete", method = {RequestMethod.POST})
    public JsonResult deleteConstValue(Long constValueId) {
        try {
            constService.deleteConstValue(constValueId);
            return new JsonResult(true);
        } catch (Exception e) {
            LogTool.error(ConstValueController.class, "----删除静态值信息失败----", e);
            return new JsonResult(false);
        }
    }

    /**
     * 根据静态类型id分页查询静态值信息
     *
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public JsonResult findConstValueByParam(@RequestParam Map<String, String> params) {
        JsonResult jr = null;
        try {
            JsonPage<SmConstValue> jsonPage = constService.pageConstValue(params);
            jr = new JsonResult(true, jsonPage);
        } catch (Exception e) {
            LogTool.error(ConstValueController.class, "----根据静态类型id分页查询静态值信息失败----", e);
            jr = new JsonResult(false);
        }
        return jr;
    }
}
