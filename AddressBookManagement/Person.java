package com.bridgelabz.AddressBookManagement;

public class Person {
	private String fname;
	private String lname;
	private Address address;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [fname=" + fname + ", lname=" + lname + ", address="
				+ address + "]";
	}
}
