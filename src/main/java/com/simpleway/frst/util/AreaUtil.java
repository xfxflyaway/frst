package com.simpleway.frst.util;import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.simpleway.frst.domain.dto.SmArea;

public class AreaUtil {
	public static Long contain(List<SmArea> list,String target){
		for(SmArea area:list){
			if((!StringUtils.isBlank(area.getAreaName()))&&target.indexOf(area.getAreaName())!=-1){
				return area.getAreaId();
			}
		}
		return 1l;
	}
}
