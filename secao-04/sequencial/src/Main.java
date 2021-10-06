import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		int y = 32;
		double x = 10.35784;
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		
		System.out.println(y);
		
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x);
		
		System.out.println("Resultado: " + x + " metros");
		
		System.out.printf("Resultado: %.2f metros%n", x);
		
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
		
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		Locale.setDefault(Locale.FRENCH);
		
		System.out.println("Products:");
		System.out.printf("%s, which price is $ %.2f%n", product1, price1);
		System.out.printf("%s, which price is $ %.2f%n%n", product2, price2);
		
		System.out.printf("Record: %d years old, code %d and gender: %c%n%n", age, code, gender);
		
		System.out.println("Measure with eight decial places: $ " + measure);
		System.out.printf("Rouded (three decimal places): %.3f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f", measure);
		
		int a, b;
		
		a = 5;
		b = 2 * a;
		
		System.out.println(a);
		System.out.println(b);
		
		double x1 = 3.0;
		double y1 = 4.0;
		double z1 = -5.0;
		double A, B, C;
		
		A = Math.sqrt(x1);
		B = Math.sqrt(y1);
		C = Math.sqrt(25.0);
		
		System.out.println("Raiz quadrada de " + x1 + " = " + A);
		System.out.println("Raiz quadrada de " + y1 + " = " + B);
		System.out.println("Raiz quadrada de 25 =" + C);
		
		A = Math.pow(x1, y1);
		B = Math.pow(x1,  2.0);
		C = Math.pow(5.0, 2.0);
		System.out.println(x1 + " elevado a " + y1 + " = " + A);
		System.out.println(x1 + " elevado ao quadrado = " + B);
		System.out.println("5 elevado ao quadrado = " + C);
		
		A = Math.abs(y1);
		B = Math.abs(z1);
		System.out.println("Valor absoluto de " + y1 + " = " + A);
		System.out.println("Valor absoluto de " + z1 + " = " + B);
	}

}
