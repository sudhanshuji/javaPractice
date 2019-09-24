package inheritance4.service;

public class FullTimeEmployee extends Employee {
	int salary;
	String designation;
	
	
	
	public FullTimeEmployee(String name, String address, int age, String gender, int salary, String designation) {
		super(name, address, age, gender);
		this.salary = salary;
		this.designation = designation;
	}



	public void display() {
		super.display();
		System.out.println("Salary : "+salary);
		System.out.println("Designation : "+designation);
	}

}
