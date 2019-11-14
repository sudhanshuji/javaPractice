package queue.service;

import java.util.*;

import queue.entity.Queue;
import queue.operations.QueueOperations;

public class QueueClient {

	public static void main(String[] args) {
		LinkedList<String> linkedList=new LinkedList<String>(); 
		Queue queue=new Queue();
		queue=new Queue(linkedList, -1);
		QueueOperations opr=new QueueOperations();
		opr.enque("golu");
		opr.enque("utkarsh");
		opr.enque("aman");
		opr.enque("abraham");
		opr.enque("lincoln");
		System.out.println(opr.deque());
		System.out.println(opr.deque());
		opr.listAllElements(opr.getQueue());
	}

}
