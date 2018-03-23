package com.bridgelabz.Algorithm;

import com.bridgelabz.Utility.Utility;

public class ToBinary {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Utility();
		System.out.println("Enter the decimal number:");
		long num=Utility.inputlong();
		String binary=Utility.toBinary(num);
		System.out.println("Binary representation of "+num+" is "+binary);
	}

}
