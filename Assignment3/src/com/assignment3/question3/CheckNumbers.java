/**
 * 
 */
package com.assignment3.question3;

/**
 * @author Sudhanshu Kumar
 *
 */
public class CheckNumbers extends Exception {

	public String[] validateNumbers(String... numbers) throws CheckNumbers {
		String[] b = new String[numbers.length];
		int count = 0;
		for (String s : numbers) {
			if (s.matches("\\d+")) {
				b[count] = (s + "-" + "valid-integer");

			} else if (s.matches("\\d+\\.\\d+")) {
				b[count] = (s + "-" + "valid-decimal");
			} else if (!s.contains(".")) {
				b[count] = (s + "-" + "invalid-integer");
			} else if (s.contains(".")) {
				b[count] = (s + "-" + "invalid-decimal");
			}
			count++;
		}

		return b;
	}

}
