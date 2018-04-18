package com.bridgelabz.ClinicManagementSystem;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
//import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
//import java.util.Map;

import org.codehaus.jackson.map.ObjectMapper;

public class ClinicUtil {
	public static <T> void writeFile(File file, List<T> list) {
		ObjectMapper objectMapper = new ObjectMapper();
		//----
			//Map<String,Object> obj;
		//----
		try {
			objectMapper.writeValue(file, list);
			// obj = new HashMap<>();
			// obj.put(T.class.getSimpleName(), list);

			//objectMapper.writeValue(file, obj);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static <T> List<T> readFile(File file, Class<T[]> clazz) {
		List<T> list = null;
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			list = new LinkedList<T>(Arrays.asList(objectMapper.readValue(file,
					clazz)));
		} catch (IOException e) {
			System.out.println("No data Found");
		}

		return list;
	}

}
