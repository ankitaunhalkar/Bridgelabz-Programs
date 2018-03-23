package com.bridgelabz.Algorithm;

import com.bridgelabz.Utility.Utility;

public class VendingMachine {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Utility();
		
		System.out.println("Enter the amount whose Changes to be return:");
		int changes=Utility.inputInt();
		Utility.vendingMachine(changes);
	}

}
