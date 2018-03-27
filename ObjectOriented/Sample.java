package com.bridgelabz.ObjectOriented;


import java.io.FileReader;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class Sample {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		/*JSONObject obj=new JSONObject();
		obj.put("name", "ankita");
		obj.get(obj);
		System.out.println(obj);*/
		try {
			Object object=new JSONParser().parse(new FileReader("/home/bridgeit/workspace/Files/sample.json"));
			JSONObject jo=(JSONObject) object;
			jo.get("name");
			jo.get("email");
			System.out.println(jo);
			JSONArray ja=(JSONArray) jo.get("employees");
			for (Object emp : ja) {
				System.out.println(emp);
			}
		}  catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
