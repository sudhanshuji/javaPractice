package inhetritance2.service;

public class FacultyMember extends Department {
	String facultyMemberName;
	String facultyMemberQualification;
	int	   noOfYearsWorked;

	
	
	public FacultyMember(String collegeName, String address, String departmentName, String hodName,
			String facultyMemberName, String facultyMemberQualification, int noOfYearsWorked) {
		super(collegeName, address, departmentName, hodName);
		this.facultyMemberName = facultyMemberName;
		this.facultyMemberQualification = facultyMemberQualification;
		this.noOfYearsWorked = noOfYearsWorked;
	}



	public void showFacultyMemberDetails() {
		System.out.println("Name of the Faculty : "+facultyMemberName);
		System.out.println("Qualification : "+facultyMemberQualification);
		System.out.println("Number of years Worked : "+noOfYearsWorked);
		
	}



	
}


