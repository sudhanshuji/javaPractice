package queue.operations;

import java.util.LinkedList;

import queue.entity.Queue;

public class QueueOperations {

	private Queue queue;

	public QueueOperations() {
		super();
		queue = new Queue();
	}

	public QueueOperations(Queue queue) {
		super();
		this.queue = queue;
	}

	public String enque(String arg) {
		int currIndex = queue.getCurrentIndex();
		if (currIndex == queue.getList().size() - 2) {
			System.out.println("queue is already full");
			return null;
		} else {
			LinkedList<String> list = queue.getList();
			currIndex = currIndex + 1;
			list.push(arg);
			queue.setCurrentIndex(currIndex);
			return arg;
		}
	}

	public String deque() {
		int currIndex = queue.getCurrentIndex();
		String str;
		if (currIndex == -1) {
			System.out.println("queue is empty");
			return null;
		} else {
			str = queue.getList().poll();
		}
		return str;
	}
	
	public Queue getQueue() {
		return this.queue;
	}

	public void listAllElements(Queue queue) {
		LinkedList<String> list=queue.getList();
		System.out.println(list);
				
	}
}