package com.bridgelabz.ClinicManagementSystem;


public class Appointment {
	private Patient patient;
	private int DoctorID;
	private String appointtime;

	public int getDoctorID() {
		return DoctorID;
	}

	public void setDoctorID(int doctorID) {
		DoctorID = doctorID;
	}
	
	public Appointment() {
		// TODO Auto-generated constructor stub
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public String getAppointtime() {
		return appointtime;
	}

	public void setAppointtime(String appointtime) {
		this.appointtime = appointtime;
	}

}
