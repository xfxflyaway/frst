package com.simpleway.frst.test;

import com.alibaba.fastjson.JSON;
import com.simpleway.frst.controller.LimitValueController;
import com.simpleway.frst.request.limitvalue.LimitValueForm;
import com.simpleway.frst.response.JsonResult;
import org.junit.Test;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;

/**
 * @author xiongfeixiang
 * @title AreaTest
 * @date 2017/10/10 21:21
 * @since v1.0.0
 */
@WebAppConfiguration
public class LimitValueTest extends BaseTest {
    @Resource
    LimitValueController controller;


    @Test
    public void getTest() throws Exception {
        JsonResult result =  controller.get();
        System.out.println(JSON.toJSONString(result));
    }

    @Test
    public void addTest() throws Exception {
        LimitValueForm form = new LimitValueForm();
        form.setAccountBalanceMulti("1");
        form.setAmountMulti("1");
        form.setRecordFreq("1");
        JsonResult result =  controller.addOrUpd(form);
        System.out.println(JSON.toJSONString(result));
    }

}
