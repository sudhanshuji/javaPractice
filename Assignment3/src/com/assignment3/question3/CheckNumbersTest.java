package com.assignment3.question3;

import org.junit.*;

import org.junit.Test;

public class CheckNumbersTest {

	@Test
	public void UTC3_01() {
		String input[] = { "10.29", "12345", "12.0.0" };
		String expecteds[] = { "10.29-valid-decimal", "12345-valid-integer", "12.0.0-invalid-decimal" };
		CheckNumbers checkNumbers = new CheckNumbers();
		String[] actuals;
		try {
			actuals = checkNumbers.validateNumbers(input);
			Assert.assertArrayEquals(expecteds, actuals);
		} catch (CheckNumbers e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test
	public void UTC3_02() {
		String input[] = { "Number", "12" };
		String expecteds[] = { "Number-invalid-integer", "12-valid-integer" };
		CheckNumbers checkNumbers = new CheckNumbers();
		String[] actuals;
		try {
			actuals = checkNumbers.validateNumbers(input);
			for (String s : actuals) {
				System.out.println(s);
			}
			Assert.assertArrayEquals(expecteds, actuals);
		} catch (CheckNumbers e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test
	public void UTC3_03() {
		String input[] = { "Number.0", "12a" };
		String expecteds[] = { "Number.0-invalid-decimal", "12a-invalid-integer" };
		CheckNumbers checkNumbers = new CheckNumbers();
		String[] actuals;
		try {
			actuals = checkNumbers.validateNumbers(input);
			Assert.assertArrayEquals(expecteds, actuals);
		} catch (CheckNumbers e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test
	public void UTC3_04() {
		String input[] = { "2.0a", "10", "0.5" };
		String expecteds[] = { "2.0a-invalid-decimal", "10-valid-integer", "0.5-valid-decimal" };
		CheckNumbers checkNumbers = new CheckNumbers();
		String[] actuals;
		try {
			actuals = checkNumbers.validateNumbers(input);
			Assert.assertArrayEquals(expecteds, actuals);
		} catch (CheckNumbers e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
