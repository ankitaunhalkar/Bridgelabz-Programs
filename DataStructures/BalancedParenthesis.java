package com.bridgelabz.DataStructures;

import com.bridgelabz.utility.Utility;

public class BalancedParenthesis {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Utility();
		System.out.println("Enter the Expression:");
		String exp=Utility.inputString();
		Utility.BalanceParanthesis(exp);		
	}
}
