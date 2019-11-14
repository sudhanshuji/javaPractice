package student.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

import student.entity.Student;

public class StudentOperation {
	
	HashSet<Student> studentinfo;
	TreeSet<Student> studentinformation;
	LinkedHashSet<Student> studentlinkedSet;

	public StudentOperation() {
		studentinfo=new HashSet<>();
		studentinformation=new TreeSet<>();
		studentlinkedSet=new LinkedHashSet<>();
	}



	public StudentOperation(HashSet<Student> studentinfo) {
		super();
		this.studentinfo = studentinfo;
	}
	
	public void passArraylistToHashset(ArrayList<Student> array) {
		studentinfo.addAll(array);
		studentinfo.add(new Student(112,"utkarsh"));
		
		
	}
	
	
	public void iterateListforhashset() {
		for(Student s:studentinfo) {
			System.out.print(s.getRollNumber()+" :");
			System.out.println(s.getName());
		}	
	}
	
	public void passArraylistToTreeset(ArrayList<Student> array) {
		studentinformation.addAll(array);
		studentinformation.add(new Student(112,"tambi"));
	}

	public void iterateListforTreeset() {
		for(Student s:studentinformation) {
			System.out.print(s.getRollNumber()+" :");
			System.out.println(s.getName());
		}	
	}
	
	public void passArraylistToLinkedHashset(ArrayList<Student> array) {
		studentlinkedSet.addAll(array);
		studentlinkedSet.add(new Student(112,"tambi"));
	}
	
	public void iterateListforLinkedHashset() {
		for(Student s:studentlinkedSet) {
			System.out.print(s.getRollNumber()+" :");
			System.out.println(s.getName());
		}	
	}

		
}
