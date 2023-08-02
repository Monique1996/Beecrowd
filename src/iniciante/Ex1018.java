package iniciante;

import java.util.Scanner;

public class Ex1018 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int nota100 = 0, nota50 = 0, nota20 = 0, nota10 = 0, nota5 = 0, nota2 = 0, nota1 = 0, valor = N;

		if (N >= 100) {
			nota100 = N / 100;
			N -= nota100 * 100;
		}
		if (N >= 50) {
			nota50 = N / 50;
			N -= nota50 * 50;
		}
		if (N >= 20) {
			nota20 = N / 20;
			N -= nota20 * 20;
		}
		if (N >= 10) {
			nota10 = N / 10;
			N -= nota10 * 10;
		}
		if (N >= 5) {
			nota5 = N / 5;
			N -= nota5 * 5;
		}
		if (N >= 2) {
			nota2 = N / 2;
			N -= nota2 * 2;
		}
		if (N >= 1) {
			nota1 = N / 1;
		}
		
		System.out.println(valor);
		System.out.printf("%d nota(s) de R$ 100,00%n", nota100);
		System.out.printf("%d nota(s) de R$ 50,00%n", nota50);
		System.out.printf("%d nota(s) de R$ 20,00%n", nota20);
		System.out.printf("%d nota(s) de R$ 10,00%n", nota10);
		System.out.printf("%d nota(s) de R$ 5,00%n", nota5);
		System.out.printf("%d nota(s) de R$ 2,00%n", nota2);
		System.out.printf("%d nota(s) de R$ 1,00%n", nota1);

		/*
		int N, N100, N50, N20, N10, N5, N2, N1, N0;
		N = sc.nextInt();
		N0 = N;

		N100 = N / 100;
		N = N % 100;

		N50 = N / 50;
		N = N % 50;

		N20 = N / 20;
		N = N % 20;

		N10 = N / 10;
		N = N % 10;

		N5 = N / 5;
		N = N % 5;

		N2 = N / 2;
		N = N % 2;

		N1 = N / 1;

		System.out.println(N0);
		System.out.printf("%d nota(s) de R$ 100,00%n", N100);
		System.out.printf("%d nota(s) de R$ 50,00%n", N50);
		System.out.printf("%d nota(s) de R$ 20,00%n", N20);
		System.out.printf("%d nota(s) de R$ 10,00%n", N10);
		System.out.printf("%d nota(s) de R$ 5,00%n", N5);
		System.out.printf("%d nota(s) de R$ 2,00%n", N2);
		System.out.printf("%d nota(s) de R$ 1,00%n", N1);
		*/
		
		
		sc.close();

	}

}
