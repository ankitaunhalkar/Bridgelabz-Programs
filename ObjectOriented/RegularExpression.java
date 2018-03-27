package com.bridgelabz.ObjectOriented;

import com.bridgelabz.Utility.Utility;

public class RegularExpression {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Utility();
		System.out.println("Enter Your Firstname:");
		String firstname=Utility.inputString();
		System.out.println("Enter Your Lastname:");
		String lastname=Utility.inputString();
		System.out.println("Enter Your Mobile Number:");
		String mobile=Utility.inputString();
		Utility.regularExpression(firstname,lastname,mobile);
		
	}

}
