package plus.minus;

import java.text.DecimalFormat;

public class Solution {

	    // Complete the plusMinus function below.
	    static void plusMinus(int[] arr) {
	    	float b=arr.length;
	    	int countp=0,countn=0,count0=0;
	    	for(int i=0;i<arr.length;i++) {
	    		if(arr[i]>0)
	    			countp++;
	    		else if(arr[i]<0)
	    			countn++;
	    		else
	    			count0++;
	    	}
	    	float a=countp;
	    	DecimalFormat dec=new DecimalFormat("0.000000");
	    	float d=countn;
	    	float c=count0;
	    	System.out.println(dec.format(a/b));
	    	System.out.println(dec.format(d/b));
	    	System.out.println(dec.format(c/b));
	    	
	    }
	    	


	    public static void main(String[] args) {
	    	int[] arr= {-4,3,-9,0,4,1};
	    	plusMinus(arr);
	      
	    }
	}



