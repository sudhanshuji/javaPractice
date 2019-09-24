package programmingExcercises;

import exceptions.RangeException;

public class Marksheets {

	public void validateMarks(int[] marks,String...names) throws RangeException{
		int sum=0;
		int percent;
		System.out.println(names[0]);
		for(int i=0;i<marks.length;i++) {
			int bi=marks[i];
			if (bi<0 || bi>50) {
				throw new RangeException("marks are not in range");
				}
			else {
				sum+=bi;
				System.out.print(" "+bi);
			}
		}
		System.out.println();
		System.out.println(sum);
		percent=sum*100/250;
		System.out.println(percent);
		
	}
	
}
