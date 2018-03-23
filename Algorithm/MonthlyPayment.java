package com.bridgelabz.Algorithm;

import com.bridgelabz.Utility.Utility;

public class MonthlyPayment {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Utility();
		System.out.println("Enter the Principal amount:");
		double p=Utility.inputDouble();
		System.out.println("Enter the rate interest:");
		double r=Utility.inputDouble();
		System.out.println("Enter the years");
		int y=Utility.inputInt();
		Utility.monthlyPayment(p, r, y);
	}

}
