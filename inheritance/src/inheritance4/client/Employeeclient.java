package inheritance4.client;

import inheritance4.service.FullTimeEmployee;
import inheritance4.service.PartTimeEmployee;

public class Employeeclient {
	public static void main(String[] args) {
		PartTimeEmployee emp1=new PartTimeEmployee("Gaurav Sharan","MyllaShandra",28, "Male", 9, 1200);
		emp1.calculatePay();
		emp1.display();
		FullTimeEmployee emp2=new FullTimeEmployee("Saurav Sharan", "Global Village",25, "Male", 30000, "Android Developer");
		emp2.display();
	}

}
