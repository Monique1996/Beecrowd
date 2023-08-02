package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Ex1079 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		double soma =0.0;
		double[] numeros = new double[3];

		
		for (int j = 0; j < N; j++) {
			for (int i = 0; i < numeros.length; i++) {
				numeros[i] = sc.nextDouble();
			}
			soma = numeros[0]*2 + numeros[1]*3 +numeros[2]*5;
			System.out.printf("%.1f%n",soma/10);
		}
	

		sc.close();


	}

}
