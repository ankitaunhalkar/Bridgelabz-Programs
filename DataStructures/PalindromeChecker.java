package com.bridgelabz.DataStructures;

import com.bridgelabz.utility.Utility;

public class PalindromeChecker {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Utility();
		System.out.println("Enter the String:");
		String string=Utility.inputStringLine().toLowerCase().replaceAll(" ", "");
		Utility.isPalindromeChecker(string);
	}

}
