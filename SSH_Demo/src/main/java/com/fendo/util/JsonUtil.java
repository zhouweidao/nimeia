package com.fendo.util;

import com.alibaba.fastjson.JSONArray;

public class JsonUtil {
	private JsonUtil() {
	 throw new AssertionError();
	}
	
	public static String getJsonArray(String... strings ){
		JSONArray ajsArray = new JSONArray();
		if(strings != null){
		for(String string : strings){
			ajsArray.add(string);
		 }
		}
		return ajsArray.toJSONString();
	}
	
}
