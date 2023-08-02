package iniciante;

import java.util.Scanner;

public class Ex1134 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int cont1 = 0, cont2 = 0, cont3 = 0;

		while (x != 4) {
			
			switch (x) {
			case 1:
				cont1++;
				break;
			case 2:
				cont2++;
				break;
			case 3:
				cont3++;
				break;
			}
			x = sc.nextInt();
		}

		System.out.println("MUITO OBRIGADO");
		System.out.printf("Alcool: %d%n", cont1);
		System.out.printf("Gasolina: %d%n", cont2);
		System.out.printf("Diesel: %d%n", cont3);
		

		sc.close();

	}

}
