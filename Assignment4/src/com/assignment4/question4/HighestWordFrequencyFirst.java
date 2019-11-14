/**
 * 
 */
package com.assignment4.question4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

/**
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
public class HighestWordFrequencyFirst {
	/*
	 * public static <K,V extends Comparable<? super V>> List<Entry<K, V>>
	 * entriesSortedByValues(Map<K,V> map) {
	 * 
	 * List<Entry<K,V>> sortedEntries = new ArrayList<Entry<K,V>>(map.entrySet());
	 * 
	 * Collections.sort(sortedEntries, new Comparator<Entry<K,V>>() {
	 * 
	 * @Override public int compare(Entry<K,V> e1, Entry<K,V> e2) { return
	 * e2.getValue().compareTo(e1.getValue()); } } );
	 * 
	 * return sortedEntries; }
	 */

	public List<String> getWordFrequency(String input) {
		// String[] words=new String[input.length()];
		TreeMap<String, Integer> wordListCount = new TreeMap<String, Integer>();
		List<String> finalList = new ArrayList<String>();
		String[] words = (input.trim().toUpperCase()).split("\\s+");
		for (int i = 0; i < words.length; i++) {
			// TODO : add support for numerics
			while (words[i].charAt(words[i].length() - 1) < 65 || words[i].charAt(words[i].length() - 1) > 91) {
				words[i] = words[i].substring(0, words[i].length() - 1);
			}

			if (wordListCount.containsKey(words[i])) {
				int count = wordListCount.get(words[i]);
				wordListCount.put(words[i], ++count);
			} else {
				wordListCount.put(words[i], 1);
			}
		}
		Collection<Integer> count = new ArrayList<Integer>();
		count = wordListCount.values();
		// ArrayList<Integer> count1=new ArrayList<Integer>();
		TreeSet<Integer> count2 = new TreeSet<Integer>();
		count2.addAll(count);
		for (Entry<String, Integer> entryEach : wordListCount.entrySet()) {
			System.out.println("Key = " + entryEach.getKey() + " Value = " + entryEach.getValue());
		}
		// Collections.sort(count1);
		// Collections.reverse(count1);
		for (Integer s : count2.descendingSet()) {
			if (s > 1) {
				finalList.add(s.toString());
				for (Entry<String, Integer> entry : wordListCount.entrySet()) {
					if (entry.getValue() == s) {
						finalList.add(entry.getKey());
					}
				}
			}
		}
	
		
		System.out.println(finalList.toString());

		return finalList;
	}

}
