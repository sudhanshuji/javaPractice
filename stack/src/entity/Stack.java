package entity;

public class Stack {
	private String arr[];
	private Integer currIndex;

	public Stack() {
		arr = new String[10];
		currIndex = -1;

	}
	
	

	public Stack(int size) {
		arr = new String[size];
		currIndex = -1;
	}

	public String[] getArr() {
		return arr;
	}

	public void setArr(String[] arr) {
		this.arr = arr;
	}

	public Integer getCurrIndex() {
		return currIndex;
	}

	public void setCurrIndex(Integer currIndex) {
		this.currIndex = currIndex;
	}

}