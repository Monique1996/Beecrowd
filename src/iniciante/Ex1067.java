package iniciante;

import java.util.Scanner;

public class Ex1067 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = 0;
		
		while (N < 1 || N > 1000) {
			N = sc.nextInt();
		}
		
		for (int i = 1; i <= N; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
	
		}
		
		sc.close();


	}

}
