package inheritance2.client;

import inhetritance2.service.FacultyMember;

public class ColegeClient {

	public static void main(String[] args) {
		  FacultyMember facultyDetails=new FacultyMember("OIST","Raisen Road,Patel Nagar,Bhopal", "Electricel and Electronics", "Dr Monika Jain","Priyanka Upadhyaye Mishra","M.tech",50);
		  facultyDetails.showFacultyMemberDetails();
		  facultyDetails.showDepartmentDetails();
		  facultyDetails.showCollegeDetails();

	}

}
