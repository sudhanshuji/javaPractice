package inheritance.service;

public class MotorVehicle {
	protected String modelName;
	protected int modelNumber;
	protected int modelPrice;

	public MotorVehicle() {

	}

	public MotorVehicle(String modelName, int modelNumber, int modelPrice) {
		this.modelName = modelName;
		this.modelNumber = modelNumber;
		this.modelPrice = modelPrice;

	}

	void display() {
		System.out.println("Model Name : " + this.modelName);
		System.out.println("Model Number : " + modelNumber);
		System.out.println("Model price : " + modelPrice);
	}
}
