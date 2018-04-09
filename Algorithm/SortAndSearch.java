package com.bridgelabz.Algorithm;




import com.bridgelabz.utility.Utility;

public class SortAndSearch {

	/**
	 * @param <E>
	 * @param args
	 */
	public static <E> void main(String[] args) {
		new Utility();
		double start,end;
		//Binary Search
		start=Utility.time();
		System.out.println("Enter the array length:");
		int n= Utility.inputInt();
		System.out.println("Enter the values in array:");
		String array[]=Utility.ArrayString(n);
		System.out.println("Enter the value to find:");
		String search=Utility.inputString();
		Utility.BinarySearch(array, search);
		end=Utility.time ();
		Utility.stopWatch(start, end);
		System.out.println("-----------------");
		
		//Insertion Sort
		start=Utility.time();
		Utility.insertionSort(array);
		end=Utility.time();
		Utility.stopWatch(start, end);
		System.out.println("-----------------");
		
		//Bubble Sort
		start=Utility.time();
		Utility.bubbleSort(array);
		end=Utility.time();
		Utility.stopWatch(start, end);
		
	}

}
