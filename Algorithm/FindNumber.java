package com.bridgelabz.Algorithm;

import com.bridgelabz.Utility.Utility;

public class FindNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Utility();
		System.out.println("Enter the Nth value:");
		int n=Utility.inputInt();
		System.out.println("Think of a number between 0-"+(n-1));
		Utility.search(0,n-1);
	
	}

}
