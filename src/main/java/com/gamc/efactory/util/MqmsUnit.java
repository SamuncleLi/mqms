package com.gamc.efactory.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by UZI on 2020/1/6.
 */
public class MqmsUnit {
    /**
     * 此处用于获取两个日期之间的月份差值
     * @param startDate
     * @param endDate
     * @return
     * @throws Exception
     */
    public static int getMonth(String startDate, String endDate) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c = Calendar.getInstance();
        c.setTime(sdf.parse(endDate));
        int year1 = c.get(Calendar.YEAR);
        int month1 = c.get(Calendar.MONTH);

        c.setTime(sdf.parse(startDate));
        int year2 = c.get(Calendar.YEAR);
        int month2 = c.get(Calendar.MONTH);

        int result;
        if (year1 == year2) {
            result = month1 - month2;
        } else {
            result = 12 * (year1 - year2) + month1 - month2;
        }

        return result;
    }

    /**
     * 此处用于计算某个日期处于周三~下周四的时间区域
     * @param dateTime
     * @return
     * @throws java.text.ParseException
     */
    public static Map<String, String> getWeekDate(String dateTime) throws java.text.ParseException {
        Map<String, String> map = new HashMap();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(dateTime);
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.setFirstDayOfWeek(Calendar.WEDNESDAY);// 设置一个星期的第一天，按中国的习惯一个星期的第一天是星期一
        int dayWeek = cal.get(Calendar.DAY_OF_WEEK);// 获得当前日期是一个星期的第几天
        if (dayWeek == 1) {
            dayWeek = 8;
        }

        cal.add(Calendar.DATE, cal.getFirstDayOfWeek() - dayWeek);// 根据日历的规则，给当前日期减去星期几与一个星期第一天的差值
        Date mondayDate = cal.getTime();
        String weekBegin = sdf.format(mondayDate);


        cal.add(Calendar.DATE, 4 + cal.getFirstDayOfWeek());
        Date sundayDate = cal.getTime();
        String weekEnd = sdf.format(sundayDate);


        map.put("wednesdayDate", weekBegin);
        map.put("ThursdayDate", weekEnd);
        return map;
    }
}
