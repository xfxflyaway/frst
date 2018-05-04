package com.simpleway.frst.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class RepDateUtil {
    /** 
     * 获取统计月
     * @param pattern 格式
     * @return String   
     */
    public static String getStatisticsMonth(String pattern){
         Calendar calendar = Calendar.getInstance();
         calendar.setTime(new Date());
         calendar.add(Calendar.MONTH, -1);
         return new SimpleDateFormat(pattern).format(calendar.getTime());
     }
     
     /** 
     * 上个月第一天开始时间
     * @param TODO
     * @return Long   
     */
     public static Long getLastMonthStartTime() {
         Calendar calendar = Calendar.getInstance();
         calendar.setTime(new Date());
         calendar.add(Calendar.MONTH, -1);
         calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMinimum(Calendar.DAY_OF_MONTH));
         calendar.set(Calendar.HOUR_OF_DAY, calendar.getActualMinimum(Calendar.HOUR_OF_DAY));
         calendar.set(Calendar.MINUTE, calendar.getActualMinimum(Calendar.MINUTE));
         calendar.set(Calendar.SECOND, calendar.getActualMinimum(Calendar.SECOND));
         calendar.set(Calendar.MILLISECOND, calendar.getActualMaximum(Calendar.MILLISECOND));
         return calendar.getTime().getTime();

     }

     
     /** 
     * 上个月最后一天结束时间
     * @param TODO
     * @return Long   
     */
     public static Long getLastMonthEndTime() {
         Calendar calendar = Calendar.getInstance();
         calendar.setTime(new Date());
         calendar.add(Calendar.MONTH, -1);
         calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
         calendar.set(Calendar.HOUR_OF_DAY, calendar.getActualMaximum(Calendar.HOUR_OF_DAY));
         calendar.set(Calendar.MINUTE, calendar.getActualMaximum(Calendar.MINUTE));
         calendar.set(Calendar.SECOND, calendar.getActualMaximum(Calendar.SECOND));
         calendar.set(Calendar.MILLISECOND, calendar.getActualMaximum(Calendar.MILLISECOND));
         return calendar.getTime().getTime();

     }
}
