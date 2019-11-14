package com.assignment4.question3;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;


import org.junit.Test;

public class WordCountTest {

	@Test
	public void UTC3_01() {
		ArrayList<Integer> expected= new ArrayList<Integer>();
		expected.add(99);
		expected.add(19);
		expected.add(2);
		WordCount object = new WordCount();
		ArrayList<Integer> actual = object.countWord(1);
		assertEquals(expected, actual);
	}


	@Test
	public void UTC3_02() {
		ArrayList<Integer> expected= new ArrayList<Integer>();
		expected.add(64);
		expected.add(10);
		expected.add(1);
		WordCount object = new WordCount();
		ArrayList<Integer> actual = object.countWord(2);
		assertEquals(expected, actual);
	}


	@Test
	public void UTC3_03() {
		ArrayList<Integer> expected= new ArrayList<Integer>();
		expected.add(0);
		expected.add(0);
		expected.add(0);
		WordCount object = new WordCount();
		ArrayList<Integer> actual = object.countWord(3);
		assertEquals(expected, actual);
	}
	
}

