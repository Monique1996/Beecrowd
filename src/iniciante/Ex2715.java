package iniciante;

//aceito - alterei depois para aceitar peso valor 0

import java.util.Scanner;

public class Ex2715 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {

			int n = sc.nextInt();
			int[] x = new int[n];
			double soma = 0;
			int j = 0;
			double resposta = 0;
			int solucao;

			for (int i = 0; i < x.length; i++) {
				x[i] = sc.nextInt();
				soma += x[i];
			}

			if (n == 1) {
				solucao = x[0];

			} else {

				while (Math.abs(soma / 2 - resposta) >= Math.abs(soma / 2 - (resposta + x[j]))) {
					resposta += x[j];
					j++;
				}
				solucao = (int) Math.abs((soma / 2 - resposta) * 2);

			}

			System.out.printf("%d%n", solucao);

		}

		sc.close();
	}
}