package students.client;

import java.util.HashMap;

import Student.entity.Student;
import studentService.StudentOeration;

public class StudentClient {

	public static void main(String[] args) {

		Student student1 = new Student(108, "Golu");
		Student student2 = new Student(111, "utkarsh");
		Student student3 = new Student(114, "Aman");
		Student student4 = new Student(117, "Abraham");
		Student student5 = new Student(120, "Linkon");
		Student student6 = new Student(123, "Linkon1");

		StudentOeration operate = new StudentOeration();

		HashMap<String, Student> students = new HashMap<>();
		students.put("First", student1);
		students.put("Second", student2);
		students.put("third", student3);
		students.put("fourth", student4);
		students.put("Fifth", student5);
		students.put("Fifth", student6);

		HashMap<Student, Integer> result = new HashMap<>();
		result.put(student1, 495);
		result.put(student2, 485);
		result.put(student3, 475);
		result.put(student4, 465);
		result.put(student5, 455);
		result.put(student5, 456);
		System.out.println("Size of map: "+result.size());
		System.out.println();
		System.out.println("Marks of Students");
		operate.printStudentMarks(result);
		System.out.println();
		System.out.println("ranks of students");
		operate.printStudentRanks(students);

	}

}
