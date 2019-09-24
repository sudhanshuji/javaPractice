package practice;

public class ClientMain {

	public static void main(String[] args) {

		int num = 2;

		MathOpertions mathOperations = new MathOpertions(num);

		int square = mathOperations.square();

		System.out.println("square of " + num + " is " + square);

		int cube = MathOpertions.cube(num);
		System.out.println("cube of " + num + " is " + cube);
	}

}
