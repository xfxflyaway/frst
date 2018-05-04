package com.simpleway.frst.test;

import com.alibaba.fastjson.JSON;
import com.simpleway.frst.controller.WarnController;
import com.simpleway.frst.request.warn.WarnQuery;
import com.simpleway.frst.response.JsonResult;
import org.junit.Test;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;

/**
 * @author xiongfeixiang
 * @title WarnTest
 * @date 2017/10/7 16:47
 * @since v1.0.0
 */
@WebAppConfiguration
public class WarnTest extends  BaseTest{

    @Resource
    WarnController controller;
    @Test
    public void pageTest() throws  Exception{
        WarnQuery query = new WarnQuery();
        query.setCompanyName("1");
        JsonResult page = controller.page(query);
        System.out.println(JSON.toJSONString(page));
    }


}
