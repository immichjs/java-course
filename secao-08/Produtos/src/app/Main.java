package app;

import java.util.Scanner;

import entities.Product;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("Enter product data:");
		product.name = scanner.next();
		product.price = scanner.nextDouble();
		product.quantity = scanner.nextInt();
		
		System.out.println("Product data: " + product);
		
		System.out.println("Enter the number of products to be added in stock: ");
		int quantity = scanner.nextInt();
		product.addProducts(quantity);
		
		System.out.println("Updated data: " + product);
		
		System.out.println("Enter the number of products to be removed from stock: ");
		quantity = scanner.nextInt();
		product.removeProducts(quantity);
		
		System.out.println("Updated data: " + product);

		scanner.close();
	}

}
