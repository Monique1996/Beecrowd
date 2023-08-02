package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Ex1016 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = 60, y = 90, distancia;
		distancia = sc.nextInt();
		
		int minutos = 60 * distancia /(y-x);
				
		System.out.printf("%d minutos%n",minutos);

		sc.close();

	}

}
