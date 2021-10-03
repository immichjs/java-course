package input;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome;
		int idade;
		double salario;
		
		System.out.println("Digite seu nome, idade e salário > ");
		nome = sc.next();
		idade = sc.nextInt();
		salario = sc.nextDouble();
		
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Salário: " + salario);
		
		char x;
		
		System.out.println("Digite uma letra > ");
		x = sc.next().charAt(0);
		
		System.out.println(x);
		
		String s1, s2, s3;
		
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();
	}

}
