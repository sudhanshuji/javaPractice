package socks.merchant;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
	// Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
    	HashSet<Integer> individualNumbers=new HashSet<>();
    	for(int i=0;i<ar.length;i++) {
    	individualNumbers.add(ar[i]);
    	}
    	List<Integer> allElements=new ArrayList<Integer>();
    	for(int i=0;i<ar.length;i++) {
    		allElements.add(ar[i]);
    	}
    	int count=0,sum=0;
    	for(int k:individualNumbers) {
    		for(int l:allElements) {
    			if(l==k) {
    				count++;
    			}
    		}
			sum+=(count/2);
    		count=0;
    	}
    	
    	return sum;
    	}
    public static void main(String[] args) {
    	int n=9;
    	int[] socksRandom= {10, 20, 20, 10, 10, 30, 50, 10, 20};
    	int result=sockMerchant(n, socksRandom);
    	System.out.println(result);
    }
}
