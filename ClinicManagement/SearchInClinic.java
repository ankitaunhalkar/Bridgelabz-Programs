package com.bridgelabz.ClinicManagement;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.bridgelabz.utility.Utility;

public class SearchInClinic implements SearchInClinicInterface {

	@Override
	public void searchPatient() {

		boolean status = true;
		System.out.println("Choose the field you want to search by:");
		File patfile = new File(
				"/home/bridgeit/workspace/Ankita/Ankita/ClinicFiles/Patient.json");

		List<Patient> list = new ArrayList<Patient>();
		Iterator<Patient> iterator;
		list = ClinicUtil.readFile(patfile, Patient[].class);
		do {
			System.out.println("1.ID\t2.Name\t3.Mobile Number\t4.Back");
			switch (Utility.inputInt()) {
			case 1:
				System.out.println("Enter the Patient id:");
				int pid = Utility.inputInt();
				iterator = list.iterator();
				while (iterator.hasNext()) {
					Patient patient = iterator.next();
					if (pid == patient.getId()) {
						System.out.println("Patient ID: " + patient.getId()
								+ " | Patient Name: " + patient.getPname()
								+ " | Patient Mobile Number: "
								+ patient.getMobileNumber()
								+ " | Patient Age: " + patient.getAge());
						break;
					}
				}
				break;

			case 2:
				System.out.println("Enter the Patient Name:");
				String pname = Utility.inputString();
				iterator = list.iterator();
				while (iterator.hasNext()) {
					Patient patient = iterator.next();
					if (pname.equals(patient.getPname())) {
						System.out.println("Patient ID: " + patient.getId()
								+ " | Patient Name:" + patient.getPname()
								+ " | Patient Mobile Number:"
								+ patient.getMobileNumber()
								+ " | Patient Age: " + patient.getAge());
						break;

					}
				}
				break;

			case 3:
				System.out.println("Enter the Patient Mobile Number:");
				long pnum = Utility.inputlong();
				iterator = list.iterator();
				while (iterator.hasNext()) {
					Patient patient = iterator.next();
					if (pnum == patient.getMobileNumber()) {
						System.out.println("Patient ID: " + patient.getId()
								+ " | Patient Name:" + patient.getPname()
								+ " | Patient Mobile Number:"
								+ patient.getMobileNumber()
								+ " | Patient Age: " + patient.getAge());
						break;
					}
				}
				break;
			default:
				status = false;
				break;
			}
		} while (status);
	}

	@Override
	public void searchDoctor() {
		boolean status = true;
		System.out.println("Choose the field you want to search by:");
		File docfile = new File(
				"/home/bridgeit/workspace/Ankita/Ankita/ClinicFiles/Doctor.json");

		List<Doctor> list = new ArrayList<Doctor>();
		Iterator<Doctor> iterator;
		list = ClinicUtil.readFile(docfile, Doctor[].class);
		do {
			System.out
					.println("1.ID\t2.Name\t3.Specialization\t4.Availability\t5.Back");
			switch (Utility.inputInt()) {
			case 1:
				// Name, Id, Specialization and Availability (AM, PM or both)
				System.out.println("Enter the Doctor Id:");
				int did = Utility.inputInt();
				iterator = list.iterator();
				while (iterator.hasNext()) {
					Doctor doctor = iterator.next();
					if (did == doctor.getDoctorId()) {
						System.out.println("Doctor ID: " + doctor.getDoctorId()
								+ " | Doctor Name: " + doctor.getDname()
								+ " | Doctor Specialization: "
								+ doctor.getSpecialist()
								+ " | Doctor Availability: "
								+ doctor.getAvailability());
						break;
					} else {
						System.out.println("Doctor Not Found !");
						break;
					}
				}
				break;

			case 2:
				// Name, Id, Specialization and Availability (AM, PM or both)
				System.out.println("Enter the Doctor Name:");
				String dname = Utility.inputString();
				iterator = list.iterator();
				while (iterator.hasNext()) {
					Doctor doctor = iterator.next();
					if (dname.equals(doctor.getDname())) {
						System.out.println("Doctor ID: " + doctor.getDname()
								+ " | Doctor Name: " + doctor.getDname()
								+ " | Doctor Specialization: "
								+ doctor.getSpecialist()
								+ " | Doctor Availability: "
								+ doctor.getAvailability());
						break;

					}
				}
				break;

			case 3:
				// Name, Id, Specialization and Availability (AM, PM or both)
				System.out.println("Enter the Doctor Specialization:");
				String special = Utility.inputString();
				iterator = list.iterator();
				while (iterator.hasNext()) {
					Doctor doctor = iterator.next();
					if (special.equals(doctor.getSpecialist())) {
						System.out.println("Doctor ID: " + doctor.getDname()
								+ " | Doctor Name:" + doctor.getDname()
								+ " | Doctor Specialization: "
								+ doctor.getSpecialist()
								+ " | Doctor Availability: "
								+ doctor.getAvailability());
						break;
					}
				}
				break;
			case 4:
				// Name, Id, Specialization and Availability (AM, PM or both)
				System.out.println("Enter the Doctor Availability:");
				String available = Utility.inputString();
				iterator = list.iterator();
				while (iterator.hasNext()) {
					Doctor doctor = iterator.next();
					if (available.equals(doctor.getAvailability())) {
						System.out.println("Doctor ID: " + doctor.getDname()
								+ " | Doctor Name:" + doctor.getDname()
								+ " | Doctor Specialization: "
								+ doctor.getSpecialist()
								+ " | Doctor Availability: "
								+ doctor.getAvailability());
						break;
					}
				}
				break;

			default:
				status = false;
				break;
			}
		} while (status);
	}

	@Override
	public void searchChoices() {

		boolean status = true;
		do {
			System.out.println("Choose whom you want to search:");
			System.out.println("1.Search Doctor \t 2.Search Patient \t 3.Back");
			switch (Utility.inputInt()) {
			case 1:
				searchDoctor();
				break;

			case 2:
				searchPatient();
				break;

			default:
				status = false;
				break;
			}
		} while (status);
	}

}
