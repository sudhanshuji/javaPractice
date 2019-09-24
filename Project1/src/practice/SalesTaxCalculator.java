package practice;

public class SalesTaxCalculator {
	float amount ;
	float taxRate;
	
	SalesTaxCalculator(){
		amount=100;
		taxRate=10;
	}
	void calculateTax() {
	float taxAmount=amount*taxRate/100;
	System.out.println(taxAmount);
	}
public static void main(String[] args) {
	SalesTaxCalculator obj1=new SalesTaxCalculator();
	SalesTaxCalculator obj2=new SalesTaxCalculator();
	
	System.out.println(obj1.amount);
	System.out.println(obj2.taxRate);
	}

}
