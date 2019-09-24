package inheritance3.service;

public class SavingAccount extends Accounts {

	int rateOfInterest;
	int amount;
	int amtw;
	int amtd;

	public int withdrawal(int amount) {
		this.balance = balance - amount;
		return this.balance;

	}

	public void deposit(int amount) {
		this.amtd = amount;

	}

	public void calculateAmount() {
		balance += this.amtd;
		System.out.println("New amount : "+balance);
	}

	public SavingAccount(int balance, int accountNumber, String accountHoldersName, String address,
			int rateOfInterest) {
		super(balance, accountNumber, accountHoldersName, address);
		this.rateOfInterest = rateOfInterest;
	}

	public void display() {
		super.display();
		System.out.println("Rate of interest with new Balance : " + rateOfInterest);

	}

}
