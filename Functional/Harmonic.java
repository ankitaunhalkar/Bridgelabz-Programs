package com.bridgelabz.Functional;

import com.bridgelabz.Utility.Utility;

public class Harmonic {

	public static void main(String[] args) {
		new Utility();
		System.out.println("Enter the Nth value:");
		int n=Utility.inputInt();
		float harmonic=Utility.harmonicValue(n);
		System.out.println("Nth Harmonic Value is:"+harmonic);
	}

}
