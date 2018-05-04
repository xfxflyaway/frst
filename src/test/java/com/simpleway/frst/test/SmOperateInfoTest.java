package com.simpleway.frst.test;

import com.alibaba.fastjson.JSON;
import com.simpleway.frst.controller.SmOperateLogController;
import com.simpleway.frst.request.operatelog.OperateLogQuery;
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
public class SmOperateInfoTest extends BaseTest {
    @Resource
    SmOperateLogController controller;



    @Test
    public void pageTest() throws Exception {
        OperateLogQuery query = new OperateLogQuery();
        JsonResult result = controller.page(query);
        System.out.println(JSON.toJSONString(result));
    }



}
