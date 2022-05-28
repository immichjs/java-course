package app;

import java.util.Scanner;

import entities.Retangulo;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Enter rectangle width and height: ");
		retangulo.width = scanner.nextDouble();
		retangulo.height = scanner.nextDouble();
		
		retangulo.showResult();
		
		scanner.close();
	}

}
