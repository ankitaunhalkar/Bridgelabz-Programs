package com.bridgelabz.Algorithm;

import com.bridgelabz.Utility.Utility;

public class AnagramDetection {

	public static void main(String[] args) 
	{	
		new Utility();
		System.out.println("Enter String 1:");
		String str1=Utility.inputString();
		System.out.println("Enter String 2:");
		String str2=Utility.inputString();
		Utility.anagram(str1, str2);
	}

}