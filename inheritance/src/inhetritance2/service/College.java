package inhetritance2.service;

public class College {
   protected String collegeName;
   protected String address;
   


public College(String collegeName, String address) {
	this.collegeName = collegeName;
	this.address = address;
}



public void showCollegeDetails() {
	   System.out.println("Name of College : "+collegeName);
	   System.out.println("address : "+address);
   }
}
