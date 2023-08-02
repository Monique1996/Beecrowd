package ADHOC;

import java.util.Scanner;

public class Ex1091 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int k = sc.nextInt();

		while (k != 0) {

			int x = sc.nextInt();
			int y = sc.nextInt();

			for (int i = 0; i < k; i++) {

				int a = sc.nextInt();
				int b = sc.nextInt();

				System.out.println(cordenadas(a,b,x,y));
			}

			k = sc.nextInt();
		}

		sc.close();
	}

	public static String cordenadas(int a, int b, int x, int y) {
		String resposta;
		if (a < x && b < y) {
			resposta = "SO";
		} else if (a < x && b > y) {
			resposta = "NO";
		} else if (a > x && b < y) {
			resposta = "SE";
		} else if (a > x && b > y) {
			resposta = "NE";
		} else if (a <= x || b <= y) {
			resposta = "divisa";
		} else {
			resposta = "erro";
		}

		return resposta;
	}
}
