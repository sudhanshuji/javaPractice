package mapp;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Dictionary {

	private LinkedHashMap<String, String> dictionary;

	public Dictionary(LinkedHashMap<String, String> dictionary) {
		super();
		this.dictionary = dictionary;
	}

	public Dictionary() {
		dictionary = new LinkedHashMap<>();
	}

	public void insertData() {
		dictionary.put("import", "to bring inside");
		dictionary.put("export", "to send outside");
		dictionary.put("inheritance", "Genetics");
		dictionary.put("interface", "to declare only");
		dictionary.put("right", "opposite of left");
		// return dictionary;
	}

	public String search(String word) {

		String message;
		if (dictionary.containsKey(word)) {
			String meaning = dictionary.get(word);
			return meaning;
		} else {
			message = "word doesn't exist in the dictionary";
			System.out.println("these words exists in the dictionary");
			for (String s : dictionary.keySet())
				System.out.println(s);
			return message;
		}
	}

	public void sortDictionary() {
		TreeMap<String, String> temp = new TreeMap<>();
		temp.putAll(dictionary);
		dictionary.clear();
		dictionary.putAll(temp);
	}
	
	public void iterateDictionary() {
		//HashMap<String,String> list;
		for (String s:dictionary.keySet()) {
			System.out.print(s+":");
			System.out.println(dictionary.get(s));
		}
	}

}
