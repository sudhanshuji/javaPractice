package operations.implementations;

import accounts.entity.AccountsEntity;
import accounts.operations.AccountsOperations;

public class AccountsOperationsImplementations implements AccountsOperations {

	int rateOfInterest;
	int ovrdraftLimit;
	AccountsEntity customerLog;
	int updatedBalance;

	public AccountsOperationsImplementations() {
	}

	public AccountsOperationsImplementations(int rateOfInterest, int ovrdraftLimit, AccountsEntity customerLog,int availBalance) {
		this.rateOfInterest = rateOfInterest;
		this.ovrdraftLimit = ovrdraftLimit;
		this.customerLog = customerLog;
		this.updatedBalance=availBalance;
	}

	public int withdrawal(int amt) {
	    int amtw=customerLog.getBalance();
		amtw=amtw-amt;
		this.updatedBalance=amtw;
		return amtw;
	}


	public int deposit(int amt) {
		int amtd=customerLog.getBalance();
		amtd=amtd+amt;
		this.updatedBalance=amtd;
		return amtd;
	}
	
	
	public int display(int amt) {
		int availBalance=amt;
		return availBalance;
	}


	public int getRateOfInterest() {
		return rateOfInterest;
	}

	public void setRateOfInterest(int rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}

	public int getOvrdraftLimit() {
		return ovrdraftLimit;
	}

	public void setOvrdraftLimit(int ovrdraftLimit) {
		this.ovrdraftLimit = ovrdraftLimit;
	}

	public AccountsEntity getCustomerLog() {
		return customerLog;
	}

	public void setCustomerLog(AccountsEntity customerLog) {
		this.customerLog = customerLog;
	}

	public int getUpdatedBalance() {
		return updatedBalance;
	}

	public void setUpdatedBalance(int updatedBalance) {
		this.updatedBalance = updatedBalance;
	}

	public int calculateAmount(int roi,int time) {

		this.rateOfInterest=roi;
		this.updatedBalance=customerLog.getBalance()+(customerLog.getBalance()*roi*time/100);
		return updatedBalance;
	}


	public int displays(int roi, int newAmt, AccountsEntity details) {
		
		System.out.println("rate of interest is : "+roi);
		System.out.println("customer's updated account balance is : "+this.updatedBalance);
		System.out.println("customer details are : "+details);
		return 0;
	}

	
	public int displayc(int amtToWithdraw,int overdraftLimit, AccountsEntity details) {
		if(amtToWithdraw>overdraftLimit)
			System.out.println("Overdraft limit exceeded");
		else
			this.updatedBalance=customerLog.getBalance()-amtToWithdraw;
			System.out.println("customer's updated account balance is : "+this.updatedBalance);
			System.out.println("customer details are : "+details);
		return 0;
	}

}

