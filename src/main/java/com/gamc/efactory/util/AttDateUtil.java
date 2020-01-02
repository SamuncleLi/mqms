package com.gamc.efactory.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Zeho Lee on 2018/5/11.
 * 时间处理工作类
 */
public class AttDateUtil {
    //传入工作开始时间和工作结束时间，例子如下“18-1-22 8：45”，根据时间判断是抓取本日的请假加班记录还是后一天的请假加班
    public static String beginJudge(String dateString, int workBeginHour) {
        try {
            //将日期转换成calendar
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date date = sdf.parse(dateString);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            //如果开始时间在0：00-3：59，则找后一天的加班/请假/出勤,天数
            if ((workBeginHour >= 0) && (workBeginHour < 4)) {
                calendar.add(Calendar.DATE, 1);
            }
            //返回修正后的日期
            date = calendar.getTime();
            SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
            return sdf2.format(date);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String endJudge(String dateString, int workEndHour) {
        //将日期转换成calendar
        //如果结束时间在0：00-11：59，则算做前一天的加班/请假/出勤
        //返回修正后的日期
        try {
            //将日期转换成calendar
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date date = sdf.parse(dateString);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            //如果开始时间在0：00-11：59，则找后一天的加班/请假/出勤,天数
            if ((workEndHour <= 0) && (workEndHour <= 11)) {
                calendar.add(Calendar.DATE, 1);
            }
            //返回修正后的日期
            date = calendar.getTime();
            SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
            return sdf2.format(date);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static boolean isSameDay(Calendar calDateA, Calendar calDateB) {
        return calDateA.get(Calendar.YEAR) == calDateB.get(Calendar.YEAR)
                && calDateA.get(Calendar.MONTH) == calDateB.get(Calendar.MONTH)
                && calDateA.get(Calendar.DAY_OF_MONTH) == calDateB.get(Calendar.DAY_OF_MONTH);
    }

    public static boolean isBeforeOrSame(String datetime1, String datetime2)
            throws Exception {
        //如果datetime2早于datetime1，则返回false，否则返回ture
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        //将字符串形式的时间转化为Date类型的时间
        Date dtime1 = sdf.parse(datetime1);
        Date dtime2 = sdf.parse(datetime2);

        if (dtime2.before(dtime1))
            return false;
        else
            return true;
    }

    //String 转 Calendar
    public static Calendar toCalendar(String datetime)
            throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");

        Date date = sdf.parse(datetime);

        Calendar calendar = Calendar.getInstance();

        calendar.setTime(date);

        return calendar;
    }

    public static Calendar toCalendar(String datetime, String dateFormat) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);

        Date date = sdf.parse(datetime);

        Calendar calendar = Calendar.getInstance();

        calendar.setTime(date);

        return calendar;
    }

    //Calendar 转 String
    public static String calendarToString(Calendar cal, String dateFormat) {
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        String dateStr = sdf.format(cal.getTime());

        return dateStr;
    }

    public static String getLeaveTypeSymbol(String leaveType) {
        if (leaveType.equals("补休")) {
            return "▲";
        }
        if (leaveType.equals("出差")) {
            return "☆";
        }
        if (leaveType.equals("15年以前年休")) {
            return "★";
        } else {
            return "请假类型待定";
        }
    }

    public static int getLeaveHourInADay(Calendar leaveBegin, Calendar leaveEnd, String menberSymbol) {
        int diff = (int) ((leaveEnd.getTimeInMillis() - leaveBegin.getTimeInMillis() - 1) / (1000 * 60 * 60) + 1);

        if (menberSymbol.equals("非S类")) {
            if (diff > 8) {
                diff = 8;
            }
        } else if (menberSymbol.equals("S类"))
            if (diff > 10) {
                diff = 10;
            }
        return diff;
    }

    //用来计算请假天数的方法
    public static double[] leaveCount(String leaveType, double[] sum) {
        //sum中的各个元素分别代表出差，补休，产检假，年休假，其他计生假，婚丧，事假，病假，留休假，迟到，旷工，其它
        //初始值double sum[] = {0,0,0,0,0,0,0,0,0,0,0,0};
        if (leaveType.equals("出差")) {
            sum[0] = sum[0] + 0.5;
        }
        if (leaveType.equals("补休")) {
            sum[1] = sum[1] + 0.5;
        }
        if (leaveType.equals("年休假")) {
            sum[2] = sum[2] + 0.5;
        }
        if (leaveType.equals("婚假")) {
            sum[3] = sum[3] + 0.5;
        }
        if (leaveType.equals("其他计生假") || leaveType.equals("产假") || leaveType.equals("产检假")) {
            sum[4] = sum[4] + 0.5;
        }
        if (leaveType.equals("丧假")) {
            sum[5] = sum[5] + 0.5;
        }
        if (leaveType.equals("事假")) {
            sum[6] = sum[6] + 0.5;
        }
        if (leaveType.equals("病假")) {
            sum[7] = sum[7] + 0.5;
        }
        if (leaveType.equals("留休假")) {
            sum[8] = sum[8] + 0.5;
        }
        if (leaveType.equals("迟到")) {
            sum[9] = sum[9] + 0.5;
        }
        if (leaveType.equals("旷工")) {
            sum[10] = sum[10] + 0.5;
        }
        if (leaveType.equals("其它")) {
            sum[11] = sum[11] + 0.5;
        }

        return sum;
    }

    //传入一个string类型的时间和偏移量，传出这个一个string类型的时间，如传入（2018-01-01 00:00，1），传出2018-01-01 01:00
    public static String timeAddHour(String time, int hour, int minute) throws Exception {
        Calendar timeCal = toCalendar(time);
        timeCal.add(Calendar.HOUR_OF_DAY, hour);
        timeCal.add(Calendar.MINUTE, minute);
        return calendarToString(timeCal, "yyyy-MM-dd HH:mm");
    }


    public static int minuteDiffer(Calendar cal1, Calendar cal2) {
        return (int) ((cal1.getTimeInMillis() - cal2.getTimeInMillis()) / (1000 * 60));
    }

    public static int hourDiffer(Calendar cal1, Calendar cal2) {
        return (int) ((cal1.getTimeInMillis() - cal2.getTimeInMillis()) / (1000 * 60 * 60));
    }

    public static int halfHourDiffer(Calendar cal1, Calendar cal2) {
        return (int) ((cal1.getTimeInMillis() - cal2.getTimeInMillis()) / (1000 * 60 * 30));
    }

    public static int quarterDiffer(Calendar cal1, Calendar cal2) {
        return (int) ((cal1.getTimeInMillis() - cal2.getTimeInMillis()) / (1000 * 60 * 15));
    }

    public static int dayDiffer(Calendar cal1, Calendar cal2) {
        return (int) ((cal1.getTimeInMillis() - cal2.getTimeInMillis()) / (1000 * 60 * 60 * 24));
    }

    //通过年月日转成calendar
    public static Calendar toCalendar(String year, String month, String day) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Date date = sdf.parse(year + "-" + month + "-" + day);

        Calendar calendar = Calendar.getInstance();

        calendar.setTime(date);

        return calendar;
    }

    //1-12月
    public static int daysOfMonth(String year, String month) throws Exception {
        Calendar cal1 = AttDateUtil.toCalendar(year, month, "01");
        Calendar cal2 = AttDateUtil.toCalendar(year, String.valueOf(Integer.parseInt(month, 10) + 1), "01");
        return AttDateUtil.dayDiffer(cal2, cal1);
    }

    public static String getNow(String param) {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if (param.equals("all")) {
            dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        } else if (param.equals("standard")) {
            dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        } else if (param.equals("date")) {
            dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        } else if (param.equals("year")) {
            dateFormat = new SimpleDateFormat("yyyy");
        } else if (param.equals("month")) {
            dateFormat = new SimpleDateFormat("MM");
        } else if (param.equals("day")) {
            dateFormat = new SimpleDateFormat("dd");
        } else if (param.equals("time")) {
            dateFormat = new SimpleDateFormat("HH:mm:ss");
        } else if (param.equals("hour")) {
            dateFormat = new SimpleDateFormat("HH");
        } else if (param.equals("minute")) {
            dateFormat = new SimpleDateFormat("mm");
        } else if (param.equals("second")) {
            dateFormat = new SimpleDateFormat("ss");
        }
        return dateFormat.format(date);
    }

    //获取每月的第一个星期四
    public static Calendar getFirstThursdayOfMonth(int year, int month) {
        Calendar cal = Calendar.getInstance();

        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month - 1);
        cal.set(Calendar.DATE, 1); // 设为第一天

        while (cal.get(Calendar.DAY_OF_WEEK) != Calendar.THURSDAY) {
            cal.add(Calendar.DATE, 1);
        }

        return cal;
    }

    public static String formatMonth(int month) {
        return String.format("%02d", month);
    }

    public static String formatDay(int day) {
        return String.format("%02d", day);
    }

    public static String enFormatMonth(String cnMonth) {
        String cnMonths[] = {"一月", "二月", "三月", "四月", "五月", "六月", "七月", "八月", "九月", "十月", "十一月", "十二月"};
        String enMonths[] = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"};
        for (int i = 0; i < 12; i++) {
            if (cnMonth.equals(cnMonths[i])) {
                return enMonths[i];
            }
        }
        return cnMonth;
    }

    //判断两个时间段是否有重叠
    public static boolean isOverlapped(String time1Begin, String time1End, String time2Begin, String time2End){
        if((time1Begin.compareTo(time2End)>=0 && time1End.compareTo(time2End)>=0) || (time2Begin.compareTo(time1End)>=0) && (time2End.compareTo(time1End)>=0)){
            return false;
        }
        else{
            return true;
        }
    }

/**
 * @描述 获取某月的最后一天
 * @编写人 Zeho Lee
 * @日期 2018/12/18
 * @参变量
 * @返回
 * @抛出异常
*/
    public static String getLastDayOfMonth(int year, int month){
        Calendar cal = Calendar.getInstance();
        //设置年份
        cal.set(Calendar.YEAR,year);
        //设置月份
        cal.set(Calendar.MONTH, month-1);
        //获取某月最大天数
        int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        //设置日历中月份的最大天数
        cal.set(Calendar.DAY_OF_MONTH, lastDay);
        //格式化日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String lastDayOfMonth = sdf.format(cal.getTime());
        return lastDayOfMonth;
    }

    public static String enDateToCnDate(String enDate, String dateFormat) throws Exception {
        Calendar calendar = toCalendar(enDate);
        return calendarToString(calendar, dateFormat);
    }

    public static void main(String args[]) {
        int[][] obstacleGrid = {{0,0},{0,1}};
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] paths = new int[m][n];

        for(int j=n-1;j>=0;j--){
            if(obstacleGrid[0][j] == 0){
                paths[0][j] =1;
            }
            else{
                for(int k=j;k>=0;k--){
                    paths[0][k] =0;
                }
                break;
            }
        }

        for(int i=0;i<m;i++){
            if(obstacleGrid[i][n-1] == 0){
                paths[i][n-1] =1;
            }
            else{
                for(int k=i;k<m;k++){
                    paths[k][n-1] =0;
                }
                break;
            }
        }

        //从倒数第二行倒数第二列算起
        for(int i=1;i<m;i++){
            for(int j=n-2;j>=0;j--){
                if(obstacleGrid[i][j] == 0){
                    paths[i][j] =paths[i-1][j] + paths[i][j+1];
                }
                else{
                    paths[i][j]=0;
                }
            }
        }
        System.out.println(paths);
    }

}

