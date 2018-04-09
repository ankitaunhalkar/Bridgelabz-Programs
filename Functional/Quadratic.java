package com.bridgelabz.Functional;

import com.bridgelabz.utility.Utility;

public class Quadratic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Utility();
		System.out.println("Enter the value of a:");
		int a=Utility.inputInt();
		System.out.println("Enter the value of b:");
		int b=Utility.inputInt();
		System.out.println("Enter the value of c:");
		int c=Utility.inputInt();
		
		Utility.quadratic(a,b,c);
	}

}
