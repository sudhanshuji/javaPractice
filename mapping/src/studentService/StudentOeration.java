package studentService;

import java.util.HashMap;

import Student.entity.Student;

public class StudentOeration {

	HashMap<String, Student> studentRank;
	HashMap<Student, Integer> studentMarks;

	public StudentOeration() {
		super();
		this.studentRank = new HashMap<>();
		this.studentMarks = new HashMap<>();
	}

	public StudentOeration(HashMap<String, Student> studentRank, HashMap<Student, Integer> studentMarks) {
		super();
		this.studentRank = studentRank;
		this.studentMarks = studentMarks;
	}

	public void printStudentMarks(HashMap<Student, Integer> set) {
		this.studentMarks = set;
		for (Student s : studentMarks.keySet()) {
			System.out.print(s.getRollNumber() + ":");
			System.out.print(s.getName() + " ");
			System.out.print(studentMarks.get(s));
			System.out.println();
		}
	}

	public void printStudentRanks(HashMap<String, Student> set) {
		this.studentRank = set;
		for (String s : studentRank.keySet()) {
			System.out.print(studentRank.get(s).getRollNumber()+":");
			System.out.print(studentRank.get(s).getName()+" ");
			System.out.print(s);
			System.out.println();
		}
	}

}
