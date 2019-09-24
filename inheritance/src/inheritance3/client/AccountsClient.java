package inheritance3.client;

import inheritance3.service.CurrentAccount;
import inheritance3.service.SavingAccount;

public class AccountsClient {

	public static void main(String[] args) {
		SavingAccount sa=new SavingAccount(1000000, 20380,"Sudhanshu","Bhopal", 20);
		sa.withdrawal(50000);
		sa.deposit(3);
		sa.calculateAmount();
		
		sa.display();
		CurrentAccount ca=new CurrentAccount(500000, 3456789, "Gaurav", "Global Village", 50000);
		ca.withdrawal(5000);
		ca.deposit(3000);
		ca.display();

	}

}
