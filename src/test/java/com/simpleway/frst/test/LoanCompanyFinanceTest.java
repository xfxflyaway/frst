package com.simpleway.frst.test;

import com.alibaba.fastjson.JSON;
import com.simpleway.frst.controller.LoanCompanyFinanceController;
import com.simpleway.frst.request.company.LoanCompanyFinanceForm;
import com.simpleway.frst.request.company.LoanCompanyFinanceQuery;
import com.simpleway.frst.response.JsonResult;
import org.junit.Test;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;

/**
 * @author xiongfeixiang
 * @title LoanCompanyFinanceTest
 * @date 2017/10/7 13:10
 * @since v1.0.0
 */
@WebAppConfiguration
public class LoanCompanyFinanceTest extends BaseTest {

    @Resource
    LoanCompanyFinanceController controller;

    @Test
    public void addTest() throws Exception {
        LoanCompanyFinanceForm f = new LoanCompanyFinanceForm();
        f.setFinanceProject("abc11222");
        f.setFinanceAccount("62228828192381972");
        JsonResult result = controller.add(f);
        System.out.println(JSON.toJSONString(result));
    }
    @Test
    public void updTest() throws Exception {
        LoanCompanyFinanceForm f = new LoanCompanyFinanceForm();
        f.setFinanceProject("ab22");
        f.setFinanceAccount("62228828192381972");
        f.setId(1507353351173375L);
        JsonResult result = controller.upd(f);
        System.out.println(JSON.toJSONString(result));
    }
    @Test
    public void delTest() throws Exception {
        JsonResult result = controller.del(1507353351173375L);
        System.out.println(JSON.toJSONString(result));
    }


    @Test
    public void pageTest() throws Exception {
        LoanCompanyFinanceQuery f = new LoanCompanyFinanceQuery();
//        f.setFinanceProject("abc11222");
//        f.setFinanceAccount("62228828192381972");
        JsonResult result = controller.page(f);
        System.out.println(JSON.toJSONString(result));
    }
    @Test
    public void updStateTest() throws Exception {
        JsonResult result = controller.updState(1508759599852311L,2);
        System.out.println(JSON.toJSONString(result));
    }
}
