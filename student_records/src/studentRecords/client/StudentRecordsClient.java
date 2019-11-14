package studentRecords.client;

import java.util.ArrayList;
import java.util.List;

import student_record.dao.DaoException;
import student_record.dao.StudentRecordDao;
import student_records.entity.Stream;
import student_records.entity.Student;

public class StudentRecordsClient {
	static Stream stream1=new Stream();
	static Student student1=new Student();
	static Stream stream2=new Stream();
	static Student student2=new Student();
	static Stream stream3=new Stream();
	static Student student3=new Student();
	
	public static void main(String[] args) {
		List<Student> students=new ArrayList<Student>();
		stream1.setStreamId(1);
		stream1.setStreamName("Computer science engineering");
		student1.setStream(stream1);
		student1.setName("sanjay sahu");
		student1.setStudentId(79);
		stream2.setStreamId(1);
		stream2.setStreamName("Computer science engineering");
		student2.setStream(stream2);
		student2.setName("Anushka seth");
		student2.setStudentId(66);
		stream3.setStreamId(1);
		stream3.setStreamName("Computer science engineering");
		student3.setStream(stream3);
		student3.setName("Ayushi Rawat");
		student3.setStudentId(73);
		students.add(student1);
		students.add(student2);
		students.add(student3);
		StudentRecordDao studentInput=new StudentRecordDao();
		
		try {
			//System.out.println(studentInput.insertStudents(students));
			//System.out.println(studentInput.insertAllStudents(students));
			studentInput.insertAllStudentsBatch(students);
			studentInput.getStudentsCount();
		} catch (DaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
