package com.bridgelabz.Algorithm;

import com.bridgelabz.utility.Utility;

public class DayOfWeek {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Utility();
		System.out.println("Enter the date [M-D-Y]");
		System.out.println("Month:");
		int m=Utility.inputInt();
		System.out.println("Date:");
		int d=Utility.inputInt();
		System.out.println("Year:");
		int y=Utility.inputInt();
		int day=Utility.dayOfWeek(m,d,y);
		System.out.println(day);
	}

}
