package com.mindtree.assignment2.question1;


import static org.junit.Assert.*;

import org.junit.Test;

public class CustomerFeedbackTest {
	
	@Test
	public void UTC01_01() {
		
		Customer customers[] = new Customer[3];
		customers[0] = new Customer("Vijay", 3.0);
		customers[1] = new Customer("Kumar", 4.0);
		customers[2] = new Customer("Vishnu", 5.0);
		double expected = 4.0;
		double actual = CustomerFeedback.calculateFeedback(customers);
		assertEquals(expected, actual,0);
		
		
	}
	@Test
	public void UTC01_02() {
		
		Customer customers[] = new Customer[5];
		customers[0] = new Customer("Arun", 4.5);
		customers[1] = new Customer("Babu", 4.5);
		customers[2] = new Customer("Manasa", 3.5);
		customers[3] = new Customer("Sara", 2.0);
		customers[4] = new Customer("Kumar", 4.0);
		double expected = 3.7;
		double actual = CustomerFeedback.calculateFeedback(customers);
		assertEquals(expected, actual,0);
	}
	
		
	@Test
	public void UTC01_03() {
		
		Customer customers[] = new Customer[2];
		customers[0] = new Customer("Santhosh", 5.0);
		customers[1] = new Customer("Savitha", 0.0);
		double expected = 2.5;
		double actual = CustomerFeedback.calculateFeedback(customers);
		assertEquals(expected, actual,0);
		
		
	}



}
