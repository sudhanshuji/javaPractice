package pattern.designing;

import java.util.Scanner;

public class Pattern {
	static void stairdesignExecution(int num) {
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
			System.out.print("#");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int numberOfRows=10;
		stairdesignExecution(numberOfRows);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter input");
		String s=sc.nextLine();
		System.out.println(s);
		
	}

}
