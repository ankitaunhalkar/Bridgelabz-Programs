package com.bridgelabz.DataStructures;

import com.bridgelabz.Utility.Utility;

public class BinaryTreeSearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Utility();
		System.out.println("Enter the No. of TestCases");
		int tc=Utility.inputInt();
		int num=0;
		for(int i=0;i<tc;i++)
		{
			System.out.println("Enter Your Node Number:");
			num=Utility.inputInt();
			int count=Utility.findBTS(num);
			System.out.println(count);
		}
	}
}
