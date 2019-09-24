package inheritance.client;

import inheritance.service.Car;

public class MotorVehicleOperations {
	public static void main(String[] args) {
		Car car = new Car("bmw",346789,700000,20);
		car.display();
		car.discount();

	}

}
