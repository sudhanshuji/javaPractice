package programmingExcercises;

import exceptions.CheckArgumentException;
import exceptions.RangeException;

public class ExceptionsClient {

	public static void main(String[] args) {
		// question1(args);
		try {
			question2(args);
		} catch (CheckArgumentException | RangeException e) {
			System.out.println(e.getMessage());
		}

	}

	private static void question1(String... args) {
		CheckingArgument boj = new CheckingArgument();
		try {
			boj.validateNumbers(args);
		} catch (CheckArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

	private static void question2(String... args) throws CheckArgumentException, RangeException {
		if (args.length < 7) {
			throw new CheckArgumentException("Number of arguments can't be less than seven");
		} else {
			String name = args[0];
			int[] marks = new int[args.length - 1];
			for (int i = 1; i <= args.length - 1; i++) {
				String arg = args[i];
				marks[i - 1] = Integer.parseInt(args[i]);
			}
			Marksheets obj = new Marksheets();
			obj.validateMarks(marks, name);
		}

	}
}
