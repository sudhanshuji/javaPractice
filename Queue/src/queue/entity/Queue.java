package queue.entity;

public class Queue {

	private String queue[];
	private int currIndex;
	
	
	
	public Queue() {
		queue=new String[10];
		currIndex=-1;
	}



	public Queue(int size) {
		queue = new String[size];
		currIndex = -1;
	}



	public String[] getQueue() {
		return queue;
	}



	public void setQueue(String[] queue) {
		this.queue = queue;
	}



	public int getCurrIndex() {
		return currIndex;
	}



	public void setCurrIndex(int currIndex) {
		this.currIndex = currIndex;
	}
	
	
	
	
	
}
