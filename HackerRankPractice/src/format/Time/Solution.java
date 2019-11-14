package format.Time;

public class Solution {

	/*
	 * Complete the timeConversion function below.
	 */
	static String timeConversion(String s) {
		String finl = "";
		char[] arr = s.toCharArray();
		if (s.contains("PM")) {
			char[] arrNew = new char[2];
			for (int i = 0; i < 2; i++) {
				arrNew[i] = arr[i];
			}
			String string = new String(arrNew);
			int l = Integer.parseInt(string);
			if (l < 12) {
				finl = Integer.toString(l + 12);
			} else if (l == 12) {
				finl = "12";
			} else {
				finl = "00";
			}
		} else {
			int k = Integer.parseInt(s.substring(0, 2));
			if (k != 12)
				finl = s.substring(0, 2);
			else
				finl = "00";
		}
		return finl;
	}

	public static void main(String args[]) {

		String s = "12:00:00AM";
		char[] arr = s.toCharArray();
		String result = timeConversion(s);
		System.out.println();
		System.out.println(result + ":" + arr[3] + arr[4] + ":" + arr[6] + arr[7]);

	}
}
