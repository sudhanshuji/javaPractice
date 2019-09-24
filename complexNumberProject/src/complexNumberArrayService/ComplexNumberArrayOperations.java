package complexNumberArrayService;

import complexNumberProject.CoplexNumberArray;

public class ComplexNumberArrayOperations {

	public CoplexNumberArray addComplexNumbers(CoplexNumberArray num1, CoplexNumberArray num2) {
		CoplexNumberArray sum = new CoplexNumberArray();
		int newReal = num1.getReal() + num2.getReal();
		int newImg = num1.getImg() + num2.getImg();
		sum.setReal(newReal);
		sum.setImg(newImg);
		// sum.setReal(num1.getReal() + num2.getReal());
		// sum.setImg(num1.getImg() + num2.getImg());
		return sum;
	}
}
