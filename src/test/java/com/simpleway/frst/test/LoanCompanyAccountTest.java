package com.simpleway.frst.test;

import com.alibaba.fastjson.JSON;
import com.simpleway.frst.controller.LoanCompanyAccountController;
import com.simpleway.frst.request.company.LoanCompanyAccountForm;
import com.simpleway.frst.request.company.LoanCompanyAccountQuery;
import com.simpleway.frst.response.JsonResult;
import org.junit.Test;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;

/**
 * @author xiongfeixiang
 * @title LoanCompanyAccountTest
 * @date 2017/10/7 12:15
 * @since v1.0.0
 */
@WebAppConfiguration
public class LoanCompanyAccountTest extends BaseTest {

    @Resource
    LoanCompanyAccountController controller;

    @Test
    public void addTest() throws Exception {
        LoanCompanyAccountForm f = new LoanCompanyAccountForm();
        f.setAccountProperty(1);
        f.setBank("ICBC");
        f.setBankAccount("6339393999999999");
        f.setCompanyId(1l);
        f.setCompanyName("xxxcompany");
        f.setRemark(" this is remark");
        JsonResult result = controller.add(f);
        System.out.println(JSON.toJSONString(result));
    }

    @Test
    public void updTest() throws Exception {
        LoanCompanyAccountForm f = new LoanCompanyAccountForm();
        f.setAccountProperty(1);
        f.setBank("ICBC2222");
        f.setBankAccount("6339393999999999");
        f.setCompanyId(1l);
        f.setCompanyName("xxxcompany");
        f.setRemark(" this is remark");
        f.setAccountId(1507350186661567L);
        JsonResult result = controller.upd(f);
        System.out.println(JSON.toJSONString(result));
    }

    @Test
    public void updStateTest() throws Exception {
        JsonResult result = controller.updState(1507521705091920L,0);
        System.out.println("-----------"+JSON.toJSONString(result));
    }


    @Test
    public void pageTest() throws Exception {
        LoanCompanyAccountQuery f = new LoanCompanyAccountQuery();
//        f.setAccountProperty(1);
//        f.setBank("ICBC");
//        f.setBankAccount("6339393999999999");
//        f.setCompanyId(1l);
//        f.setCompanyName("xxxcompany");
        JsonResult result = controller.page(f);
        System.out.println(JSON.toJSONString(result));
    }

    @Test
    public void delTest() throws Exception {
        JsonResult result = controller.del(1507350186661567L);
        System.out.println(JSON.toJSONString(result));
    }
}
