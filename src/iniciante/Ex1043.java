package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Ex1043 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double a, b, c;
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();

		double menor = b, maior = a;

		if (a < b) {
			menor = a;
			maior = b;
		}if (menor > c) {
			menor = c;
		}if (maior < c) {
			maior = c;
		}

		double medio = a + b + c - menor - maior;

		if (menor + medio > maior && menor > maior - medio) {
			double perimetro = a + b + c;
			System.out.printf("Perimetro = %.1f%n",perimetro);
		} else {
			double area = (a+b)* c / 2;
			System.out.printf("Area = %.1f%n",area);
		}

		sc.close();
		
	}
}