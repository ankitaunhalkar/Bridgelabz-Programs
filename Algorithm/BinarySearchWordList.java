package com.bridgelabz.Algorithm;


import java.io.FileReader;



import com.bridgelabz.utility.Utility;

public class BinarySearchWordList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Utility();
		FileReader file=Utility.fileRead("/home/bridgeit/workspace/Files/WordList");
		Utility.findWord(file);
	}

}
