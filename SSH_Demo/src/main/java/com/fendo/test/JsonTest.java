package com.fendo.test;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;

public class JsonTest {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("nimei");
		list.add("zhangsa");
		JSONArray json = new JSONArray();
		json.add("nimei");
		json.add("zhangsa");
		System.out.println(json.toJSONString());
	}

}
