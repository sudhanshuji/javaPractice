package com.mindtree.assignment2.question3;

import static org.junit.Assert.*;

import org.junit.Test;



public class TestSearch {
	
	
	@Test
	public void UTC03_01() {
		
		int arrayElements [] = {10,15,5,20};
		Search search = new LinearSearch();
		search.addElements(arrayElements);
		boolean result = SearchElements.searchGivenElements(search, 15);
			
		assertEquals(true, result);
	}
	
	@Test
	public void UTC03_02() {
		
		int arrayElements [] = {100,150,500,720,800,900};
		Search search = new BinarySearch();
		search.addElements(arrayElements);
		boolean result = SearchElements.searchGivenElements(search, 1300);
			
		assertEquals(false, result);
	}
	
	@Test
	public void UTC03_03() {
		
		int arrayElements [] = {45,67,89,90,110,123,456};
		Search search = new BinarySearch();
		search.addElements(arrayElements);
		boolean result = SearchElements.searchGivenElements(search, 456);
			
		assertEquals(true, result);
	}

}
