package com.bridgelabz.DataStructures;

import com.bridgelabz.Utility.OrderedLinkedList;
import com.bridgelabz.Utility.Utility;

public class OrderedList {

	/**
	 * @param <N>
	 * @param args
	 */
	
	@SuppressWarnings("unchecked")
	public static <N> void main(String[] args) {
		new Utility();
		OrderedLinkedList<Integer> list;
		list= Utility.OrderreadFileAndAddInList("/home/bridgeit/workspace/Files/NumberList");
		System.out.println("Enter the element to search");
		Integer s=Utility.inputInt();
		String search=s.toString();
		list=Utility.searchInListOrder(list, search);
		Utility.OrderreadListWriteInFile("/home/bridgeit/workspace/Files/NumberList",list);	
	}
}
