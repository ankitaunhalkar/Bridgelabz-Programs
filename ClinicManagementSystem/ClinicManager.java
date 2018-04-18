package com.bridgelabz.ClinicManagementSystem;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.bridgelabz.utility.Utility;

public class ClinicManager {

	private List<Patient> patientList;
	private List<Doctor> doctorList;
	private List<Appointment> apList;

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

		ClinicUtil.writeFile(file, patientList);

		return patient;
	}

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

				if (doctor.getPatientCount() >= 0
						&& doctor.getPatientCount() <= 5) {

					doctor.setPatientCount(doctor.getPatientCount() + 1);

					System.out.println("Enter Patients details");
					appointment.setPatient(addPatient());

					appointment.setDoctorID(doctor.getDoctorId());
					appointment.setAppointtime(appointtime);

					apList.add(appointment);
					System.out.println("Appointment Fixed");

					ClinicUtil.writeFile(docfile, doctorList);
					ClinicUtil.writeFile(apfile, apList);
					break;
				} else {
					System.out.println("Please come next time! ");
				}
			}
		}

	}

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

	public void displayPatient() {
		List<Patient> list = new ArrayList<Patient>();
		File file = new File(
				"/home/bridgeit/workspace/Ankita/Ankita/ClinicFiles/Patient.json");
		list = ClinicUtil.readFile(file, Patient[].class);
		Iterator<Patient> iterator = list.iterator();
		System.out.println("ID\tName\tMobile Number\tAge");
		while (iterator.hasNext()) {
			Patient patient = iterator.next();
			System.out.println(patient.getId() + " \t" + patient.getPname()
					+ " \t" + patient.getMobileNumber() + " \t"
					+ patient.getAge());
		}
	}

	public void displayDoctor() {
		List<Doctor> list = new ArrayList<Doctor>();
		File file = new File(
				"/home/bridgeit/workspace/Ankita/Ankita/ClinicFiles/Doctor.json");
		list = ClinicUtil.readFile(file, Doctor[].class);
		Iterator<Doctor> iterator = list.iterator();
		System.out.println("ID\tName\tSpecialization\tAvailability");
		while (iterator.hasNext()) {
			Doctor doctor = iterator.next();
			System.out.println(doctor.getDoctorId() + " \t" + doctor.getDname()
					+ " \t" + doctor.getSpecialist() + " \t"
					+ doctor.getAvailability());
		}

	}

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

}
