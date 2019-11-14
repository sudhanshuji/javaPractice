import java.util.Scanner;

public class MainClient {

	public static void main(String[] arg) {
		// System.out.print("Hello world");
		// System.out.println("2.Hello world");
		// System.out.print("3.1.Hello world");
		Scanner scanner = new Scanner(System.in);
		
		int v = 2;
		System.out.println("Enter a Number :");
		v  = scanner.nextInt();
		int sqr = square(v);
		System.out.println(" "+sqr+" "+sqr);
		System.out.println("Square of " + v + " is " + sqr);

	}

	static int square(int num) {
		return num * num;
	}

}
