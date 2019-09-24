package practcie.service;

import practcie.entity.ComplexNumber;

public class ComplexNumbersOperatipons {

	public ComplexNumber addComplexNumbers(ComplexNumber num1, ComplexNumber num2) {
		ComplexNumber sum = new ComplexNumber();
		int newReal = num1.getReal() + num2.getReal();
		int newImg = num1.getImg() + num2.getImg();
		sum.setReal(newReal);
		sum.setImg(newImg);
		// sum.setReal(num1.getReal() + num2.getReal());
		// sum.setImg(num1.getImg() + num2.getImg());
		return sum;
	}

	public ComplexNumber subComplexNumbers(ComplexNumber num1, ComplexNumber num2) {
		int newReal = num1.getReal() - num2.getReal();
		int newImg = num1.getImg() - (num2.getImg());
		ComplexNumber sub = new ComplexNumber();
		sub.setReal(newReal);
		sub.setImg(newImg);

		return sub;
	}

	public ComplexNumber multiplyComplexNumbers(ComplexNumber num1, ComplexNumber num2) {
		ComplexNumber multiply = new ComplexNumber();
		int a = num1.getReal() * num2.getReal();
		int b = num1.getReal() * num2.getImg();
		int c = num1.getImg() * num2.getReal();
		int d = num1.getImg() * num2.getImg();
		int newReal = a + d;
		int newImg = b + c;
		multiply.setReal(newReal);
		multiply.setImg(newImg);
		return multiply;
	}
	
	public ComplexNumber[] addComplexNumbers(ComplexNumber[] complexNumber) {
		ComplexNumber[] sum = new ComplexNumber[complexNumber.length/2]; //add +1 if odd length
		for(int i=0, j = 0; i<complexNumber.length; i+=2, j++) {
			
			int newReal = complexNumber[i].getReal()+ complexNumber[i+1].getReal();
			int newImg = complexNumber[i].getImg() + complexNumber[i+1].getImg();
			sum[j] = new ComplexNumber(newReal, newImg);
		}
		return sum;
	}

	public void displayComplexNumber(ComplexNumber number) {
		if(number.getImg()>=0)
			System.out.println("Complex number is " + number.getReal() + " +" + number.getImg() + "i");
		else
			System.out.println("Complex number is " + number.getReal() + " " + number.getImg() + "i");
	}
}