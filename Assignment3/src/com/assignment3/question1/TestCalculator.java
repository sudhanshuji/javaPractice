package com.assignment3.question1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalculator {
	
	@Test
	public void UTC01_01() {
		int expected = 15;
		int actual = Calculator.add(10, 5);
		assertEquals(expected,actual,0);
			
	}
	
	@Test
	public void UTC01_02() {
		
		int expected = 25;
		int actual = Calculator.subtract(50, 25);
		assertEquals(expected,actual,0);
			
			
	}
	
	@Test 
	public void UTC01_03() {
		
		int expected = 196;
		int actual = Calculator.multiply(28, 7);
		assertEquals(expected,actual,0);
		
	}
	
	@Test 
	public void UTC01_04() {
		
		int expected = 9;
		double actual = Calculator.divide(45, 5);
		assertEquals(expected,actual,0);
		
		
	}
	
	@Test(expected = ArithmeticException.class) 
	public void UTC01_05() {
		

		Calculator.divide(45, 0);
	
		
		
	}
	
	

}
