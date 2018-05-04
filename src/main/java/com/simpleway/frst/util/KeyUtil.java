package com.simpleway.frst.util;

public class KeyUtil {

	/**
	 * 通过上一个主键生成新主键
	 * @param frontKey
	 * @return
	 */
	public static String generateKey(String frontKey){
		Integer kunnrNo = Integer.valueOf(frontKey.substring(1)) + 1;
		String kunnrStr = String.valueOf(kunnrNo);
		int ca = 9 - kunnrStr.length();
		for(int i=0; i<ca; i++){
			kunnrStr = '0' + kunnrStr;
		}
		String kunnr = frontKey.substring(0,1) + kunnrStr;
		return kunnr;
	}
}
