package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Ex1003 {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int A, B;

		A = sc.nextInt();
		B = sc.nextInt();

		int soma = A + B;

		System.out.println("SOMA = " + soma);

		sc.close();

	}

}
