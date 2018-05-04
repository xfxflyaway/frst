package com.simpleway.frst.test;

import com.alibaba.fastjson.JSON;
import com.simpleway.frst.controller.LoanBusinessController;
import com.simpleway.frst.request.company.LoanBusinessForm;
import com.simpleway.frst.request.company.LoanBusinessQuery;
import com.simpleway.frst.response.JsonResult;
import org.junit.Test;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author xiongfeixiang
 * @title LoanBusinessTest
 * @date 2017/10/7 12:33
 * @since v1.0.0
 */
@WebAppConfiguration
public class LoanBusinessTest extends BaseTest {

    @Resource
    LoanBusinessController controller;

    @Test
    public void addTest() throws Exception {
        LoanBusinessForm f = new LoanBusinessForm();
        /**
         * 还款人姓名
         */
        f.setLoanName("大魔王");
        /**
         * 还款人账号
         */
        f.setLoanAccountNo("3999293929992");
        /**
         * 还款人身份号码
         */
        f.setLoanIdentify("399399299999999999");
        /**
         * 贷款金额
         */
        f.setLoanAmount(new BigDecimal(399));
        /**
         * 还款公司账号
         */
        f.setBankAccount("3293283974239487");
        /**
         * 公司id
         */
        f.setCompanyId(3l);
        /**
         * 还款周期
         */
        f.setReturnMonth(48);
        /**
         * 每月还款日期
         */
        f.setReturnDay(18);
        /**
         * 每期还款金额
         */
        f.setOneAmount(new BigDecimal(1999));
        /**
         * 开始还款日期
         */
        f.setBeginDate(new Date());
        /**
         * 结束还款日期
         */
        f.setEndDate(new Date());
        JsonResult result = controller.add(f);
        System.out.println(JSON.toJSONString(result));

    }

    @Test
    public void updTest() throws Exception {
        LoanBusinessForm f = new LoanBusinessForm();
        /**
         * 还款人姓名
         */
        f.setLoanName("大魔王");
        /**
         * 还款人账号
         */
        f.setLoanAccountNo("3999293929992");
        /**
         * 还款人身份号码
         */
        f.setLoanIdentify("399399299999999999");
        /**
         * 贷款金额
         */
        f.setLoanAmount(new BigDecimal(399));
        /**
         * 还款公司账号
         */
        f.setBankAccount("3293283974239487");
        /**
         * 公司id
         */
        f.setCompanyId(3l);
        /**
         * 还款周期
         */
        f.setReturnMonth(48);
        /**
         * 每月还款日期
         */
        f.setReturnDay(18);
        /**
         * 每期还款金额
         */
        f.setOneAmount(new BigDecimal(9999));
        /**
         * 开始还款日期
         */
        f.setBeginDate(new Date());
        /**
         * 结束还款日期
         */
        f.setEndDate(new Date());
        f.setId(1507352004273883L);
        JsonResult result = controller.upd(f);
        System.out.println(JSON.toJSONString(result));

    }


    @Test
    public void delTest() throws Exception {
        JsonResult result = controller.del(1507352004273883L);
        System.out.println(JSON.toJSONString(result));
    }


    @Test
    public void detailTest() throws Exception {
        JsonResult result = controller.detail(1507802431064129L);
        System.out.println(JSON.toJSONString(result));
    }

    @Test
    public void pageTest() throws Exception {
        LoanBusinessQuery q = new LoanBusinessQuery();
        q.setCompanyId(3l);
        JsonResult result = controller.page(q);
        System.out.println(JSON.toJSONString(result));
    }
    
    @Test
    public void loanCount() throws Exception {
        JsonResult result = controller.loanCount("2017-10-23");
        System.out.println(JSON.toJSONString(result));
    }
    
    @Test
    public void loanCapital() throws Exception {
        JsonResult result = controller.loanCapital("2017-10-23");
        System.out.println(JSON.toJSONString(result));
    }
    
    
}
