package iniciante;

import java.util.Arrays;
import java.util.Scanner;

public class Ex3089 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		while (n>0) {
			
			int[] x = new int[2 * n];
			int[] pares = new int[n];

			for (int i = 0; i < x.length; i++) {
				x[i] = sc.nextInt();
			}

			for (int i = 0; i < pares.length; i++) {
				pares [i] = x[i]+ x[2*n-1-i];
			}
			
			Arrays.sort(pares);
			
			System.out.println(pares[n-1] + " " + pares[0]);

			n = sc.nextInt();
		}
		
		sc.close();
	}
}
