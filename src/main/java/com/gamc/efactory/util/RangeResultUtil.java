package com.gamc.efactory.util;

/**
 * Created by UZI on 2020/1/5.
 */
public class RangeResultUtil {
    public static String rangeResult(int mileage,int overrange ,int peakValue)throws Exception {
        if (mileage>=peakValue){
            return "大于"+peakValue;
        }
        else {
            int a = mileage / overrange;
            if (a == 0) {
                return "0~" + Integer.toString(overrange);
            } else {
                return overrange * a + "~" + overrange * (a + 1);
            }
        }
    }

}
