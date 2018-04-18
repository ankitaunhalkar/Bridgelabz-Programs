package com.bridgelabz.ClinicManagement;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.bridgelabz.ClinicManagementSystem.ClinicUtil;
import com.bridgelabz.ClinicManagementSystem.Doctor;
import com.bridgelabz.ClinicManagementSystem.Patient;
import com.bridgelabz.utility.Utility;

public class DisplayClinicDetails implements DisplayClinicDetailsInterface {

	@Override
	public void displayPatient() {
		List<Patient> list = new ArrayList<Patient>();
		File file = new File(
				"/home/bridgeit/workspace/Ankita/Ankita/ClinicFiles/Patient.json");
		list = ClinicUtil.readFile(file, Patient[].class);
		Iterator<Patient> iterator = list.iterator();
		System.out.println("ID\tName\tMobile Number\tAge");
		while (iterator.hasNext()) {
			Patient patient = iterator.next();
			System.out.println(patient.getId()
					+ " \t" + patient.getPname()
					+ " \t" + patient.getMobileNumber()
					+ " \t" + patient.getAge());
		}
	}

	@Override
	public void displayDoctor() {
		List<Doctor> list = new ArrayList<Doctor>();
		File file = new File(
				"/home/bridgeit/workspace/Ankita/Ankita/ClinicFiles/Doctor.json");
		list = ClinicUtil.readFile(file, Doctor[].class);
		Iterator<Doctor> iterator = list.iterator();
		System.out.println("ID\tName\tSpecialization\tAvailability");
		while (iterator.hasNext()) {
			Doctor doctor = iterator.next();
			System.out.println(doctor.getDoctorId()
					+ " \t" + doctor.getDname()
					+ " \t" + doctor.getSpecialist()
					+ " \t" + doctor.getAvailability());
		}

	}

	@Override
	public void displayPopularDoctor() {
		List<Doctor> list = new ArrayList<Doctor>();
		File file = new File(
				"/home/bridgeit/workspace/Ankita/Ankita/ClinicFiles/Doctor.json");
		list = ClinicUtil.readFile(file, Doctor[].class);
		Iterator<Doctor> iterator = list.iterator();
		while (iterator.hasNext()) {
			Doctor doctor = iterator.next();
			if (doctor.getPatientCount() == 5) {
				System.out
						.println("Doctor ID: " + doctor.getDoctorId()
								+ " | Doctor Name: " + doctor.getDname()
								+ " | Doctor Specialization: "
								+ doctor.getSpecialist()
								+ " | Doctor Availability: "
								+ doctor.getAvailability());
			}
		}

	}

	@Override
	public void displayChoices() {

		boolean status = true;
		do {
			System.out.println("Choose whom you want to search:");
			System.out
					.println("1.Display Doctor \t 2.Display Patient \t 3.Display Popular Doctor \t 4. Back");
			switch (Utility.inputInt()) {
			case 1:
				displayDoctor();
				break;

			case 2:
				displayPatient();
				break;

			case 3:
				displayPopularDoctor();
				break;

			default:
				status = false;
				break;
			}
		} while (status);

	}
}
