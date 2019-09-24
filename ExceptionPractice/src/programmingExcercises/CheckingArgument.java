package programmingExcercises;

import exceptions.CheckArgumentException;

public class CheckingArgument {

	public boolean validateNumbers(String[] args) throws CheckArgumentException {
		if (args.length < 5) {
			throw new CheckArgumentException("Number of arguments can't be less than five");
		} else {
			int sum = 0;
			try {
				for (int l = 0; l < args.length; l++) {
					int var = Integer.parseInt(args[l]);
					sum += var;
				}
			} catch (NumberFormatException e) {
				System.out.println("please enter proper integer value");

			}
			System.out.println(sum);
		}

		return false;
	}
	
	public boolean validateNumbersVararg(String...args) throws CheckArgumentException {
		if (args.length < 5) {
			throw new CheckArgumentException("Number of arguments can't be less than five");
		} else {
			int sum = 0;
			try {
				for (int l = 0; l < args.length; l++) {
					int var = Integer.parseInt(args[l]);
					sum += var;
				}
			} catch (NumberFormatException e) {
				System.out.println("please enter proper integer value");

			}
			System.out.println(sum);
		}

		return false;
	}

}
