package com.simpleway.frst.util;

import java.util.Date;

public class SequenceUtil {

	/**
	 * 增加sequenceId值
	 * @return
	 */
	public synchronized static long getSeqId(){
		long time = (new Date()).getTime() * 1000;
		int rd = (int) (Math.random() * 1000);
		return time + rd;
	}
	
	
	
//	public static void main(String[] args) {
//		long time = (new Date()).getTime() * 1000;
//		int rd = (int) (Math.random() * 1000);
//		
//		System.out.println(time + rd);
//	}
}
