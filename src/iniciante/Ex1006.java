package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Ex1006 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C;

		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();

		double MEDIA = (A * 2.0 + B * 3.0 + C * 5)/10;

		System.out.printf("MEDIA = %.1f%n", MEDIA);

		sc.close();


	}

}
