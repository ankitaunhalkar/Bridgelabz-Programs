package com.bridgelabz.DataStructures;

import com.bridgelabz.Utility.Utility;

public class CalendarStack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Utility();
		System.out.println("Enter the month:");
		int month=Utility.inputInt();
		System.out.println("Enter the Year:");
		int year=Utility.inputInt();
		Utility.CalendarStack(month, year);
	}

}
