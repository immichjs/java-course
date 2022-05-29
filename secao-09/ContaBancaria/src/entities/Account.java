package entities;

public class Account {
	private int accountNumber;
	private String accountHolder;
	private double balance;
	
	public Account () {}

	public Account(int accountNumber, String accountHolder, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		deposit(initialDeposit);
	}

	public Account(int accountNumber, String accountHolder) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
	}

	public int getAccountNumber() {
		return accountNumber;
	}


	public String getAccountHolder() {
		return accountHolder;
	}


	public double getBalance() {
		return balance;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	
	public void deposit (double balance) {
		this.balance += balance;
	}
	
	public void withdraw (double balance) {
		this.balance -= balance + 5;
	}


	public String toString () {
		return "Account " + this.accountNumber + ", Holder: " + this.accountHolder + ", Balance: $ " + this.balance;
	}
}
