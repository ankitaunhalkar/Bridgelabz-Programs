package com.bridgelabz.AddressBookManagement;

import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

public class AddressManager implements AddressManagerInterface {
	ObjectMapper objectMapper = new ObjectMapper();
	AddressBookInterface addressbook=new AddressBook();
	static ArrayList<Person> arraylist=new ArrayList<Person>();
	File file;File newfile;
	static Scanner s=new Scanner(System.in);
	
	public void create() {
		System.out.println("Give a name to your new address book:");

		file = new File(
				"/home/bridgeit/workspace/Ankita/Ankita/AddressBookFiles/" + ""
						+ s.next() + ".json");
		try {
			if (file.createNewFile()) {
				System.out.println("Address book is created!");

			} else {
				System.out.println("Cannot create new Addressbook.");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void open() {
		System.out.println("Enter the name of address book");
		file = new File(
				"/home/bridgeit/workspace/Ankita/Ankita/AddressBookFiles/" + ""
						+ s.next() + ".json");
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String jsonToArray;
			if ((jsonToArray = reader.readLine()) != null) {
				TypeReference<ArrayList<Person>> type = new TypeReference<ArrayList<Person>>() {
				};
				arraylist = objectMapper.readValue(jsonToArray, type);
			}
			reader.close();
		} catch (IOException e) {

			e.printStackTrace();
		}
		addressbook.operation(arraylist);
	}
	
	public void save() {
		ArrayList<Person> arrayList = addressbook.list();

		try {
			objectMapper.writeValue(file, arrayList);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public void saveAs() {
		System.out.println("Give a name to your new file");
		newfile = new File(
				"/home/bridgeit/workspace/Ankita/Ankita/AddressBookFiles/" + ""
						+ s.next() + ".json");
		ArrayList<Person> arrayList = addressbook.list();

		try {
			objectMapper.writeValue(newfile, arrayList);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public void quit() {
		System.exit(0);
	}

/*	
	public static void main(String[] args) {

		AddressManager manager = new AddressManager();
		System.out.println("Welcome to Address");
		do {
			System.out.println("Make a choice from below");
			System.out
					.println("1. Create\t 2. Open\t 3. Save\t4. Save As\t 5.Quit");

			switch (s.nextInt()) {
			case 1:
				manager.create();
				break;
			case 2:
				manager.open();
				break;
			case 3:
				manager.save();
				break;
			case 4:
				manager.saveAs();
				break;
			case 5:
				manager.quit();
				break;
			}
		} while (true);
	}*/
	
}
