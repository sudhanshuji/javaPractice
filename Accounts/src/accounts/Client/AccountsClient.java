package accounts.Client;

import accounts.entity.AccountsEntity;
import accounts.operations.AccountsOperations;
import operations.implementations.AccountsOperationsImplementations;

public class AccountsClient {

	public static void main(String[] args) {
		AccountsEntity customer=new AccountsEntity(5000000, 2038087654, "sudhanshu", "Bhopal");
		AccountsOperationsImplementations obj=new AccountsOperationsImplementations(10, 50000,customer,customer.getBalance());
		System.out.println(obj.calculateAmount(obj.getRateOfInterest(),5));
		System.out.println(obj.display(customer.getBalance()));
		System.out.println(obj.withdrawal(30000));
		System.out.println(obj.deposit(40000));
		
	}

}