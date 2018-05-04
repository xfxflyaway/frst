package com.simpleway.frst.test;

import com.alibaba.fastjson.JSON;
import com.simpleway.frst.controller.LoanCompanyController;
import com.simpleway.frst.request.company.LoanCompanyForm;
import com.simpleway.frst.request.company.LoanCompanyQuery;
import com.simpleway.frst.response.JsonResult;
import org.junit.Test;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;

/**
 * @author xiongfeixiang
 * @title LoanCompanyTest
 * @date 2017/10/7 11:56
 * @since v1.0.0
 */
@WebAppConfiguration
public class LoanCompanyTest extends BaseTest {
    @Resource
    LoanCompanyController controller;

    @Test
    public void addTest() throws Exception {
        LoanCompanyForm f = new LoanCompanyForm();
        f.setCompanyName("xxxcompany");
        f.setAreaId(1l);
        f.setRegisteredCapital("50000000");
        f.setRelaMan("zhangsan");
        f.setRelaMobile("18999999999");
        JsonResult result = controller.add(f);
        System.out.println(JSON.toJSONString(result));
    }

    @Test
    public void updTest() throws Exception {
        LoanCompanyForm f = new LoanCompanyForm();
        f.setCompanyName("yyyyyyycompany");
        f.setAreaId(1l);
        f.setRegisteredCapital("500003000");
        f.setRelaMan("zlisi");
        f.setRelaMobile("18999922299");
        f.setCompanyId(1507349133285088L);
        JsonResult result = controller.upd(f);
        System.out.println(JSON.toJSONString(result));
    }

    @Test
    public void delTest() throws Exception {
        JsonResult result = controller.del(1507349133285088L);
        System.out.println(JSON.toJSONString(result));
    }

    @Test
    public void detailTest() throws Exception {
        JsonResult result = controller.detail(1507798719355071L);
        System.out.println(JSON.toJSONString(result));
    }

    @Test
    public void pageTest() throws Exception {
        LoanCompanyQuery q = new LoanCompanyQuery();
//        q.setCompanyName("company");
//        q.setRegisteredCapital("50");
        JsonResult result = controller.page(q);
        System.out.println(JSON.toJSONString(result));
    }
    @Test
    public void getAllTest() throws Exception {
        JsonResult result = controller.getAll();
        System.out.println(JSON.toJSONString(result));
    }

}
