package iniciante;

import java.util.Scanner;

public class Ex1973 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);

		//System.out.println("Digite a quantidades de sitios:");

		int N = sc.nextInt();
		
		//System.out.println("Digite a quantidades de carneiros:");
		
		long[] C = new long [N];
		long soma = 0;

		for (int i = 0; i < C.length; i++) {
			C[i] = sc.nextLong();
			soma += C[i];
		}

		int j = 0, cont = 0, maior = 0;

		while (j >= 0 && j <= N - 1 && C[j] > 0) {
			//System.out.println(C[j]);
			
			C[j] -= 1;
			
			if (j+1 > maior) {
				maior = j+1;
			}
			
			if ((C[j] + 1) % 2 != 0) {
				j++;
			} else {
				j--;
			}
			cont++;
			
		}

		System.out.printf("%d %d%n", maior, soma - cont);

		sc.close();
		

	}
}
