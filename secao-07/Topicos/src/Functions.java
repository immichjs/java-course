import java.util.Scanner;

public class Functions {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite três números: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int max = verificaMaior(a, b, c);
		
		System.out.println("Maior > " + max);
		
		sc.close();
	}
	
	public static int verificaMaior (int a, int b, int c) {
		if (a > b && a > c) {
			return a;
		} else if (b > c) {
			return b;
		} else {
			return c;
		}
	
	}

}
