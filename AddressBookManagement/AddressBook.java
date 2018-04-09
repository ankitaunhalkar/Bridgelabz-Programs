package com.bridgelabz.AddressBookManagement;


import java.util.ArrayList;
import java.util.Scanner;

import org.json.simple.parser.JSONParser;

public class AddressBook {
	Scanner s=new Scanner(System.in);
	ArrayList<Person> list=new ArrayList<Person>();
	JSONParser parser=new JSONParser();
	public void operation() {
		
		boolean status=true;
		do{
		System.out.println("Choose Operation you want to do");
		System.out.println("1. Add\t2. Edit\t3. Search\t4. SortById\t5. SortByZip\t6. Exit");
		switch (s.nextInt()) {
		case 1: add();
				break;
		case 2: edit();
				break;
		case 3: search();
				break;
		case 4: sortById();
				break;
		case 5: sortByZip();
				break;
		case 6:	status=false;
				break;
		}
		}
		while(status);
	}
		
	public void add()
	{
		
		//ObjectMapper objectMapper = new ObjectMapper();
    	//Set pretty printing of json
    	//objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
		Person person=new Person();
		Address address=new Address();
		System.out.println("Enter the First name:");
		String fname=s.next();
		person.setFname(fname);
	
		System.out.println("Enter the Last name:");
		String lname=s.next();
		person.setLname(lname);;
	
		System.out.println("Enter the City:");
		String city=s.next();
		address.setCity(city);
	
		System.out.println("Enter the Zip:");
		String zip=s.next();
		address.setZip(zip);
	
		System.out.println("Enter the State:");
		String state=s.next();
		address.setState(state);
		person.setAddress(address);
		list.add(person);
		
	/*	try {
			
			objectMapper.writeValue(file,list);
			//System.out.println(arrayToJson);
			
			
			
		} catch (IOException e) {
		
			e.printStackTrace();
		}*/
		
		//System.out.println(person.getFname()+" "+person.getLname()+" "+person.getAddress());
	//person.setAddress(s.next());
		
	}
	
	public void edit() {
		
	}
	public void search() {
		
	}
	public void delete() {
		
	}
	public void sortById() {
		
	}
	public void sortByZip() {
		
	}
	public ArrayList<Person> list()
	{
		return list;
	}
/*public static void main(String[] args) {
	AddressBook a=new AddressBook();
	a.add();
}*/
}
