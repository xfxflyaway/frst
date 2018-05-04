/**
 * Copyright (c) @2017,重庆云途交通科技有限公司.版权所有
 */
package com.simpleway.frst.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * 获取随机数
 * 
 * @author SuK
 * @since TODO 从哪个项目版本开始创建
 * @Date 2017-2-18
 */
public class RandomUtil {

	/**
	 * 产生时间戳(yyyyMMddHHmmss)4位随机数(0000-9999)
	 * 
	 * @param TODO 参数含义的说明
	 * @return String TODO 返回值含义的说明
	 * @throws TODO 抛出的异常，如果没有删除此行
	 */
	public static String getFourRandom() {
		SimpleDateFormat time = new SimpleDateFormat("yyyyMMddHHmmss");
		Random random = new Random();
		String fourRandom = random.nextInt(10000) + "";
		int randLength = fourRandom.length();
		if (randLength < 4) {
			for (int i = 1; i <= 4 - randLength; i++)
				fourRandom = "0" + fourRandom;
		}
		String sno = time.format(new Date()) + fourRandom;
		return sno;
	}

}
