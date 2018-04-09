package com.bridgelabz.Algorithm;

import com.bridgelabz.utility.Utility;

public class PrimeNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		new Utility();
		System.out.println("Enter the nth term:");
		int n=Utility.inputInt();
		int out[]=new int[1000];
		out=Utility.primeNumbers(n);
		Utility.display(out);
	}

}
