package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Ex1037 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double n = sc.nextDouble();
		
		int a = 0;
		int b = 25;
		int c = 50;
		int d = 75;
		int e = 100;		
		
		if (n >= a && n <= b) {
			System.out.printf("Intervalo [%d,%d]%n", a, b);
		}
		else if (n >b  && n <= c) {
			System.out.printf("Intervalo (%d,%d]%n", b, c);
		}
		else if (n > c && n <= d) {
			System.out.printf("Intervalo (%d,%d]%n", c, d);
		}
		else if (n > d && n <= e) {
			System.out.printf("Intervalo (%d,%d]%n", d, e);
		}
		else {
			System.out.println("Fora de intervalo");
		}

		sc.close();	

	}

}
