package com.bridgelabz.Functional;

import com.bridgelabz.Utility.Utility;

public class LeapYear {

	public static void main(String[] args) {
		new Utility();
		System.out.println("Enter a Year in this format [YYYY]:");
		int year=Utility.inputInt();
		Utility.isLeapOrNot(year);
	}

}
