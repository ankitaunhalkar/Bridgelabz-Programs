package com.bridgelabz.Functional;

import com.bridgelabz.Utility.Utility;

public class StopWatch {

	
	public static void main(String[] args) {
		new Utility();
		System.out.println("Enter the start and end time:");
		double start=Utility.inputDouble();
		double end=Utility.inputDouble();
		Utility.stopWatch(start,end);
	}

}
