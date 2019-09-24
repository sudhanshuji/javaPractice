package practice;

import java.util.Scanner;

public class Conversion {

	
	public static void main(String[] args) {
		   Scanner num=new Scanner(System.in);
		   System.out.println("enter a decimal number");
		   int number=num.nextInt();
		   System.out.println("you entered = "+number);
		   while(number>=1)
		   {
			   int m=number%2;
			   number=number/2;
			   System.out.print(m);
		   }
		   
		   

	}

}
