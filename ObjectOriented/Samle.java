package com.bridgelabz.ObjectOriented;

import org.json.simple.JSONObject;

public class Samle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JSONObject obj=new JSONObject();
		obj.put("name", "ankita");
		obj.get(obj);
		System.out.println(obj);
	}

}
