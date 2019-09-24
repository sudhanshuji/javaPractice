package stack.client;

import java.util.Scanner;

import entity.Stack;
import operations.StackOperations;
import operationsImpl.StackOperationsImpl;

public class StackClient {

	public static void main(String[] args) {
		// int i = 0;
		Stack stack = new Stack(5);
		Scanner sc = new Scanner(System.in);
		
		String ch;
		do {
			
			System.out.println("case 1 : push");
			System.out.println("case 2 : pop");

			System.out.println("case 3 : display");
			System.out.println("case 4 : length");
			System.out.println("case 5 : to check empty");
			System.out.println("enter your choice");
			int b = sc.nextInt();

			StackOperations obj = new StackOperationsImpl(stack);
			switch (b) {

			case 1:
				System.out.println("Enter a string:");
				String item = obj.push(sc.next());
				System.out.println("Entered item "+item);
				break;
			case 3:
				obj.listAllElements();
				break;
			case 2:
				// String st = obj.pop();
				System.out.println("Popped element is " + obj.pop());
				break;
			case 4:
				System.out.println("Length of stack is " + obj.length());
				break;
			case 5:
				System.out.println("Stack is " + obj.isEmpty());
				break;
			default:
				System.out.println("invalid choice");
			}

			System.out.println("Do you want to run again, enter y/n:");
			ch = sc.next();

		} while (ch.toLowerCase().equals("y"));
		sc.close();
		
	}

}
