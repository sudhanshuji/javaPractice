package complexNumberArray.client;

import java.util.Scanner;

import complexNumberArrayService.ComplexNumberArrayOperations;
import complexNumberProject.CoplexNumberArray;

public class ComplexNumberArrayclient {

	private static final int ARRAY_SIZE = 5;
	
	public static void main(String[] args) {
		
		int j = 4;
		
		int arrayReal[]= new int[ARRAY_SIZE];
	    int arrayImg[]= new int[ARRAY_SIZE];
	    CoplexNumberArray arrayResult;
		
	    int arrayReal1[] = new int[ARRAY_SIZE];
	    int arrayImg1[] = new int[ARRAY_SIZE];
	    
	    Scanner pipapu = new Scanner(System.in);
	    
	   for(int i = 0; i < ARRAY_SIZE; i++) {
		   arrayReal[i] = pipapu.nextInt();
		   arrayImg[i] = pipapu.nextInt();
		   arrayReal1[i] = pipapu.nextInt();
		   arrayImg1[i] = pipapu.nextInt();

	   }
	   
 	    
		CoplexNumberArray obj1 = new CoplexNumberArray();
		CoplexNumberArray obj2 = new CoplexNumberArray();
		ComplexNumberArrayOperations operations =new ComplexNumberArrayOperations();
		
		obj1.setReal(arrayReal);
		obj1.setImg(arrayImg);
		
		obj2.setReal(arrayReal1);
		obj2.setImg(arrayImg1);
		
		arrayResult = operations.addComplexNumbers(obj1, obj2);
		
		for(int i = 0; i < arrayResult.length; i++) {
			System.out.println(i);
		}
		
		

}
