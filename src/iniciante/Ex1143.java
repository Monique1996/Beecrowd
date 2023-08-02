package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Ex1143 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		for (int i = 1; i <= N; i++) {
			double a = i;
			double b = Math.pow(i, 2);
			double c = Math.pow(i, 3);
			System.out.printf("%.0f %.0f %.0f%n", a, b, c);
		}

		sc.close();

	}

}
