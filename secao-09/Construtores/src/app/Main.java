package app;

import java.util.Scanner;

import entities.Product;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter product data:");
		
		
		String name = scanner.next();
		double price = scanner.nextDouble();
		Product product = new Product(name, price);
		
		System.out.println("Product data: " + product.getName() + ", $ " + product.getPrice());
		
		System.out.println("Enter the number of products to be added in stock: ");
		int quantity = scanner.nextInt();
		product.addProducts(quantity);
		
		System.out.println("Updated quantity: " + product.getQuantity() + " units");
		
		System.out.println("Enter the number of products to be removed from stock: ");
		quantity = scanner.nextInt();
		product.removeProducts(quantity);
		
		System.out.println("Updated data: " + product.getQuantity() + " units");

		scanner.close();
	}

}