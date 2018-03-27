package com.bridgelabz.ObjectOriented;

import java.io.IOException;

import org.json.simple.parser.ParseException;

import com.bridgelabz.Utility.Utility;

public class CommercialData {

	/**
	 * @param args
	 * @throws ParseException 
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException, ParseException {
		new Utility();
		System.out.println("Enter Your Chocie");
		System.out.println("1.Create a new Account\n2.Value Of\n3.Buy Shares\n4.Sell Shares\n5.Save Account\n5.Print Report");
		int choice=Utility.inputInt();
		Utility.CommericalData(choice);
	}

}
