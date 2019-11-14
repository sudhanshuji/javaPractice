package diagonal.sum;

import java.util.ArrayList;
import java.util.List;

class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
    	int limit=arr.size();
    	int i,j;
    	int sumd1=0;
    	int sumd2=0;
    	for( i=0;i<limit;i++) {
    		for(j=0;j<limit;j++) {
    			if(i==j) {
    				sumd1+=arr.get(i).get(j);
    			}
    		}
    	}
    	for( i=0,j=limit-1;i<=limit-1 && j>=0;i++,j--) {
    		sumd2+=arr.get(i).get(j);
    	}
    	if(sumd1>sumd2) {
    		int finalResult=sumd1-sumd2;
    	System.out.println(finalResult);
    	return finalResult;
    	}
    	else if(sumd1<sumd2) {
    		int finalResult=sumd2-sumd1;
    	System.out.println(finalResult);
    	return finalResult;
    	}
    	else {
    		System.out.println(0);
    		return 0;
    	}
    	
    


    }

}
public class Solution {
    public static void main(String[] args){
    	//int[][] arr= {{11,2,4},{4,5,6},{10,8,-12}};
    	List<Integer> arr0=new ArrayList<>();
    	List<Integer> arr1=new ArrayList<>();

    	List<Integer> arr2=new ArrayList<>();
    	arr0.add(11);
    	arr0.add(2);
    	arr0.add(4);
    	arr1.add(4);
    	arr1.add(5);
    	arr1.add(6);
    	arr2.add(10);
    	arr2.add(8);
    	arr2.add(-12);
    	
    	List<List<Integer>> arr=new ArrayList<>();
    	arr.add(arr0);
    	arr.add(arr1);
    	arr.add(arr2);
        int result = Result.diagonalDifference(arr);
    }
}

