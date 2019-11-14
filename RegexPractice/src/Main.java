
public class Main {

	public static void main(String[] args) {

		String roll = "2105EX151908";
		String mid = "T1030608";
		String mid1 = "m1030608";
		String midRegex = "[Mm]\\d{7}";
		String rollRegex = "2\\d{3}[A-Z]{2}\\d{6}";
		boolean b = mid1.matches(midRegex);
		System.out.println(roll.matches(rollRegex));
		System.out.println(b);
	}

}
