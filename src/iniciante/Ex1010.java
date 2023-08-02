package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Ex1010 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod, qtd, cod2, qtd2;
		double	unit, unit2, total;
		
		
		cod = sc.nextInt();
		qtd = sc.nextInt();
		unit = sc.nextDouble();
		
		cod2 = sc.nextInt();
		qtd2 = sc.nextInt();
		unit2 = sc.nextDouble();
		
		total = unit * qtd + unit2 * qtd2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		System.out.printf("VALOR A PAGAR: R$ %.d%n", cod); // tirar sinalização
		System.out.printf("VALOR A PAGAR: R$ %.d%n", cod2);// tirar sinalização
		
		sc.close();
	}

}
