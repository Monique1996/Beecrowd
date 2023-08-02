package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Ex1005 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B;

		A = sc.nextDouble();
		B = sc.nextDouble();

		double MEDIA = (A * 3.5 + B * 7.5)/11;

		System.out.printf("MEDIA = %.5f%n", MEDIA);

		sc.close();

	}

}
