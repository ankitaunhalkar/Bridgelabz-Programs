package com.bridgelabz.ClinicManagement;

public class Doctor {
	// Name, Id, Specialization and Availability (AM, PM or both)
	private String dname;
	private String specialist;
	private String availability;

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getSpecialist() {
		return specialist;
	}

	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}
}
