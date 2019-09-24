package practice;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		   System.out.println("enter a number");
		   Scanner num=new Scanner(System.in);
		   int number=num.nextInt();
		   int i,fact=1;
		   for(i=1;i<=number;i++)
		   {
			   fact=fact*i;
		   }
		   System.out.println("factorial of the given number is :  "+ fact);
		   

	}

}
