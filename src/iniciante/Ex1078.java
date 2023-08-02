package iniciante;

import java.util.Scanner;

public class Ex1078 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = 0;
		
		while (N <= 2 || N >= 1000) {
			N = sc.nextInt();
		}

		for (int i = 1; i < 11; i++) {
			int multiplicacao = N * i;
			System.out.printf("%d x %d = %d%n", i,N, multiplicacao);
		}

		sc.close();

	}

}
