package com.assignment4.question3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;/**
 * Word Count
 * 
 * 
 * 
 */
public class WordCount {

	/**
	 * @return HashMap a map containing the Character count, Word count and Sentence count
     *
	 */
	 public static void skipLines(Scanner s,int lineNum){
	        for(int i = 0; i < lineNum;i++){
	            if(s.hasNextLine())s.nextLine();
	        }
	    }
	public ArrayList<Integer> countWord(int lineNumber){
		ArrayList<Integer> charlist=new ArrayList<Integer>();
		try {
		File myObj=new File("question3file.txt");
			Scanner myReader = new Scanner(myObj);
			if(lineNumber>1)
			skipLines(myReader, lineNumber-1);
     	//	while(myReader.hasNextLine()) {
			//System.out.println(myReader.nextLine());
		//}
			int ln=0,wrd=0,ch=0;
			if(myReader.hasNextLine()) {
	
			char[] words=myReader.nextLine().toCharArray();
			for(int i=0;i<words.length;i++) {
				if(words[i]==' ') {
					wrd++;
				}
				if(words[i]=='.') {
					ln++;
				}
				}
			ch=words.length;
			}
	
			
			charlist.add(ch);
			if(wrd>0)
			charlist.add(wrd+1);
			else
				charlist.add(wrd);
			charlist.add(ln);
			for(int k:charlist) {
				System.out.println(k);
			
			}

		}catch(

	FileNotFoundException e)
	{
			System.out.println("An error occurred.");
			e.printStackTrace();
			}
		return charlist;
}}
