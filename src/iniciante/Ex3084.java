package iniciante;

import java.util.Scanner;

public class Ex3084 {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		int h;
		int m;

		while (sc.hasNext()) {

			h = sc.nextInt();
			m = sc.nextInt();

			h = h / 30;
			m = m / 6;

			String a;
			String b;

			if (h < 10) {
				a = "0" + h;
			} else {
				a = String.valueOf(h);
			}

			if (m < 10) {
				b = "0" + m;
			} else {
				b = String.valueOf(m);
			}

			System.out.println(a + ":" + b);
		}

	}
}
