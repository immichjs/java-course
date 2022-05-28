package app;

import java.util.Scanner;

import entities.Aluno;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Aluno aluno = new Aluno();
		
		System.out.println("Nome: ");
		aluno.name = scanner.next();
		System.out.println("1° Trimestre: ");
		aluno.nota1 = scanner.nextDouble();
		System.out.println("2° Trimestre: ");
		aluno.nota2 = scanner.nextDouble();
		System.out.println("3° Trimestre: ");
		aluno.nota3 = scanner.nextDouble();
		
		
		aluno.showResult();
		scanner.close();
	}

}
