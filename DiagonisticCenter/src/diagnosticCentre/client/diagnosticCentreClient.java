package diagnosticCentre.client;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import daiagnosticCentre.dto.ReportDto;
import daiagnosticCentre.dto.TestDto;
import diagnosticCentre.entity.Test;
import diagnosticCentre.exceptions.DaoException;
import diagnosticCentre.exceptions.InvalidEmailIdException;
import diagnosticCentre.exceptions.InvalidPhoneNumberException;
import diagnosticCentre.exceptions.InvalidTestNameException;
import diagnosticCentre.exceptions.ServiceException;
import diagnosticCentre.manager.TestManager;
import diagnosticCentre.manager.TestManagerImpl;

public class diagnosticCentreClient {

	public static void main(String[] args) {
		TestManager testManager = new TestManagerImpl();
		TestDto testDto = new TestDto();
		ReportDto report = new ReportDto();
		Scanner input = new Scanner(System.in);
		System.out.println("1.Add Diagonostic tests \n2.Generate Report \n3.Exit \nEnter your choice:");
		int choice = input.nextInt();
		do {
			switch (choice) {
			case 1:
				
				System.out.println(
						"Enter tests details \n1. Fetch patient-details by email\n2. Fetch patient-details by phone\nEnter your choice:");
				int choice1 = input.nextInt();
				String choice2 = "";
				
				List<Test> testList = new ArrayList<>();
				switch (choice1) {
				case 1:
					Test test;
					System.out.print("Enter Email:");
					String email = input.next();
					testDto.setEmail(email);
					do {
						test = new Test();
						System.out.print("Enter Test Name: ");
						String testName = input.next();
						test.setTestName(testName);
						testList.add(test);
						System.out.println("want to add more Tests [YES/NO]: ");
						choice2 = input.next();
					} while (choice2.equalsIgnoreCase("YES"));
					    testDto.setTest(testList);
					try {
						System.out.println(testManager.addTests(testDto));
					} catch (ServiceException e1) {
						// TODO Auto-generated catch block
						e1.getMessage();
					}
					break;
				case 2:
					
					System.out.println("Enter Phone No:");
					String phoneNo = input.next();
					testDto.setPhone(phoneNo);
					do {
						test = new Test();
						System.out.print("Enter Test Name: ");
						String testName = input.next();
						test.setTestName(testName);
						testList.add(test);
						System.out.println("want to add more Tests [YES/NO]: ");
						choice2 = input.next();
					} while (choice2.equalsIgnoreCase("YES"));
					 testDto.setTest(testList);
					try {
						System.out.println(testManager.addTests(testDto));
					} catch (ServiceException e) {
						// TODO Auto-generated catch block
						e.getMessage();
					}
					
						
					break;
				default:
					System.out.println("you entered a wrong choice");
					break;
				}
				break;
			case 2:
				System.out.println(
						"Enter tests details \n1. Fetch patient by email\n2. Fetch patient by phone\nEnter your choice:");
				choice1 = input.nextInt();
				SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
				switch (choice1) {
				case 1:
					System.out.print("Enter Email:");
					String email = input.next();
					System.out.print("Enter Test Date [DD-MM-YYYY]: ");
					String date = input.next();
					report = testManager.retrieveTestDetailsByEmail(email, date);
					System.out.println("Output: ");
					System.out.print("Name: ");
					System.out.println(report.getName());
					System.out.print("Email: ");
				    System.out.println(report.getEmail());
					System.out.print("Phone: ");
					System.out.println(report.getPhone());
					System.out.print("Date: ");
					String displayDate=sdf.format(report.getDate());
					System.out.println(displayDate);
					System.out.println();
					System.out.println("Test Details: ");
					System.out.println("\tTest\tCost");
					for(Test test : report.getTest()) {
						System.out.println("\t"+test.getTestName()+"\t"+test.getCost());
					}
						
					
					break;
				}

				break;
			case 3:

				break;
			default:
				System.out.println("you entered a wrong choice");
				break;
			}
			System.out.println("1.Add Diagonostic tests \n2.Generate Report \n3.Exit \nEnter your choice:");
			choice = input.nextInt();
		} while (choice != 3);
	}

}
