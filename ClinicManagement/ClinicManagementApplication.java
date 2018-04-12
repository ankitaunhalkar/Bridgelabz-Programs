package com.bridgelabz.ClinicManagement;

import java.util.Scanner;

public class ClinicManagementApplication {
	
	
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	AddToClinicInterface addClinic=new AddToClinic();
	DisplayClinicDetailsInterface displayClinic=new DisplayClinicDetails();
	SearchInClinicInterface searchClinic=new SearchInClinic();
	do{
	System.out.println("Choose Your Options:");
	System.out.println("1. To Add Appointment/Doctor \t 2. To Search Patient/Doctor \3. To display Patients/Doctor");
	switch (s.nextInt()) {
	case 1:
		
		addClinic.addChoices();
		break;
	case 2:
		
		searchClinic.searchChoices();
		break;
	case 3:
		
		displayClinic.displayChoices();
		break;
	case 4:
		System.exit(0);

	}
	}while(true);
}
}
