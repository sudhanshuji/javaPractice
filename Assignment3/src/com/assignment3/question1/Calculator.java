package com.assignment3.question1;

import javax.naming.spi.DirStateFactory.Result;

public class Calculator {

	public static int add(int number1, int number2) {

		return (number1 + number2);
	}

	public static int subtract(int number1, int number2) {

		return (number1 - number2);
	}

	public static int multiply(int number1, int number2) {

		return (number1 * number2);
	}

	public static double divide(int number1, int number2) throws ArithmeticException{


		return (number1 / number2);
	}

}
