package practice;

import java.util.Scanner;

public class SalesTax {

	public static void main(String[] args) {
		   Scanner input=new Scanner(System.in);
		   System.out.println("enter the price");
		   int price=input.nextInt();
		   System.out.println("you entered the price "+price);
		   float tax=10*price/100;
		   float newprice=price+tax;
		   System.out.println("appropriate tax = "+tax);		   
		   System.out.println("total purchase price = "+newprice);
	}

}