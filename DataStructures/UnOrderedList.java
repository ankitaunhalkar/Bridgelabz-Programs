package com.bridgelabz.DataStructures;



import com.bridgelabz.Utility.LinkedList;
import com.bridgelabz.Utility.Utility;

public class UnOrderedList {

	/**
	 * @param <N>
	 * @param args
	 */
	public static <N> void main(String[] args) 
	{
		new Utility();
		LinkedList<N> list;
		list=Utility.readFileAndAddInList("/home/bridgeit/workspace/Files/LinklistWord");
		System.out.println("Enter the element to search");
		String search=Utility.inputString();
		list=Utility.searchInList(list, search);
		Utility.readListWriteInFile("/home/bridgeit/workspace/Files/LinklistWord",list);
	}

}
