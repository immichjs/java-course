import java.util.Scanner;

public class Fahrenheit {

	public static void main(String[] args) {
		
		char repeat;
		double fahrentheit = 0.0;
		int celsius = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.print("Digite a temperatura em Celsius: ");
			celsius = scanner.nextInt();
			
			fahrentheit = celsius * 9 / 5 + 32;
			
			System.out.printf("Equivalente em Fahrenheit: %.2f%n", fahrentheit);
			
			System.out.print("Deseja repetir (S/N)?");
			repeat = scanner.next().charAt(0);
		} while (repeat != 'n');
		
		scanner.close();
	}

}
