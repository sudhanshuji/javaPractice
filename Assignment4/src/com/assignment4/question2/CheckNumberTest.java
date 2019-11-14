package com.assignment4.question2;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class CheckNumberTest  {

	
	@Test
	public void UTC2_01() {
		String[] input = { "10.29", "12345","12.0.0" };
		List<String> expected = new ArrayList<String>();
		expected.add("Decimal");
		expected.add("Integer");
		expected.add("Invalid");
		CheckNumber object = new CheckNumber();
		List<String> actual = object.isNumberValid(input);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC2_02() {
		String[] input = { "Number", "12" };
		List<String> expected = new ArrayList<String>();
		expected.add("Invalid");
		expected.add("Integer");
		CheckNumber object = new CheckNumber();
		List<String> actual = object.isNumberValid(input);
		assertEquals(expected, actual);
	}


	@Test
	public void UTC2_03() {
		String[] input =  { "Number.0", "12a" };
		List<String> expected = new ArrayList<String>();
		expected.add("Invalid");
		expected.add("Invalid");
		CheckNumber object = new CheckNumber();
		List<String> actual = object.isNumberValid(input);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC2_04() {
		String[] input = { "2.0a", "10", "0.5" };
		List<String> expected = new ArrayList<String>();
		expected.add("Invalid");
		expected.add("Integer");
		expected.add("Decimal");
		CheckNumber object = new CheckNumber();
		List<String> actual = object.isNumberValid(input);
		assertEquals(expected, actual);
	}
	@Test
	public void UTC2_05() {
		String[] input = null;
		List<String> expected = new ArrayList<String>();
		expected.add("Invalid");
		
		CheckNumber object = new CheckNumber();
		List<String> actual = object.isNumberValid(input);
		assertEquals(expected, actual);
	}
}
