package inheritance4.service;

public class PartTimeEmployee extends Employee {
	int workingHours;
	int ratePerHour;
	int amount;
	

	public int calculatePay() {
		int amount = (workingHours * ratePerHour);
		this.amount = amount;
		return amount;
	}

	public void display() {
		super.display();
		System.out.println("Amount paytble : " + amount);

	}

	public PartTimeEmployee(String name, String address, int age, String gender, int workingHours, int ratePerHour) {
		super(name, address, age, gender);
		this.workingHours = workingHours;
		this.ratePerHour = ratePerHour;
	}

}
