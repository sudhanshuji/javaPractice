package student_record.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import student_records.entity.Student;
import student_records.entity.StudentDto;

public class StudentRecordDao {
	private String query1 = "";
	private String query2 = "";
	private String query3 = "";
	private String query4 = "";
	private String query5 = "";
	private String query6 = "";
	private String query7 = "";
	private String query8 = "";
	private static int streamID;
	private static int studentID;
	private static String studentName;
	private static String streamName;
	Statement st = null;

	public List<StudentDto> getStudentsCount() throws DaoException {
		List<StudentDto> countStudentperStream = new ArrayList<StudentDto>();
		StudentDto student = new StudentDto();
		try {
			Connection conn = DBUtil.getConnection();
			st = conn.createStatement();
			query3 = "SELECT streams.stream_name,COUNT(students.stream_id) " + "FROM students " +"inner join streams on students.stream_id=streams.stream_id "+ "GROUP BY students.stream_Id;";
			System.out.println(query3);
			ResultSet rs = st.executeQuery(query3);
			while (rs.next()) {
				System.out.println(rs.getString(1) + " " + rs.getInt(2));
				student.setStream_id(rs.getInt(2));
				student.setStudents_count(rs.getInt(2));
				countStudentperStream.add(student);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return countStudentperStream;
	}
	
	
	public int insertAllStudents(List<Student> students) throws DaoException {
		int result = 0;
		Connection conn;
		query4 = "insert into students " + "Values(?,?,?);";
		query5 = "select * from students;";
		query6 = "delete from students where student_id=43;";
		query7 = "update students set name='Santan Aryan' where student_id=64";
		System.out.println(query4);
		try {
			conn = DBUtil.getConnection();
			PreparedStatement ps = conn.prepareStatement(query4);
			PreparedStatement ps1 = conn.prepareStatement(query5);
			PreparedStatement ps2 = conn.prepareStatement(query6);
			PreparedStatement ps3 = conn.prepareStatement(query7);
			for (Student s : students) {
				streamID = s.getStream().getStreamId();
				streamName = s.getStream().getStreamName();
				studentName = s.getName();
				studentID = s.getStudentId();
				ps.setInt(1, studentID);
				ps.setString(2, studentName);
				ps.setInt(3, streamID);
				ps.executeUpdate();
				ResultSet rs = ps1.executeQuery();
				while (rs.next()) {
					System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
				}
			}
			result = ps2.executeUpdate();
			ps3.executeUpdate();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	public boolean insertAllStudentsBatch(List<Student> students) throws DaoException {
		int res[]=new int[students.size()];
		Connection conn;
		query8 = "insert into students " + "Values(?,?,?);";
	
		     try {
				conn = DBUtil.getConnection();
				PreparedStatement ps=conn.prepareStatement(query8);
				for(Student s:students) {
					ps.setInt(1, s.getStudentId());
					ps.setString(2,s.getName());
					ps.setInt(3, s.getStream().getStreamId());
					ps.addBatch();
				}
			    res=ps.executeBatch();
				for(int k:res) {
					System.out.println(k);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		if (res == null)
		return false;
		else
			return true;
	}

//	public boolean insertStudents(List<Student> students) throws DaoException{
//		// batch insert
//		int result = 0;
//		try {
//			Connection conn = DBUtil.getConnection();
//			st=conn.createStatement();
//			
//			for( Student s:students) {
//				streamID=s.getStream().getStreamId();
//				streamName=s.getStream().getStreamName();
//				studentName=s.getName();
//				studentID=s.getStudentId();
//				
//			query1="insert into students "
//				+"Values("+studentID+",'"+studentName+"',"+streamID+");";
//			System.out.println(query1);
//			query2="select * from students;";
//			result=st.executeUpdate(query1);
//			ResultSet rs=st.executeQuery(query2);
//			while(rs.next()) {
//				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
//			}
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		if(result == 1)
//		return true;
//		else 
//			return false;
//	}

}
