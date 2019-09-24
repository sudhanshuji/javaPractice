package inheritance3.service;

public class CurrentAccount extends Accounts {

	int overDraftLimit;

	

	public int withdrawal(int amount) {
		if (amount < overDraftLimit)
			this.balance = balance - amount;
		return balance;

	}
	
	

	public CurrentAccount(int balance, int accountNumber, String accountHoldersName, String address,
			int overDraftLimit) {
		super(balance, accountNumber, accountHoldersName, address);
		this.overDraftLimit = overDraftLimit;
	}

	public void deposit(int amount) {

		balance = balance + amount;
	}

	public void display() {
		super.display();
		System.out.println("OverDraft Limit : " + overDraftLimit);
	}

}
