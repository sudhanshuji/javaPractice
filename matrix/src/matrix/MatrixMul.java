package matrix;

public class MatrixMul {

	public static void main(String[] args) {
		   int array[][]  = {{3,7},{6,9}};
		   int array1[][] = {{5,4},{3,6}};
		   int array2[][] = new int [2][2];
		   int x =array.length;
		   System.out.println("Matrix 1:");
		
		   for(int i=0;i<x;i++)
		   {
			   for(int j=0;j<x;j++) {
				   System.out.println(" "+array[i][j]);
				 }
			   System.out.println();   
		   }
		   int y=array1.length;
		   System.out.println("Matrix 2: ");
		   for(int i=0;i<y;i++) {
			   for(int j=0;j<y;j++) {
				   System.out.println(" "+array1[i][j]);
				   }
		   System.out.println();
		   }
		   for(int i=0;i<x;i++) {
			   for(int j=0;j<=y-1;j++) {
				   for(int k=0;k<y;k++) {
					   array[i][j]+=array[i][k]*array[k][j];
				   }
			   }
		   }
		   System.out.println("Multiplication of both Matrices: ");
		   for(int i=0;i<x;i++) {
			   for(int j=0;j<=y-1;j++) {
				   System.out.println(" " +array2[i][j]);
			   }
				   System.out.println();
			   
		   }
		  
		   
	}

}
