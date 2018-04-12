package com.bridgelabz.ClinicManagement;

public class Appointment {
	private Patient patient;
	private Doctor doctor;
	private String appointdate;
	
	public Appointment() {
		// TODO Auto-generated constructor stub
	}
	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public String getAppointdate() {
		return appointdate;
	}

	public void setAppointdate(String appointdate) {
		this.appointdate = appointdate;
	}
}
