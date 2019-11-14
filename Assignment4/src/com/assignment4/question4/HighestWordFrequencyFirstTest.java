package com.assignment4.question4;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;

/**
 * 
 * @author Sudhanshu
 * 
 *         Write a program that counts the word frequency and returns the words
 *         and their corresponding frequency in a certain order. The word with
 *         highest frequency should be ordered first followed up by other words
 *         with lower frequency. If there is a tie between two or more words
 *         because their frequencies are equal, the words are ordered as per
 *         their alphabetical order. Only words with frequency greater than one
 *         should be considered for output. Input Input is a String which
 *         contains words and punctuation symbol like period (.) and comma (,).
 *         Output Output contains the ordered list of word-frequency followed up
 *         by corresponding words where the frequency is greater than one. Word
 *         frequency count is case – insensitive. E.g. ‘Hello’ and ‘hello’
 *         should be considered as one word for counting. The words in the
 *         output appear in all the upper case.
 *
 */
public class HighestWordFrequencyFirstTest {

	@Test
	public void UTC1_01() {
		String input = "Hello this is test. The test is successful. But, this is not the end.";
		HighestWordFrequencyFirst obj = new HighestWordFrequencyFirst();
		List<String> actuals = obj.getWordFrequency(input);
		List<String> expecteds = new ArrayList<String>();
		String[] arr = { "3", "IS", "2", "TEST", "THE", "THIS" };
		expecteds = Arrays.asList(arr);
		assertTrue(actuals.equals(expecteds));
	}

	@Test
	public void UTC1_02() {
		String input = "Every rose has its thorn  Just like every night has its dawn  Just like every cowboy sings his sad, sad song  Every rose has its thorn  Yeah, it does";
		HighestWordFrequencyFirst obj = new HighestWordFrequencyFirst();
		List<String> actuals = obj.getWordFrequency(input);
		List<String> expecteds = new ArrayList<String>();
		String[] arr = { "4", "EVERY", "3", "HAS", "ITS", "2", "JUST","LIKE","ROSE","SAD","THORN" };
		expecteds = Arrays.asList(arr);
		assertTrue(actuals.equals(expecteds));
	}

}
