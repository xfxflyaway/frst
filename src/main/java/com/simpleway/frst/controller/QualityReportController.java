package com.simpleway.frst.controller;

import com.simpleway.frst.request.qualityreport.QualityReportQuery;
import com.simpleway.frst.response.JsonResult;
import com.simpleway.frst.service.QualityReportService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author xiongfeixiang
 * @title FinanceController
 * @date 2017/9/28 9:57
 * @since v1.0.0
 */


@RestController
@RequestMapping("/frst/qualityReport")
public class QualityReportController {
    private static Logger logger = LoggerFactory.getLogger(QualityReportController.class);

    @Resource
    QualityReportService qualityReportService;

    @RequestMapping(value = "/list")
    public JsonResult listByCondition(QualityReportQuery query) {
        List resultList = qualityReportService.listByCondition(query);
        return new JsonResult(true, resultList);
    }


}
