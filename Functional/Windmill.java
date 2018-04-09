package com.bridgelabz.Functional;

import com.bridgelabz.utility.Utility;

public class Windmill {

	
	public static void main(String[] args) {
	new Utility();
	System.out.println("Enter Temperature(in Fahrenit):");
	int t=Utility.inputInt();
	System.out.println("Enter Wind Speed(in miles per hour):");
	int v=Utility.inputInt();
	Utility.windchill(t, v);
	}
}
