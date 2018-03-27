package com.bridgelabz.ObjectOriented;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.parser.ParseException;

import com.bridgelabz.Utility.Utility;

public class InventoryManage {

	/**
	 * @param args
	 * @throws ParseException 
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException, ParseException {
		FileReader fileread=Utility.fileRead("/home/bridgeit/workspace/Files/Inventory.json");
		Utility.inventoryManage(fileread);

	}

}
