package application;

import java.util.Scanner;

import entities.Triangle;

public class Program {
	
	public static void main (String[] args) {
		Triangle x, y;
		
		x = new Triangle();
		y = new Triangle();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com os pontos do triangulo X:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Entre com os pontos do triangulo Y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("Área do triangulo X: %.4f%n", areaX);
		System.out.printf("Área do triangulo Y: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Maior área: X (" + areaX + ")");
		} else {
			System.out.println("Maior área: Y (" + areaY + ")");
		}
		sc.close();
	}
}
