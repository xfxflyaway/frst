package com.simpleway.frst.util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.beanutils.BeanUtils;

public class PageUtil {
	
	/**
	 * @throws InstantiationException 
	 * @throws InvocationTargetException 
	 * @throws IllegalAccessException 
	 * 
	* @Description: TODO
	* @param isOrder 是否排序  true要排序  
	* @return Object    
	* @throws
	 */
	public static Object pagetoWhere(Object where, HttpServletRequest request,boolean isOrder) throws IllegalAccessException, InvocationTargetException, InstantiationException{
		Class<?> demo = null;
		Object obj = null;
		try {
			demo = Class.forName(where.getClass().getName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		obj = demo.newInstance();
		BeanUtils.copyProperties(obj, where);
		String page = request.getParameter("page"); // 取得当前页数,注意这是jqgrid自身的参数
		if (page != null && !page.equals("1")) {
			setter(obj, "PageNo", Integer.valueOf(page), Integer.class);
		}
		
		String rows = request.getParameter("rows"); // 取得当前条数
		if (rows != null && !rows.equals("10")) {
			setter(obj, "PageSize", Integer.valueOf(rows), Integer.class);
		}
		if(isOrder){
			String sord = request.getParameter("sord");//正序还是倒序
			String sidx = request.getParameter("sidx");//根据哪列排序
			
			
//		    List<com.yuntu.fm.task.api.model.Order> orders = new ArrayList<>();
//		    com.yuntu.fm.task.api.model.Order order = new com.yuntu.fm.task.api.model.Order(sidx,sord);
//		    orders.add(order);
//		    setter(obj, "Orders", orders, List.class);
		}
	    
		return obj;
	}
	
	/**
	 * @param obj 操作的对象
	 * @param att 操作的属性
	 * @param value 设置的值
	 * @param type 参数的属性
	 * */
	public static void setter(Object obj, String att, Object value, Class<?> type) {
		try {
			Method method = obj.getClass().getMethod("set" + att, type);
			method.invoke(obj, value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
