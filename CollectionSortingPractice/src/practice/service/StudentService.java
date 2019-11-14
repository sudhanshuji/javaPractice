package practice.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import practice.entity.Student;

public class StudentService {
	public List<Student> sortAscending(List<Student> students) {
		Collections.sort(students);
		return students;
	}

	public List<Student> sortDescending(List<Student> students) {
		Collections.sort(students);
		List<Student> ultaStudents = new ArrayList<>();
		Collections.sort(students, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				int sn = o2.getStudentName().compareTo(o1.getStudentName());
				if (sn == 0) {
					int cn = o2.getCollege().getCollegeName().compareTo(o1.getCollege().getCollegeName());
					if (cn == 0) {
						int un = o2.getCollege().getUniversity().getUniversityName()
								.compareTo(o1.getCollege().getUniversity().getUniversityName());
						return un;
					} else
						return cn;
				} else
					return sn;

			}
		});
		// Collections.reverse(students);
		ultaStudents = students;
		return students;
	}

}
