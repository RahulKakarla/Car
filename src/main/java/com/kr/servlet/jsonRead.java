package com.kr.servlet;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class jsonRead {

	public static void main(String[] args) {
		JSONParser p=new JSONParser();
		
		try {
			Object obj=p.parse(new FileReader("car.json"));
			JSONObject js=(JSONObject)obj;
			System.out.println(js);
			String mk=(String)js.get("make");
			System.out.println(mk);
			String mod=(String)js.get("model");
			System.out.println(mod);
			
			JSONArray ar=(JSONArray)js.get("car");
			@SuppressWarnings("unchecked")
			Iterator<String> it=ar.iterator();
			while(it.hasNext()){
				System.out.println(it.next());
			}
			
			
		} catch (IOException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
