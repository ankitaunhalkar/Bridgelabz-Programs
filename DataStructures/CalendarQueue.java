package com.bridgelabz.DataStructures;

import com.bridgelabz.Utility.Utility;

public class CalendarQueue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Utility();
		System.out.println("Enter the month:");
		int month=Utility.inputInt();
		System.out.println("Enter the year:");
		int year=Utility.inputInt();
		Utility.CalendarQueue(month,year);
	}

}
