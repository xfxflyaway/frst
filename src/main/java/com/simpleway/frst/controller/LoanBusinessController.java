package com.simpleway.frst.controller;

import com.github.pagehelper.Page;
import com.simpleway.frst.domain.dto.LoanBusinessInfo;
import com.simpleway.frst.request.company.LoanBusinessForm;
import com.simpleway.frst.request.company.LoanBusinessQuery;
import com.simpleway.frst.response.JsonPage;
import com.simpleway.frst.response.JsonResult;
import com.simpleway.frst.service.LoanBusinessService;
import com.simpleway.frst.util.PreconditionsUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * @author xiongfeixiang
 * @title LoanBusinessController
 * @date 2017/10/1 14:52
 * @since v1.0.0
 */
@RestController
@RequestMapping("/frst/loanBusiness")
public class LoanBusinessController {
	private static Logger logger = LoggerFactory.getLogger(LoanBusinessController.class);

	@Resource
	LoanBusinessService loanBusinessService;

	@RequestMapping(value = "/add")
	public JsonResult add(@Valid LoanBusinessForm businessForm) throws Exception {
		Boolean result = loanBusinessService.addLoanBusiness(businessForm);
		return new JsonResult(result);
	}

	@RequestMapping(value = "/upd")
	public JsonResult upd(@Valid LoanBusinessForm businessForm) throws Exception {
		Boolean result = loanBusinessService.updLoanBusiness(businessForm);
		return new JsonResult(result);
	}

	@RequestMapping(value = "/del")
	public JsonResult del(Long id) throws Exception {
		PreconditionsUtil.checkNotNull(id, "id can not be empty");
		Boolean result = loanBusinessService.delLoanBusiness(id);
		return new JsonResult(result);
	}

	@RequestMapping(value = "/detail")
	public JsonResult detail(Long id) throws Exception {
		PreconditionsUtil.checkNotNull(id, "id can not be empty");
		LoanBusinessInfo result = loanBusinessService.getLoanBusinessDetail(id);
		return new JsonResult(true, result);
	}

	@RequestMapping(value = "/page")
	public JsonResult page(LoanBusinessQuery query) throws Exception {
		Page page = loanBusinessService.getLoanBusiness(query);
		return new JsonResult(true, new JsonPage(page));
	}

	/**
	 * 上报
	 * 
	 * @param id
	 * @param state
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/report")
	public JsonResult report(Long id) throws Exception {
		PreconditionsUtil.checkNotNull(id, "id can not be empty");
		Boolean result = loanBusinessService.updState(id);
		return new JsonResult(result);
	}

	@RequestMapping(value = "/loanCount")
	public JsonResult loanCount(String date) throws Exception {
		PreconditionsUtil.checkNotNull(date, "id can not be empty");
		JsonResult jsonResult = new JsonResult(true);
		jsonResult.setData(loanBusinessService.loanCount(date));
		return jsonResult;

	}

	@RequestMapping(value = "/loanCapital")
	public JsonResult loanCapital(String date) throws Exception {
		PreconditionsUtil.checkNotNull(date, "id can not be empty");
		JsonResult jsonResult = new JsonResult(true);
		jsonResult.setData(loanBusinessService.loanCapital(date));
		return jsonResult;
	}

}
