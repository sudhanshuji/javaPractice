package accounts.operations;

import accounts.entity.AccountsEntity;

public interface AccountsOperations {

	int withdrawal(int amt);
	int deposit(int amt);
	int display(int amt);
	int calculateAmount(int roi,int time);
	int displays(int roi,int newAmt,AccountsEntity details);
	int displayc(int amt,int overdraftLimit,AccountsEntity details);
	
}
