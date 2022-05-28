package app;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("What is the dollar price?");
		double dolarPrice = scanner.nextDouble();
		
		System.out.println("How many dollars will be bought");
		int quantity = scanner.nextInt();
		
		double total = CurrencyConverter.calculateTotal(dolarPrice, quantity);
		System.out.println("Amout to be paid in reais = " + total);
		
		scanner.close();
	}

}
