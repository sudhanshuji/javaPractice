package student.client;

import java.util.ArrayList;

import student.entity.Student;
import student.service.StudentOperation;

public class StudentClient {

	public static void main(String[] args) {

		ArrayList<Student> students = new ArrayList<>();
		StudentOperation operate=new StudentOperation();
		Student student1=new Student(108,"golu");
		Student student2=new Student(112,"utkarsh");
		Student student3=new Student(112,"utkarsh");
		Student student4=new Student(118,"Abraham");
		Student student5=new Student(121,"Linkon");
		if (student2.equals(student3)) {
			System.out.println("true");
		}
		else 
			System.out.println("false");
		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		students.add(student5);
		operate.passArraylistToHashset(students);
		operate.iterateListforhashset();
		operate.passArraylistToTreeset(students);
		System.out.println("treeset");
		operate.iterateListforTreeset();
		System.out.println("linkedHashSet");
		operate.passArraylistToLinkedHashset(students);
		operate.iterateListforLinkedHashset();
	}

}
