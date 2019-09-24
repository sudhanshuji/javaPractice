package inheritance4.service;

public class Employee {
    String name;
    String address;
    int age;
    String gender;
    
    
    
    public Employee(String name, String address, int age, String gender) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
		this.gender = gender;
	}

   


	public void display() {
		System.out.println("Name of Employee : "+name);
    	System.out.println("Address : "+address);
    	System.out.println("Age : "+age);
    	System.out.println("Gender : "+gender);
	
		
	}


	
}
