package com.simpleway.frst.test;

import com.alibaba.fastjson.JSON;
import com.simpleway.frst.controller.FinanceSupervisorController;
import com.simpleway.frst.request.finance.FinanceSupervisorForm;
import com.simpleway.frst.request.finance.FinanceSupervisorQuery;
import com.simpleway.frst.response.JsonResult;
import org.junit.Test;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;

/**
 * @author xiongfeixiang
 * @title FinanceTest
 * @date 2017/10/6 21:21
 * @since v1.0.0
 */
@WebAppConfiguration
public class FinanceSupervisorTest extends BaseTest {
    @Resource
    FinanceSupervisorController controller;

    @Test
    public void addFinanceSupervisorTest() throws Exception {
        FinanceSupervisorForm f = new FinanceSupervisorForm();
        f.setFinanceId(1507298245103581L);
        f.setSupervisorName("tsest");
        f.setTelephone("13355528282");
        JsonResult result = controller.add(f);
        System.out.println(JSON.toJSONString(result));

    }

    @Test
    public void updFinanceSupervisorTest() throws Exception {
        FinanceSupervisorForm f = new FinanceSupervisorForm();
        f.setFinanceId(1507298245103581L);
        f.setSupervisorName("tsest22222");
        f.setTelephone("13355528282");
        f.setId(1507344647876171L);
        JsonResult result = controller.upd(f);
        System.out.println(JSON.toJSONString(result));

    }

    @Test
    public void delFinanceSupervisorTest() throws Exception {
        JsonResult result = controller.del(1507344647876171L);
        System.out.println(JSON.toJSONString(result));
    }
    @Test
    public void getFinanceSupervisorDetailTest() throws Exception {
        JsonResult result = controller.detail(1507707642235289L);
        System.out.println("------------"+JSON.toJSONString(result));
    }

    @Test
    public void pageTest() throws Exception {
        FinanceSupervisorQuery query = new FinanceSupervisorQuery();
//        query.setSupervisorName("est");
        JsonResult result = controller.page(query);
        System.out.println(JSON.toJSONString(result));
    }

}
