package operationsImpl;


import entity.Stack;
import operations.StackOperations;

public class StackOperationsImpl implements StackOperations {
	private Stack stack;
	
	public StackOperationsImpl(Stack stack) {
		this.stack = stack;
	}

	public String push(String arg) {
		/*
		 * 1. arg contains the data to insert 
		 * 2. Check the size of stack 
		 * 3. If stack is
		 * full, print "Stack overflow" 
		 * 4. Else if stack is not full, insert the arg to
		 * the array inside stack 
		 * 5. Increase the current index of stack by 1
		 */
		int currIndex = stack.getCurrIndex();
		System.out.println("Current Index "+currIndex);
		System.out.println("Array length "+length());
		if (stack.getArr().length - 1 == currIndex)
			System.out.println("stack overflow");
		else {
			String[] arr = stack.getArr();
			currIndex = currIndex + 1;
			arr[currIndex] = arg;
			stack.setCurrIndex(currIndex);
			stack.setArr(arr);
		}
		return arg;

	}

	public String pop() {
		
		/*
		 * 1.check the size of the stack
		 * 2.if size is empty print stack empty
		 * 3.else remove first element present in the stack  
		 * 4.set currindex to currindex-1
		 * 5.return the removed element
		 */
		int currindex=stack.getCurrIndex();
		if(currindex==-1)
			System.out.println("stack is empty");
		else
		{
			String arr[]= stack.getArr();
			String element=arr[currindex];
			arr[currindex]=null;
			currindex--;
			stack.setArr(arr);
			stack.setCurrIndex(currindex);
			return element;
		}
		return null;
		
	}

	public Boolean isEmpty() {
		return (stack.getCurrIndex()==-1);
	}

	public int length() {
//		int i=stack.getCurrIndex();
//		i=i+1;

		return stack.getArr().length+1;
	}

	public void listAllElements() {
		String arr[]=stack.getArr();
		for(int i=0; i<this.length(); i++)
		{
			System.out.println(arr[i]);
		}
	}

}
