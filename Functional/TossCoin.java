package com.bridgelabz.Functional;

import com.bridgelabz.Utility.Utility;

public class TossCoin {

	
	public static void main(String[] args) 
	{
		new Utility();
		System.out.println("How many times you want to flip the coin?");
		int n = Utility.inputInt();
		Utility.flipCoin(n);
	}

}
