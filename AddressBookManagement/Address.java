package com.bridgelabz.AddressBookManagement;

public class Address {
	private String city;
	private long zip;
	private String state;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getZip() {
		return zip;
	}

	public void setZip(long zip) {
		this.zip = zip;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", zip=" + zip + ", state=" + state
				+ "]";
	}
}
