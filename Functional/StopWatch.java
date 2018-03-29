package com.bridgelabz.Functional;

import com.bridgelabz.Utility.Utility;

public class StopWatch {

	
	public static void main(String[] args) throws InterruptedException {
		new Utility();
		
		double start=Utility.time();
		Thread.sleep(300);
		double end=Utility.time();
		Utility.stopWatch(start,end);
	}

}
