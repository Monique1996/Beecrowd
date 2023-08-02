package iniciante;

import java.util.Scanner;

public class Ex2520 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		int Xm = 0, Ym = 0, X0 = 0, Y0 = 0;

		while (sc.hasNext()) {

			int N = sc.nextInt();
			int M = sc.nextInt();

			int[][] matriz = new int[N][M];
			
			for (int linhas = 0; linhas < N; linhas++) {
				for (int cols = 0; cols < M; cols++) {
					matriz[linhas][cols] = sc.nextInt();
					if (matriz[linhas][cols] == 2) {
						Xm = cols;
						Ym = linhas;
					} else if (matriz[linhas][cols] == 1) {
						X0 = cols;
						Y0 = linhas;
					}
				}
			}
			int tempo = Math.abs(X0 - Xm) + Math.abs(Y0 - Ym);
			System.out.println(tempo);
		}

		sc.close();

	}

}
