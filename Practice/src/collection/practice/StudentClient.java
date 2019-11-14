package collection.practice;

import java.util.ArrayList;

public class StudentClient {

	public static void main(String[] args) {
		Student studd = new Student(108, "Golu");
		Student studd1 = new Student(112, "Utkarsh");
		Student studd3 = new Student(116, "Aman");
		Student studd4 = new Student(120, "Abraham");
		Student studd5 = new Student(124, "Lincoln");
		ArrayList<Student> studds = new ArrayList<>();
		studds.add(studd);
		studds.add(studd1);
		studds.add(studd3);
		studds.add(studd5);
		studds.add(studd4);
		studds.add(studd5);
		Student studdds = new Student(studds);
		System.out.println(studd.hashSetOperation().size());
		studd.iterateList();

	}

}
