package com.bridgelabz.DataStructures;

import com.bridgelabz.Utility.OrderedLinkedList;
import com.bridgelabz.Utility.Utility;

public class OrderedList {

	/**
	 * @param <N>
	 * @param args
	 */
	
	public static <N> void main(String[] args) {
		new Utility();
		@SuppressWarnings("rawtypes")
		OrderedLinkedList list;
		list= Utility.OrderreadFileAndAddInList("/home/bridgeit/workspace/Files/NumberList");
		System.out.println("Enter the element to search");
		String search=Utility.inputString();
		list=Utility.searchInListOrder(list, search);
		Utility.OrderreadListWriteInFile("/home/bridgeit/workspace/Files/NumberList",list);	
	}
}
