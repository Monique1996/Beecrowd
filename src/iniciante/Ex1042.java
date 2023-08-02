package iniciante;

import java.util.Scanner;

public class Ex1042 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		int menor = b;
		int maior = a;
		
		if (a < b) {
			menor = a;
			maior = b;
		}if (menor > c) {
			menor = c;
		}if (maior < c) {
			maior = c;
		}
	
		int medio = a + b +c - menor - maior;

		System.out.println(menor);
		System.out.println(medio);
		System.out.println(maior);
		System.out.println();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		sc.close();

		
		
	}

}
