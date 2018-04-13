package com.bridgelabz.ClinicManagement;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;

public class ClinicUtil {
	public static <T> void writeFile(File file, List<T> list) {
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			objectMapper.writeValue(file, list);
			System.out.println("SuccessFully Added");
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
