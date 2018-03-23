package com.bridgelabz.Algorithm;

import com.bridgelabz.Utility.Utility;

public class SwapNibbles {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		new Utility();
		System.out.println("Enter a decimal value:");
		int num=Utility.inputInt();
		String binary=Utility.toBinary(num);
		Utility.swapNibbles(binary);
	}

}
