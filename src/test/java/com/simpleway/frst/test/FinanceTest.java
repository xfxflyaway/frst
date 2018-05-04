package com.simpleway.frst.test;

import com.alibaba.fastjson.JSON;
import com.simpleway.frst.controller.FinanceController;
import com.simpleway.frst.request.finance.FinanceForm;
import com.simpleway.frst.request.finance.FinanceQuery;
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
public class FinanceTest extends BaseTest {
    @Resource
    FinanceController controller;

    @Test
    public void addFinanceTest() throws Exception {
        FinanceForm f = new FinanceForm();
        f.setAreaId(1L);
        f.setFinanceName("南岸区金融办");
        f.setFinanceType(2);
        f.setRelaMan("张三");
        f.setRelaMobile("13333322222");
        JsonResult result = controller.add(f);
        System.out.println(JSON.toJSONString(result));

    }

    @Test
    public void updFinanceTest() throws Exception {
        FinanceForm f = new FinanceForm();
        f.setAreaId(1L);
        f.setFinanceName("南岸区金融办22");
        f.setFinanceType(2);
        f.setRelaMan("张三3");
        f.setRelaMobile("13333322222");
        f.setFinanceId(1507297716825308L);
        JsonResult result = controller.upd(f);
        System.out.println(JSON.toJSONString(result));

    }

    @Test
    public void delFinanceTest() throws Exception {
        JsonResult result = controller.del(1507297716825308L);
        System.out.println(JSON.toJSONString(result));
    }

    @Test
    public void getFinanceDetailTest() throws Exception {
        JsonResult result = controller.detail(1507298245103581L);
        System.out.println(JSON.toJSONString(result));
    }

    @Test
    public void pageTest() throws Exception {
        FinanceQuery query = new FinanceQuery();
//        query.setFinanceName("南岸");
        JsonResult result = controller.page(query);
        System.out.println(JSON.toJSONString(result));
    }

    @Test
    public void listByTypeTest() throws Exception {
        JsonResult result = controller.listByType(1);
        System.out.println(JSON.toJSONString(result));
    }

}
