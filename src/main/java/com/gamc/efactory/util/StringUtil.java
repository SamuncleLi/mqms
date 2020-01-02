package com.gamc.efactory.util;

public class StringUtil {

	public static boolean isEmpty(String str){
		if("".equals(str)|| str==null){
			return true;
		}else{
			return false;
		}
	}
	
	public static boolean isNotEmpty(String str){
		if(!"".equals(str)&&str!=null){
			return true;
		}else{
			return false;
		}
	}

	public static boolean isNotEmptyStrict(String str){
		if(!"".equals(str)&&str!=null&&str!="null"){
			return true;
		}else{
			return false;
		}
	}
	
	public static boolean existStrArr(String str, String[]strArr){
		for(int i=0;i<strArr.length;i++){
			if(strArr[i].equals(str)){
				return true;
			}
		}
		return false;
	}

	public static String[] splitByComma(String str){
		String[] empty = {};
		if(isEmpty(str)){
			return empty;
		}
		else {
			return str.split(",");
		}
	}
}
