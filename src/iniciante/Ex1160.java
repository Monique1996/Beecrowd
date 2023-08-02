package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Ex1160 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		//System.out.println("Quantidade de interações");

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			//System.out.println("PA E PB");
			long pa = sc.nextLong();
			long pb = sc.nextLong();
			
			//System.out.println("GA E GB");
			double g1 = sc.nextDouble();
			double g2 = sc.nextDouble();

			int t = 0;

			while (t <= 100 && pa <= pb) {
				t++;
				pa = (int) (pa * (1 + g1 / 100));
				pb = (int) (pb * (1 + g2 / 100));
			}

			if (t  > 100) {
				System.out.println("Mais de 1 seculo.");
			} else {
				System.out.printf("%d anos.%n", t);
			}

			sc.close();
		}

	}

}
