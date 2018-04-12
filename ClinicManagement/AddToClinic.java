package com.bridgelabz.ClinicManagement;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;


public class AddToClinic implements AddToClinicInterface {
	Scanner s = new Scanner(System.in);
	static List<Patient> patientList;
	static List<Doctor> doctorList;
	static List<Appointment> apList;
	@Override
	public void addChoices() {

		boolean status = true;
		do {
			System.out.println("1.Add Appointment\t2.Add Doctor\t3.Back");
			switch (s.nextInt()) {
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
		Patient patient = new Patient();
		System.out.println("Enter Patient's Name:");
		patient.setPname(s.next());
		System.out.println("Enter Patient's Mobile Number:");
		patient.setMobileNumber(s.nextLong());
		System.out.println("Enter Patient's Age:");
		patient.setAge(s.nextInt());
		patientList.add(patient);
		writeFile(file, patientList);
		return patient;
	}

	@Override
	public void addAppointment() {
		File file = new File(
				"/home/bridgeit/workspace/Ankita/Ankita/ClinicFiles/Appointment.json");
		File docfile = new File(
				"/home/bridgeit/workspace/Ankita/Ankita/ClinicFiles/Doctor.json");

		doctorList=readFile(docfile,Doctor.class);
		apList=readFile(file,Appointment.class);
		System.out.println(doctorList);
		System.out.println(apList);
		Appointment appointment = new Appointment();
		Doctor doctor = null;
		System.out.println("Enter Doctors ID to appoint:");
		int docId = s.nextInt();
	
		Iterator<Doctor> iterator = doctorList.iterator();
	
	while (iterator.hasNext()) {
			doctor=iterator.next();
			if (docId == doctor.getDoctorId()) {
				System.out.println("Enter Patients details");
				appointment.setPatient(addPatient());
				appointment.setDoctor(doctor);
			
				break;
			}
			else
			{
				System.out.println("No doctor found");
			}
		}
	

		System.out.println("Enter Date to Book Appointment:");
		appointment.setAppointdate(s.next());

		apList.add(appointment);
		writeFile(file, apList);
	}

	@Override
	public void addDoctor() {
		File file = new File(
				"/home/bridgeit/workspace/Ankita/Ankita/ClinicFiles/Doctor.json");
		Doctor doctor = new Doctor();
		doctorList = readFile(file,Doctor.class);
		System.out.println("Enter Doctor's Name:");
		doctor.setDname(s.next());
		doctor.setDoctorId(doctorList.size()+1);
		System.out.println("Enter Doctor's Availability:");
		doctor.setAvailability(s.next());
		System.out.println("Enter Doctor's Specialization:");
		doctor.setSpecialist(s.next());
		doctorList.add(doctor);
		writeFile(file, doctorList);
	}

	public <T> void writeFile(File file, List<T> doctorList2) {
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			objectMapper.writeValue(file, doctorList2);
			System.out.println("SuccessFully Added");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public <T> List<T> readFile(File file,Class<T> clazz) {
		ObjectMapper objectMapper = new ObjectMapper();
		ArrayList<T> arraylist = new ArrayList<T>();
		List<T> list = null;
		System.out.println(file);
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String jsonToArray;
			if ((jsonToArray = reader.readLine()) != null) {
				System.out.println(jsonToArray);
			/*	TypeReference<ArrayList<T>> type = new TypeReference<ArrayList<T>>() {
				};
				arraylist = objectMapper.readValue(jsonToArray, type);*/
				//arraylist = new ArrayList<T>((Integer) objectMapper.readValue(file, clazz));
				list=new ArrayList<T>(Arrays.asList(objectMapper.readValue(file, clazz)));
				System.out.println(arraylist);
			}
			reader.close();
		} catch (IOException e) {

			e.printStackTrace();
		}
		return list;

	}

	public static void main(String[] args) {
		AddToClinic a = new AddToClinic();
		a.addChoices();
	}

}
