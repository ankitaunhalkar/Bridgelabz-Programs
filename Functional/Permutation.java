package com.bridgelabz.Functional;

import com.bridgelabz.utility.Utility;

public class Permutation {
	
	public static void main(String[] args) {
		new Utility();
		System.out.println("Enter the String:");
		String s=Utility.inputString();
		int n=s.length();
		Utility.permute(s,0,n-1);
	}

}
