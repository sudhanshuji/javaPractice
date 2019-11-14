package com.mindtree.assignment2.question1;

public class CustomerFeedback {
	
	
	public static double calculateFeedback(Customer customers[]){
		double sum=0,avg;
		for(int i=0;i<customers.length;i++) {
			double rating=customers[i].getFeedbackRating();
			sum+=rating;
		}
		avg=(sum/customers.length);
		
		
		System.out.println(avg);
		return avg;
	}

}
