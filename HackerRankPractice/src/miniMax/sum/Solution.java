package miniMax.sum;

import java.util.Arrays;

public class Solution {

		// Complete the miniMaxSum function below.
	    static void miniMaxSum(int[] arr) {
	    	Arrays.sort(arr);
	    	long maxSum=0,minSum=0;
	    	//for minimum sum
	    	for(int j=arr.length-1,i=0;i<arr.length-1 && j>=1;i++,j--) {
	    		minSum+=arr[i];
	    		maxSum+=arr[j];
	    	}
	    	System.out.println(minSum+" "+maxSum);
	    }


	    public static void main(String[] args) {
	        int[] arr ={1, 2, 3, 4, 5};
	        miniMaxSum(arr);

	    }
	}

