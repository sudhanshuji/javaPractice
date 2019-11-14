package grading.system;

import java.util.ArrayList;
import java.util.List;

class Result {

	/*
	 * Complete the 'gradingStudents' function below.
	 *
	 * The function is expected to return an INTEGER_ARRAY. The function accepts
	 * INTEGER_ARRAY grades as parameter.
	 */

	public List<Integer> gradingStudents(List<Integer> grades) {
		List<Integer> result = new ArrayList<Integer>();
		int limit = grades.get(0);
		for (int i = 1; i <= limit; i++) {
			int k = grades.get(i);
			if (k >= 38)
				result.add(round(k));
			else
				result.add(k);
		}
		return result;
	}

	public int round(int k) {
		int n = 5;
		while (n < k)
			n = n + 5;
		if (n > k) {
			int diff = n - k;
			if (diff < 3) {
				k = n;
				return k;
			} else
				return k;
		} else
			return k;
	}

}

public class Solution {

	public static void main(String[] args) {
	    	int gradesCount=25;
	    	List<Integer> grades= new ArrayList<Integer>();
	    	grades.add(gradesCount);
	    	grades.add(36);
			grades.add(6);
			grades.add(98);
			grades.add(25);
			grades.add(97);
			grades.add(	24);
			grades.add(25);
			grades.add(70);
			grades.add(50);
			grades.add(71);
			grades.add(30);
			grades.add(14);
			grades.add(28);
			grades.add(100);
			grades.add(3);
			grades.add(26);
			grades.add(61);
			grades.add(98);
			grades.add(50);
			grades.add(41);
			grades.add(5);
			grades.add(3);
			grades.add(28);
			grades.add(34);
			grades.add(0);
	    		    	
	    	Result res=new Result();
	    	List<Integer> result = res.gradingStudents(grades);
	    	for(int k:result)
	    	System.out.println(k);
	    }
}
