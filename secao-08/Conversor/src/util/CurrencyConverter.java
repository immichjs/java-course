package util;

public class CurrencyConverter {
	public static final double IOF = 0.06;
	
	public static double calculateTotal (double dolarPrice, int quantity) {
		double total = dolarPrice * quantity;
		return total += total * IOF;
	}
	
}
