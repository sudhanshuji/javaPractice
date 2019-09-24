package queue.operations;

public interface QueueOperations {

	String enqueue(String arg);
	String dequeue();
	Boolean isEmpty();
	int length();
	void listAllElements();
}
