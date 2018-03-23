package com.bridgelabz.DataStructures;

import java.io.FileReader;

import com.bridgelabz.Utility.LinkedList;
import com.bridgelabz.Utility.OrderedLinkedList;
import com.bridgelabz.Utility.Utility;

public class OrderedList {

	/**
	 * @param <N>
	 * @param args
	 */
	public static <N> void main(String[] args) {
		new Utility();
		new Utility();
		OrderedLinkedList list;
		list= Utility.OrderreadFileAndAddInList("/home/bridgeit/workspace/Files/NumberList");
		System.out.println("Enter the element to search");
		int search=Utility.inputInt();
		list=Utility.searchInList(list, search);
		Utility.OrderreadListWriteInFile("/home/bridgeit/workspace/Files/NumberList",list);	
	}

}
