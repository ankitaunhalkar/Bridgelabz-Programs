package com.bridgelabz.AddressBookManagement;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class AddressManager {
	ObjectMapper objectMapper = new ObjectMapper();
	AddressBook addressbook=new AddressBook();
	File file;
	static Scanner s=new Scanner(System.in);
	public void create() {
		System.out.println("Give a name to your new address book:");
		file=new File("/home/bridgeit/workspace/Ankita/Ankita/AddressBookFiles/" +
				""+s.next()+".json");
		try {
				if (file.createNewFile()){
					System.out.println("Address book is created!");
					FileWriter fw=new FileWriter(file);
					fw.write("{}");
					fw.flush();
					fw.close();
				}
				else{
					System.out.println("Address book is already exists.");
				}
			} catch (IOException e) {
				e.printStackTrace();
				}
		
	}
	public void open() {
		file=null;
		System.out.println("Enter the name of address book");
			String filename="/home/bridgeit/workspace/Ankita/Ankita/AddressBookFiles/" +
					""+s.next()+".json";
				try {
					Person person=objectMapper.readValue(new FileInputStream(filename), Person.class );
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		addressbook.operation();
	}
	public void save() {
		ArrayList<Person> arrayList=new ArrayList<Person>();
		arrayList=addressbook.list();
		
		try {
			objectMapper.writeValue(file, arrayList);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	public void saveAs() {
		
	}
	public void quit() {
	
	}

	public static void main(String[] args) {
		
		AddressManager manager=new AddressManager();
		System.out.println("Welcome to Address");
		do{
		System.out.println("Make a choice from below");
		System.out.println("1. Create\t 2. Open\t 3. Save\t4. Save As\t 5.Quit");
		File file = null;
		switch (s.nextInt()) {
		case 1:	manager.create();
				break;
		case 2:	manager.open();
				break;
		case 3:	manager.save();
				break;
		case 4:	manager.saveAs();
				break;
		
		case 5:System.exit(0);
			
		}
		}while(true);
	}
	
}
