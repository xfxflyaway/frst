package com.simpleway.frst.controller;

import com.simpleway.frst.domain.dto.SmConstType;
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
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/frst/const/constType")
public class ConstTypeController {

    @Autowired
    private ConstService constService;

    /**
     * 新增静态值类型信息
     *
     * @param smConstType
     * @return
     */
    @RequestMapping(value = "/add", method = {RequestMethod.POST})
    public JsonResult addConstType(SmConstType smConstType) {
        try {
            constService.addConstType(smConstType);
            return new JsonResult(true);
        } catch (Exception e) {
            LogTool.error(ConstTypeController.class, "----新增静态值类型信息失败----", e);
            return new JsonResult(false);
        }
    }

    /**
     * 修改静态类型信息
     *
     * @param smConstType
     * @return
     */
    @RequestMapping(value = "/update", method = {RequestMethod.POST})
    public JsonResult updateConstType(SmConstType smConstType) {
        try {
            constService.updateConstType(smConstType);
            return new JsonResult(true);
        } catch (Exception e) {
            LogTool.error(ConstTypeController.class, "----修改静态类型信息失败----", e);
            return new JsonResult(false);
        }
    }

    /**
     * 获取静态类型对象
     *
     * @param constTypeId
     * @return
     */
    @RequestMapping(value = "/getById", method = {RequestMethod.POST})
    public JsonResult getConstType(Long constTypeId) {
        SmConstType result = constService.getConstType(constTypeId);
        if (null != result) {
            return new JsonResult(true, result);
        } else {
            return new JsonResult(false);
        }
    }

    /**
     * 根據静态值类型編碼 獲得靜態值
     *
     * @return
     */
    @RequestMapping(value = "/getConstValuesByCode")
    public JsonResult getConstValuesByCode(String code) {
        List<SmConstValue> result = constService.getConstValuesByCode(code);
        if (null != result) {
            return new JsonResult(true, result);
        } else {
            return new JsonResult(false);
        }
    }

    /**
     * 分页查询静态类型信息
     *
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public JsonResult findConstTypeByParam(@RequestParam Map<String, String> params) {
        JsonResult jr = null;
        try {
            JsonPage<SmConstType> jsonPage = constService.pageConstType(params);
            jr = new JsonResult(true, jsonPage);
        } catch (Exception e) {
            LogTool.error(ConstTypeController.class, "----分页查询静态类型信息失败----", e);
            jr = new JsonResult(false);
        }
        return jr;
    }

    /**
     * 删除静态类型信息
     *
     * @param constTypeId
     * @return
     */
    @RequestMapping(value = "/delete", method = {RequestMethod.POST})
    public JsonResult deleteConstType(Long constTypeId) {
        try {
            constService.deleteConstType(constTypeId);
            // 删除静态类型 会把相应的静态值删掉
            constService.deleteConstValueByTypeId(constTypeId);
            return new JsonResult(true);
        } catch (Exception e) {
            LogTool.error(ConstTypeController.class, "----删除静态类型信息失败----", e);
            return new JsonResult(false);
        }
    }

    @RequestMapping(value = "/view")
    public ModelAndView pageRoleList(HttpServletRequest request) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("views/system/const");
        return mv;
    }


}
