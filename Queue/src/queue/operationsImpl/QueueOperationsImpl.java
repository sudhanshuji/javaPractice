package queue.operationsImpl;

import queue.entity.Queue;
import queue.operations.QueueOperations;

public class QueueOperationsImpl implements QueueOperations {
	private Queue queue;

	public QueueOperationsImpl(Queue queue) {
		super();
		this.queue = queue;
	}

	public String enqueue(String arg) {
		int currIndex = queue.getCurrIndex();
		if (currIndex == queue.getQueue().length - 2) {
			System.out.println("Queue is already full");
			return null;
		} else {
			String arr[] = queue.getQueue();
			currIndex = currIndex + 1;
			arr[currIndex] = arg;
			queue.setCurrIndex(currIndex);
			queue.setQueue(arr);
			return arg;
		}
	}

	
	public String dequeue() {
		int currIndex=queue.getCurrIndex();
		if(currIndex==-1) {
			System.out.println("Queue is empty");
			return null;
		}
		else {
			String arr[]=queue.getQueue();
			String element=arr[0];
			for( int i=0;i<=queue.getQueue().length-2;i++)
				arr[i]=arr[i+1];
			return element;
		}
	}

	public Boolean isEmpty() {
		if(queue.getCurrIndex()==-1)
		return true;
		else
			return false;
	}

	public int length() {
		
		return queue.getQueue().length;
	}

	public void listAllElements() {
		String arr[]=queue.getQueue();
		for(int i=0;i<=length()-1;i++)
			System.out.println(arr[i]);

	}

}