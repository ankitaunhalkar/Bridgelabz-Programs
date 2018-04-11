package com.bridgelabz.AddressBookManagement;

import java.util.ArrayList;

public interface AddressBookInterface {
	public void operation(ArrayList<Person> arrayRead);
	public void add();
	public void edit();
	public void delete();
	public void sortByLastname();
	public void sortByZip();
	public ArrayList<Person> list();
}
