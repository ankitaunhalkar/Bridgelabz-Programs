package com.bridgelabz.Functional;

import com.bridgelabz.utility.Utility;

public class Array {

	public static void main(String[] args) {
		new Utility();
		System.out.println("Enter number of rows and column:");
		int m=Utility.inputInt();
		int n=Utility.inputInt();
		System.out.println("Enter the Choice:");
		System.out.println("1.Integer 2D");
		System.out.println("2.Double 2D");
		System.out.println("3.Boolean 2D");
		int choice=Utility.inputInt();
		Utility.scanIn(m, n, choice);

	}

}
