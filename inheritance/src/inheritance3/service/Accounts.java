package inheritance3.service;

public abstract class Accounts {

	protected int balance;
	protected int accountNumber;
	protected String accountHoldersName;
	protected String address;
	
	public Accounts(int balance, int accountNumber, String accountHoldersName, String address) {
		super();
		this.balance = balance;
		this.accountNumber = accountNumber;
		this.accountHoldersName = accountHoldersName;
		this.address = address;
	}
	public abstract int withdrawal(int amount);
	public abstract void deposit(int amount);
	public void display() {
		System.out.println("Available Balance : "+balance);
		System.out.println("Account Number : "+accountNumber);
		System.out.println("Account Holders Name : "+accountHoldersName);
		System.out.println("Address : "+address);
	}
}

