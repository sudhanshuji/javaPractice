package practice.client;

import practcie.entity.ComplexNumber;
import practcie.service.ComplexNumbersOperatipons;

public class ComplexNumberClient {

	public static void main(String[] args) {
		

		ComplexNumber array[]=new ComplexNumber[4];
		
		array[0] = new ComplexNumber(3, 6);
		
		array[1] = new ComplexNumber(4, 5);
		
		array[2] = new ComplexNumber(5, 6);
		
		array[3] = new ComplexNumber(3, 6);
	
		
		ComplexNumber obj1 = new ComplexNumber();
		ComplexNumbersOperatipons operations = new ComplexNumbersOperatipons();
		
		obj1.setReal(1);
		obj1.setImg(5);
		operations.displayComplexNumber(obj1);
		ComplexNumber obj2 = new ComplexNumber(4, 7);
		operations.displayComplexNumber(obj2);
		ComplexNumber sum = operations.addComplexNumbers(obj1, obj2);
		operations.displayComplexNumber(sum);
		ComplexNumber sub = operations.subComplexNumbers(obj1, obj2);
		operations.displayComplexNumber(sub);
		ComplexNumber multiply = operations.multiplyComplexNumbers(obj1, obj2);
		operations.displayComplexNumber(multiply);
		
		ComplexNumber[] result = operations.addComplexNumbers(array);
		
		for(int i = 0; i < result.length; i++) {
			System.out.println("Sum of Complex number is : "+result[i].getReal()+" + "+result[i].getImg()+"i");
		}
		
	}

}
