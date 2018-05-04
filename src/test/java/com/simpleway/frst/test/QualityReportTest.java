package com.simpleway.frst.test;

import com.alibaba.fastjson.JSON;
import com.simpleway.frst.controller.QualityReportController;
import com.simpleway.frst.request.qualityreport.QualityReportQuery;
import com.simpleway.frst.response.JsonResult;
import org.junit.Test;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @author xiongfeixiang
 * @title WarnTest
 * @date 2017/10/7 16:47
 * @since v1.0.0
 */
@WebAppConfiguration
public class QualityReportTest extends  BaseTest{

    @Resource
    QualityReportController controller;
    @Test
    public void listTest() throws  Exception{
        QualityReportQuery query = new QualityReportQuery();
        query.setCreateTimeStart(new Date());
        JsonResult page = controller.listByCondition(query);
        System.out.println("-----------------"+JSON.toJSONString(page));
    }


}
