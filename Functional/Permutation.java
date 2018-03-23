package com.bridgelabz.Functional;

import com.bridgelabz.Utility.Utility;

public class Permutation {
	
	public static void main(String[] args) {
		new Utility();
		System.out.println("Enter the String:");
		String s=Utility.inputString();
		Utility.permute(s);
	}

}
