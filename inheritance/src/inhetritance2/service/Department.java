package inhetritance2.service;

public class Department extends College {


	String departmentName;
	String hodName;

	

	public Department(String collegeName, String address, String departmentName, String hodName) {
		super(collegeName,address);
		this.departmentName = departmentName;
		this.hodName = hodName;
	}






	public void showDepartmentDetails() {
		System.out.println("Name of the Department : "+departmentName);
		System.out.println("Head of Department : "+hodName);
	}
}
