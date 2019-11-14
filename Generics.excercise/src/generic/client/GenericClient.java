package generic.client;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TimeZone;

import entity.Department;
import entity.Student;
import question1.LinkedListObject;
import question1.LinkedListOperations;

public class GenericClient {

	private static final String dateFormat = "MM/dd/YYYY";

	public static void main(String[] args) {
		linkedListOperations();
		linkedListobject();

	}

	private static void linkedListobject() {
		Department dept1 = new Department("Computer science", "dr. Sanjay sinha");
		Department dept2 = new Department("Electrical and electronics", "dr.Monika Moogre");
		Department dept3 = new Department("Electronics and communication", "dr. mohd. ahemad");
		Department dept4 = new Department("Civil", "dr. Manish Bhillore");
		Department dept5 = new Department("Mechanical ", "dr. Sandeep Moonga");
		String dateStr = "01/01/1997";
		SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
		sdf.setTimeZone(TimeZone.getDefault());
		Date date = null;
		try {
			date = sdf.parse("01/01/1997");
			System.out.println(date);
		} catch (ParseException e) {
			System.out.println("error while parsing date:- " + e.getMessage());
		}
		date = new Date();
		Student student1 = new Student("Golu", date, 2015, dept1);
		Student student2 = new Student("utkarsh", date, 2016, dept2);
		Student student3 = new Student("Aman", date, 2017, dept3);
		Student student4 = new Student("Abraham", date, 2018, dept4);
		Student student5 = new Student("Lincon", date, 2019, dept5);
		student1.getDateOfBirth();
		student2.getDateOfBirth();
		LinkedListObject listObj = new LinkedListObject();
		listObj.adddetails(student1, student2, student3, student4, student5);
		listObj.listIterateForEach();
		listObj.revStudentlist();
		Scanner scanner = new Scanner(System.in);
		// Student stud=new Student();
		// Department[] dep = new Department[2];
		// dep[i].setDept(scanner.nextLine());
		// dep[i].setHod(scanner.nextLine());
		Student[] studs = new Student[2];
		System.out.println("enter the details of 2 students");
		for (int i = 0; i <= 1; i++) {
			System.out.println("enter department name ");
			Department dept = new Department();
			dept.setDept(scanner.next());
			System.out.println("enter hod name ");
			dept.setHod(scanner.next());

			studs[i] = new Student();
			System.out.println("enter student's year");
			studs[i].setYear(scanner.nextInt());
			System.out.println("enter student name");
			String name = scanner.next();
			studs[i].setName(name);
			studs[i].setDateOfBirth(new Date());
			studs[i].setDept(dept);

		}

		listObj.addElementsusingArr(studs);
		listObj.listIterateForEach();

	}

	private static void linkedListOperations() {
		LinkedListOperations obj = new LinkedListOperations();
		obj.addElements("my", "name", "is", "Golu");
		LinkedList<String> list = new LinkedList<>();
		list.add("new ");
		obj.copyLinkList(list);
		obj.iterateListUsingIterator();
		obj.listiterateforeach();
		obj.revLinkedList();
		System.out.println("Reversed linked list is:");
		obj.iterateListUsingIterator();
		Scanner data = new Scanner(System.in);
		String[] array = new String[5];
		System.out.println("enter the list");
		for (int i = 0; i <= array.length - 1; i++)
			array[i] = data.next();
		obj.addElementsusingArr(array);
		obj.iterateListUsingIterator();

	}

}
