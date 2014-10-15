package com.esn.rest;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONObject;

public class ToJson {
	public JSONArray getJsonData()throws Exception {
		JSONArray json = new JSONArray();
		
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("col1", "val1");
		jsonObj.put("col2", "val2");
		jsonObj.put("col3", "val3");
		jsonObj.put("col4", "val4");
		json.put(jsonObj);
		
		JSONObject jsonObj2 = new JSONObject();
		jsonObj2.put("c1", "val1");
		jsonObj2.put("c2", "val2");
		jsonObj2.put("c3", "val3");
		jsonObj2.put("c4", "val4");
		json.put(jsonObj);
		
		return json;
		
	}
}
