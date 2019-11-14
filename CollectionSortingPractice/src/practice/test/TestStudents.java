package practice.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import practice.entity.College;
import practice.entity.Student;
import practice.entity.University;
import practice.service.StudentService;

public class TestStudents {

	@Test
	public void testAscending() {
		List<Student> students = new ArrayList<>();

		University university = new University(generateRandomString(6) + " " + generateRandomString(4));
		String collegeCode = generateRandomString(3);
		String collegeName = generateRandomString(6) + " " + generateRandomString(4) + " " + generateRandomString(5)
				+ " " + generateRandomString(4);
		College college = new College(collegeCode, collegeName, university);
		String studentName = generateRandomString(6) + " " + generateRandomString(4);
		Student st = new Student(studentName, college);
		students.add(st);

		StudentService service = new StudentService();
		students = service.sortAscending(students);
		for (Student s : students) {
			System.out.println(s.toString());
		}

	}

	@Test
	public void testAscending1() {
		String[] studentName = new String[5];
		String[] collegeName = new String[5];
		String[] collegeCode = new String[5];
		String[] universityName = new String[5];
		List<Student> students = new ArrayList<>();
		studentName[0] = "golu";
		studentName[1] = "utkarsh";
		studentName[2] = "aman";
		studentName[3] = "aman";
		studentName[4] = "aman";
		collegeName[0] = "oist";
		collegeName[1] = "lnct";
		collegeName[2] = "tit";
		collegeName[3] = "tit";
		collegeName[4] = "rkdf";
		collegeCode[0] = "0105";
		collegeCode[1] = "0101";
		collegeCode[2] = "0102";
		collegeCode[3] = "0109";
		collegeCode[4] = "0104";
		universityName[0] = "rgpv";
		universityName[1] = "uit";
		universityName[2] = "barkatullah";
		universityName[3] = "harward";
		universityName[4] = "magadh";
		for (int i = 0; i < 5; i++) {
			University universities = new University(universityName[i]);
			College colleges = new College(collegeCode[i], collegeName[i], universities);
			Student studds = new Student(studentName[i], colleges);
			students.add(studds);
		}
		StudentService service = new StudentService();
		students = service.sortAscending(students);
		for (Student s : students) {
			System.out.println(s.toString());
		}

	}

	@Test
	public void testDescending() {
		String[] studentName = new String[5];
		String[] collegeName = new String[5];
		String[] collegeCode = new String[5];
		String[] universityName = new String[5];
		List<Student> students = new ArrayList<>();
		studentName[0] = "golu";
		studentName[1] = "utkarsh";
		studentName[2] = "aman";
		studentName[3] = "aman";
		studentName[4] = "lincon";
		collegeName[0] = "oist";
		collegeName[1] = "lnct";
		collegeName[2] = "tit";
		collegeName[3] = "truba";
		collegeName[4] = "rkdf";
		collegeCode[0] = "0105";
		collegeCode[1] = "0101";
		collegeCode[2] = "0109";
		collegeCode[3] = "0102";
		collegeCode[4] = "0104";
		universityName[0] = "rgpv";
		universityName[1] = "uit";
		universityName[2] = "barkatullah";
		universityName[3] = "harward";
		universityName[4] = "magadh";
		for (int i = 0; i < 5; i++) {
			University universities = new University(universityName[i]);
			College colleges = new College(collegeCode[i], collegeName[i], universities);
			Student studds = new Student(studentName[i], colleges);
			students.add(studds);
		}
		StudentService service = new StudentService();
		students = service.sortDescending(students);
		for (Student s : students) {
			System.out.println(s.toString());
		}

	}

	private String generateRandomString(int size) {
		String str = "";
		double random = Math.random();
		String sample = "abcdefghijklmnopqrstuvwxyz";
		String sampleCapital = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int i = (int) (random * sampleCapital.length()); // TYPECASTING

		str += sampleCapital.charAt(i);

		for (int x = 0; x < size - 1; x++) {
			random = Math.random();
			int index = (int) (random * sample.length()); // TYPECASTING
			str += sample.charAt(index);
		}

		return str;
	}

}
