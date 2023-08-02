package iniciante;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1071 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] numeros = new int[2];

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = sc.nextInt();
		}
		
		Arrays.sort(numeros);
		int y = numeros[1], x = numeros[0], soma=0;

		for (int i = x+1; i < y; i++) {
			if (i % 2 != 0) {
				soma += i;
			}
		}
		
		System.out.println(soma);

		sc.close();
		
	}

}
