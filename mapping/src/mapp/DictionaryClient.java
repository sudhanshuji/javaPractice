package mapp;

import java.util.Scanner;

public class DictionaryClient {

	public static void main(String[] args) {
		Dictionary word=new Dictionary();
		word.insertData();
		System.out.println("enter any word");
		Scanner input = new Scanner(System.in);
		String b=input.next();
		System.out.println(word.search(b));
		word.iterateDictionary();
		word.sortDictionary();
		word.iterateDictionary();
	}

}
