package com.bridgelabz.ClinicManagement;

public class Patient {
	// Name, ID, Mobile Number and Age
	private String pname;
	private long mobileNumber;
	private int age;

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
