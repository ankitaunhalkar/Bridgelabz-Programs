package com.bridgelabz.Algorithm;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.utility.Utility;

public class MergeSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Utility();
		List<String> list= new ArrayList<String>();
		System.out.println("Enter the length of list:");
		int n=Utility.inputInt();
		System.out.println("Enter values in to the list:");
		for(int i=0;i<n;i++)
		{
			list.add(Utility.inputString());
		}
		String[] array=new String[list.size()];
		array=list.toArray(array);
		Utility.mergeSort(array,0,n-1);
	}

}
