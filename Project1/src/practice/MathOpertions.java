package practice;

public class MathOpertions {

	private int num;

	public MathOpertions() {

	}

	public MathOpertions(int num) {
		this.num = num;
	}

	public int square() {
		return num * num;
	}

	public static int cube(int num) {
		return (int) Math.pow(num, 3);
	}

}
