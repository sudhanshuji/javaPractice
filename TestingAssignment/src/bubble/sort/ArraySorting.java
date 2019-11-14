package bubble.sort;

public class ArraySorting {

	public static int[] sortArray(int iArray[]) {
		int temp;
		for (int k = 0; k < 4; k++) {
			if (iArray[k] > iArray[k + 1]) {
		for (int j = 0; j < 4; j++) {
			for (int i = 0; i < 4; i++) {
				if (iArray[i] > iArray[i + 1]) {
					temp = iArray[i];
					iArray[i] = iArray[i + 1];
					iArray[i + 1] = temp;
				}
				//System.out.println(i);
			}//System.out.println(j);
		}}else
		{
			break;
		}
			}
		int output[] = iArray;

		return output;
	}

	public static void main(String[] args) {
		int input[] = { -1, 0,5,20,110 };
		int[] output = sortArray(input);
		for (int i = 0; i < 5; i++)
			System.out.print(output[i] + " ");
	}
}
