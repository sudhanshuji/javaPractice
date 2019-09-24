package queue.client;

import java.util.Scanner;

import queue.entity.Queue;
import queue.operationsImpl.QueueOperationsImpl;

public class QueueClient {

	public static void main(String[] args) {
		
		Queue queue=new Queue(6);
		Scanner sc = new Scanner(System.in);
	

		String ch;
		do {
			
			System.out.println("case 1 : Enque");
			System.out.println("case 2 : Deque");

			System.out.println("case 3 : display");
			System.out.println("case 4 : length");
			System.out.println("case 5 : to check empty");
			System.out.println("enter your choice");
			int b = sc.nextInt();

			QueueOperationsImpl obj=new QueueOperationsImpl(queue);
			switch (b) {

			case 1:
				System.out.println("Enter a string:");
				String item = obj.enqueue(sc.next());
				System.out.println("Entered item "+item);
				break;
			case 3:
				obj.listAllElements();
				break;
			case 2:
				System.out.println("dequed element is " + obj.dequeue());
				break;
			case 4:
				System.out.println("Length of queue is " + obj.length());
				break;
			case 5:
				if(obj.isEmpty()==false)
				System.out.println("queue is not empty");
				else
					System.out.println("queue is empty");
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

