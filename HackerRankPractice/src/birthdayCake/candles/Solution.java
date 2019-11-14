package birthdayCake.candles;

import java.util.Arrays;

public class Solution {

	// Complete the birthdayCakeCandles function below.
	static int birthdayCakeCandles(int[] ar) {
		Arrays.sort(ar);
		int i = ar.length - 1;
		int count = 0;

		while (i > 0 && ar[i] == ar[i - 1]) {
			i--;
			count++;
		}
		return count+1;

	}

	public static void main(String[] args) {
		int[] arr = new int[100];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 1000;
		}
		int result = birthdayCakeCandles(arr);
		System.out.println(result);

	}

}
