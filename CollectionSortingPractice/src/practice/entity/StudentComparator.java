package practice.entity;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

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

}
