package accounts.entity;

public class AccountsEntity {
	
	int balance;
	int accountNumber;
	String accountHoldersName;
	String address;
	
	
	public AccountsEntity(int balance, int accountNumber, String accountHoldersName, String address) {
		this.balance = balance;
		this.accountNumber = accountNumber;
		this.accountHoldersName = accountHoldersName;
		this.address = address;
	}
	
	
	public AccountsEntity() {

	}


	public int getBalance() {
		return balance;
	}


	public void setBalance(int balance) {
		this.balance = balance;
	}


	public int getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}


	public String getAccountHoldersName() {
		return accountHoldersName;
	}


	public void setAccountHoldersName(String accountHoldersName) {
		this.accountHoldersName = accountHoldersName;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	

}
