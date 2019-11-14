package day.tenth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution {
	
	public static int countOne(List<Integer> arr) {
		int i=0, count=0,finalCount=0;
		//for(i=0;i<arr.size();i++) {
			while ( i<arr.size()){
				if( arr.get(i) != 0) {
				count++;
				i++;
				}
				if(finalCount<count) {
					finalCount=count;
				}
				if (i<arr.size() && arr.get(i) == 0) {
					i++;
					count=0;
				}
			}
			
		return finalCount;
	}
	

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		if(n==0) {
		    System.out.println(0);
		}
		int r, count = 1;
		List<Integer> array = new ArrayList<Integer>();
		while (n != 0) {
			r = n % 2;
			array.add(r);
			n = n / 2;
		}
		
		Collections.reverse(array);
		int result=countOne(array);
		System.out.println(result);

		scanner.close();
	}
}
