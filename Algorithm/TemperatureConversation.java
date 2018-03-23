package com.bridgelabz.Algorithm;

import com.bridgelabz.Utility.Utility;

public class TemperatureConversation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Utility();
		System.out.println("Make a Choice:");
		System.out.println("Choose 1: Celsius to Fahrenit\nChoose 2: Fahrenit to Calsius");
		int choice=Utility.inputInt();
		System.out.println("Enter the temperature:");
		int temperature=Utility.inputInt();
		Utility.tempConvert(choice,temperature);
		
	}

}
