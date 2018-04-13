package com.bridgelabz.ClinicManagement;

import java.io.File;

import java.util.ArrayList;

import java.util.Iterator;

import java.util.List;

import com.bridgelabz.utility.Utility;

public class AddToClinic implements AddToClinicInterface {

	private List<Patient> patientList;
	private List<Doctor> doctorList;
	private List<Appointment> apList;

	@Override
	public void addChoices() {

		boolean status = true;
		do {
			System.out.println("1.Add Appointment\t2.Add Doctor\t3.Back");
			switch (Utility.inputInt()) {
			case 1:
				addAppointment();
				break;
			case 2:
				addDoctor();
				break;
			case 3:
				status = false;
				break;
			}
		} while (status);

	}

	@Override
	public Patient addPatient() {
		File file = new File(
				"/home/bridgeit/workspace/Ankita/Ankita/ClinicFiles/Patient.json");
		patientList = new ArrayList<Patient>();
		patientList = ClinicUtil.readFile(file, Patient[].class);
		Patient patient = new Patient();
		patient.setId(patientList.size() + 1);
		System.out.println("Enter Patient's Name:");
		patient.setPname(Utility.inputString());
		System.out.println("Enter Patient's Mobile Number:");
		patient.setMobileNumber(Utility.inputlong());
		System.out.println("Enter Patient's Age:");
		patient.setAge(Utility.inputInt());
		patientList.add(patient);
		System.out.println(patient);
		ClinicUtil.writeFile(file, patientList);
		return patient;
	}

	@Override
	public void addAppointment() {
		File apfile = new File(
				"/home/bridgeit/workspace/Ankita/Ankita/ClinicFiles/Appointment.json");
		File docfile = new File(
				"/home/bridgeit/workspace/Ankita/Ankita/ClinicFiles/Doctor.json");

		doctorList = new ArrayList<Doctor>();
		apList = new ArrayList<Appointment>();

		doctorList = ClinicUtil.readFile(docfile, Doctor[].class);
		apList = ClinicUtil.readFile(apfile, Appointment[].class);

		System.out.println("Enter Doctors ID to appoint:");
		int docId = Utility.inputInt();
		System.out.println("Enter Time(AM/PM) to Book Appointment:");
		String appointtime = Utility.inputString();
		Iterator<Doctor> iterator = doctorList.iterator();

		while (iterator.hasNext()) {
			Doctor doctor = iterator.next();
			Appointment appointment = new Appointment();
			if (docId == doctor.getDoctorId()
					&& appointtime.equals(doctor.getAvailability())) {

				if (doctor.getPatientCount() == 0) {
					doctor.setPatientCount(1);
					System.out.println("Enter Patients details");
					appointment.setPatient(addPatient());
					appointment.setDoctorID(doctor.getDoctorId());
					appointment.setAppointtime(appointtime);
					System.out.println(appointment);
					apList.add(appointment);
					break;
				} else if (doctor.getPatientCount() > 0
						&& doctor.getPatientCount() <= 5) {
					doctor.setPatientCount(doctor.getDoctorId() + 1);
					System.out.println("Enter Patients details");
					appointment.setPatient(addPatient());
					appointment.setDoctorID(doctor.getDoctorId());
					appointment.setAppointtime(appointtime);
					System.out.println(appointment);
					apList.add(appointment);
					break;
				} else {
					System.out.println("Please come next time! ");
				}
			} else {
				System.out.println("No Doctor Available");
				break;
			}
		}
		ClinicUtil.writeFile(apfile, apList);
	}

	@Override
	public void addDoctor() {
		File file = new File(
				"/home/bridgeit/workspace/Ankita/Ankita/ClinicFiles/Doctor.json");
		Doctor doctor = new Doctor();
		doctorList = ClinicUtil.readFile(file, Doctor[].class);
		System.out.println("Enter Doctor's Name:");
		doctor.setDname(Utility.inputString());
		doctor.setDoctorId(doctorList.size() + 1);
		System.out.println("Enter Doctor's Availability:(AM/PM/Both)");
		doctor.setAvailability(Utility.inputString());
		System.out.println("Enter Doctor's Specialization:");
		doctor.setSpecialist(Utility.inputString());
		doctorList.add(doctor);
		ClinicUtil.writeFile(file, doctorList);
	}

}
