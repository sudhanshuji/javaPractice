
public class MatixMul {

	public static void main(String[] args) {
		int i, j, k,term=0;
		int[][] arr1 = { { 1, 2, 3 }, { 4, 5, 6 } };
		int[][] arr2 = { { 3, 2 }, { 6, 5 }, { 1, 4 } };
		int[][] res = new int[2][2];
		// arr1 =new int[2][3];
		// arr2 =new int[3][2];

		// arr1= {{1,2,3},{4,5,6}};
		// arr2= {{3,2},{6,5},{1,4}};

		for (i = 0; i <= 1; i++) {
			for (j = 0; j <= 1; j++) {
				for (k = 0; k <= 2; k++) {
				 term =term + arr1[i][k] * arr2[k][j];
					res[i][j] = term;
				}
				term=0;
			}
		}
		for (i = 0; i <= 1; i++) {
			for (j = 0; j <= 1; j++) {
				System.out.print(" "+res[i][j]);
			}
			System.out.println();
		}

	}
}
