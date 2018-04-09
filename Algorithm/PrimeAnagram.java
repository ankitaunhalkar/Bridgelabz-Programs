package com.bridgelabz.Algorithm;

import com.bridgelabz.utility.Utility;

public class PrimeAnagram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Utility();
		System.out.println("Enter the nth term:");
		int n=Utility.inputInt();
		int[] out;
		out=Utility.primeNumbers(n);
		Utility.display(out);
		boolean status=Utility.FindAnagram(out);
		Utility.displayangaram(status);
	}

}
