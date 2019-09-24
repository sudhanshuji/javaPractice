package inheritance.service;

public class Car extends MotorVehicle {

	int discountRate;

    public Car(String modelName,int modelNumber,int modelPrice,int discountRate) {
    	
    	this(discountRate);
    	
    	this.modelName=modelName;
    	this.modelNumber=modelNumber;
     	this.modelPrice=modelPrice;
   }
    
    public Car(int discountRate) {
    	this.discountRate = discountRate;
    }

//	public Car(String modelName, int modelNumber, int modelPrice, int discountRate) {
//		super(modelName, modelNumber, modelPrice);
//		this.discountRate = discountRate;
//	}

	public void discount() {
		float dR = (float) (discountRate / 100.00);
		float discount = modelPrice * dR;
		System.out.println("discount is : " + discount);
	}

	public void display() {
		super.display();

//		System.out.println("Car Name : " + modelName);
//		System.out.println("Car Model : " + modelNumber);
//		System.out.println("Car Price : " + modelPrice);
		System.out.println("discount Rate : " + 20);

	}
}