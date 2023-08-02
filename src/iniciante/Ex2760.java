package iniciante;

import java.util.Scanner;

public class Ex2760 {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		String frase[] = new String[3];

		for (int i = 0; i < 3; i++) {
			frase[i] = sc.nextLine();
		}

		StringBuilder frasecorreta = new StringBuilder();

		int a = 0;
		int b = 3;
		int y = 0;

		for (int i = 0; i < 3; i++) {

			for (int x = a; x < b; x++) {
				if (x >= 3) {
					y = x - 3;
				}
				frasecorreta.append(frase[y]);
				y += 1;
			}

			System.out.println(frasecorreta);
			frasecorreta.delete(0, frasecorreta.length());

			a += 1;
			b += 1;
			y = a;

		}

		int maximo = 10;

		for (int x = 0; x < 3; x++) {
			if (frase[x].length() <= maximo) {
				frasecorreta.append(frase[x]);
			} else {
				frasecorreta.append(frase[x].substring(0, maximo));
			}
		}
		
		System.out.println(frasecorreta);

		sc.close();

	}
}
