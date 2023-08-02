package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Ex1116 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] numeros = new int[2];

		for (int j = 0; j < N; j++) {
			for (int i = 0; i < numeros.length; i++) {
				numeros[i] = sc.nextInt();
			}
			if (numeros[1] != 0) {
				double divisao = (double) numeros[0] / numeros[1];
				System.out.printf("%.1f%n", divisao);
			} else {
				System.out.println("divisao impossivel");
			}
		}

		sc.close();
		

	}
}
