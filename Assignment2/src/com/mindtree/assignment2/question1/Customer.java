
package com.mindtree.assignment2.question1;

public class Customer {
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getFeedbackRating() {
		return feedbackRating;
	}

	public void setFeedbackRating(double feedbackRating) {
		this.feedbackRating = feedbackRating;
	}

	String name;
	double feedbackRating;
	

	public Customer()
	{
		
	}
	
	public Customer(String name, double feedbackRating){
		
		this.name = name;
		this.feedbackRating = feedbackRating;
	}
	
	
}
