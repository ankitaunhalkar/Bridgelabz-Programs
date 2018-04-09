package com.bridgelabz.Functional;

import com.bridgelabz.utility.Utility;

public class Gambler {
	/*Desc -> Simulates a gambler who start with $stake and place fair $1 bets 
	 * until he/she goes broke (i.e. has no money) or reach $goal. 
	 * Keeps track of the number of times he/she winsss and the number 
	 * of bets he/she makes. Run the experiment N times, averages the 
	 * results, and prints them out.
	I/P -> $Stake, $Goal and Number of times
	Logic -> Play till the gambler is broke or has won
	O/P -> Print Number of Wins and Percentage of Win and Loss.*/

	
	public static void main(String[] args) {
		new Utility();
		System.out.println("Enter the values for stake,goal,times:");
		int stake=Utility.inputInt();
		int goal=Utility.inputInt();
		int times=Utility.inputInt();
		Utility.gambler(stake, goal, times);
		
	}

}
