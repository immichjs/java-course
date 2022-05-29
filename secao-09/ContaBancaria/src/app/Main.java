package app;

import java.util.Scanner;

import entities.Account;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Account account = new Account();
		
		System.out.println("Enter account number:");
		int accountNumber = scanner.nextInt();
		System.out.println("Enter account holder:");
		String accountHolder = scanner.next();
		System.out.println("Is there initial deposit (y/n)?");
		char initial = scanner.next().charAt(0);
		
		if (initial != 'n') {
			System.out.println("Enter initial deposit value:");
			double initialDeposit = scanner.nextDouble();
			account = new Account(accountNumber, accountHolder, initialDeposit);
		} else {
			account = new Account(accountNumber, accountHolder);	
		}
		
		System.out.println("Account data: " + account);
		
		System.out.println("Enter a deposit value:");
		double deposit = scanner.nextDouble();
		
		account.deposit(deposit);
		System.out.println("Updated data: " + account);
		
		System.out.println("Enter a withdraw value:");
		double withdraw = scanner.nextDouble();
		
		account.withdraw(withdraw);
		System.out.println("Updated data: " + account);

		scanner.close();
	}

}
