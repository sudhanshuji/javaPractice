package day.fourth;

public class Solution {

	    public static void main(String[] args) {
	        int N = 3;
	        if (N%2!=0)
	        System.out.print("Weird");
	        else{
	            if(N>=2 & N<=5)
	            System.out.print("Not Weird");
	            if(N>=6 && N<=20)
	            System.out.print("Weird");
	            else
	            System.out.print("Not Weird");
	        }
	    }
	}
