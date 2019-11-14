package strings.loopreview;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner scan = new Scanner(System.in);
		int numberOfLines = scan.nextInt();
		String[] inputString = new String[numberOfLines];

		for (int i = 0; i < inputString.length; i++) {
			inputString[i] = scan.next();
		}

		for (String k : inputString) {
			char[] stringToChar = new char[k.length()];
			stringToChar = k.toCharArray();
			if (stringToChar.length % 2 == 0) {
				char[] evenchar = new char[stringToChar.length / 2];
				char[] oddchar = new char[stringToChar.length / 2];
				for (int l = 0, i = 0, j = 1; i < stringToChar.length && j <= i + 1
						&& l < stringToChar.length / 2; i = i + 2, j = j + 2, l++) {
					oddchar[l] = stringToChar[i];
					evenchar[l] = stringToChar[j];
				}
				for (char c : oddchar)
					System.out.print(c);
				System.out.print(" ");
				for (char c : evenchar)
					System.out.print(c);
				System.out.println();
			} else {
				char[] evenchar = new char[stringToChar.length / 2];
				char[] oddchar = new char[stringToChar.length / 2 + 1];
				for (int l = 0,m=0, i = 0, j = 1; i <=stringToChar.length && j>=i
						&& l <oddchar.length && m<=evenchar.length; i = i + 2, j = j + 2, l++,m++) {
					oddchar[l] = stringToChar[i];
					if(m<evenchar.length)
					evenchar[m] = stringToChar[j];
				}
				for (char c : oddchar)
					System.out.print(c);
				System.out.print(" ");
				for (char c : evenchar)
					System.out.print(c);
				System.out.println();
			}
		}
scan.close();
			}
}
