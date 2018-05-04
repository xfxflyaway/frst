package com.simpleway.frst.test;

import com.alibaba.fastjson.JSON;
import com.simpleway.frst.controller.BankFlowController;
import com.simpleway.frst.request.bank.BankFlowForm;
import com.simpleway.frst.request.bank.BankFlowQuery;
import com.simpleway.frst.response.JsonResult;
import org.junit.Test;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author xiongfeixiang
 * @title BankFlowTest
 * @date 2017/10/7 16:23
 * @since v1.0.0
 */
@WebAppConfiguration
public class BankFlowTest extends BaseTest {

    @Resource
    BankFlowController controller;

    @Test
    public void addTest() throws Exception {
        BankFlowForm f = new BankFlowForm();
        f.setAccountBalance(new BigDecimal(1));
        f.setBusinessSummary("dddd");
        f.setChannel("333");
        f.setCoreSerialNo("23");
        f.setCounterAccountName("83883838");
        f.setCounterAccountNo("3748596");
        f.setCounterBank("233");
        f.setCurrency("7348tfd");
        f.setForwardFlag("1");
        f.setOutIn("汇入");
        f.setPostscript("sdfhsd");
        f.setPurpose("23ds");
        f.setRemark("3");
        f.setTradeAccountName("32");
        f.setTransactionDate(new Date());
        f.setTransactionDesc("desc");
        f.setTransactionExplain("32ds");
        f.setTradeBank("icbc");
        f.setTransactionTime("3");
        f.setTransctionAmount(new BigDecimal(2345607));
        f.setTradeAccountNo("2333333333");
        JsonResult result = controller.add(f);
        System.out.println(JSON.toJSONString(result));
    }


    @Test
    public void pageTest() throws Exception {
        BankFlowQuery f = new BankFlowQuery();

        f.setOutIn("汇入");
        JsonResult result = controller.page(f);
        System.out.println(JSON.toJSONString(result));
    }


}
