import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int n = 0;
		int y = 0;
		
		System.out.println("Quantos números serão somados?");
		n = sc.nextInt();
		
		
		for (int x = 0; x < n; x++) {
			System.out.println("Digite um número: ");
			y = sc.nextInt();
			
			sum += y;
			System.out.println(sum);
		}
		
		System.out.println("Fim do programa");
		
		sc.close();

	}

}
