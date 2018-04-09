package com.bridgelabz.Functional;

import com.bridgelabz.utility.Utility;

public class SumOfThree {

	public static void main(String[] args) {
		new Utility();
		System.out.println("Enter array length:");
		int n=Utility.inputInt();
		System.out.println("Enter the elements into the array");
		Integer[] a=Utility.ArrayInt(n);
		Utility.SumOfThree(n,a);

	}

}
