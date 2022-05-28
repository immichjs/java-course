package app;

import java.util.Scanner;

import entities.Funcionario;

public class Main {
	public static void main (String[] args) { 
		Scanner scanner = new Scanner(System.in);
		Funcionario funcionario = new Funcionario();
		
		System.out.println("Nome: ");
		funcionario.name = scanner.next();
		System.out.println("Gross Salary: ");
		funcionario.grossSalary = scanner.nextDouble();
		System.out.println("Tax: ");
		funcionario.tax = scanner.nextDouble();
		
		System.out.println("Employee: " + funcionario);
		
		System.out.println("Which percentage to increase salary?");
		double aumento = scanner.nextDouble();
		funcionario.increaseSalary(aumento);
		
		System.out.println("Updated data: " + funcionario);
		
		scanner.close();
	}
}
