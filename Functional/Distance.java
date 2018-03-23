package com.bridgelabz.Functional;

import com.bridgelabz.Utility.Utility;

public class Distance {

	public static void main(String[] args) {
		int x=Integer.parseInt(args[0]);
		int y=Integer.parseInt(args[1]);
		double distance=Utility.distance(x,y);
		System.out.println("Distance from ("+x+","+y+") to Origin (0,0) is:"
		+distance);
	}

}
