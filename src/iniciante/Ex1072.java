package iniciante;

import java.util.Scanner;

public class Ex1072 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int in = 0, out = 0;

		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();

			if (x >= 10 && x <= 20) {
				in++;
			} else {
				out++;
			}
		}
		
		System.out.printf("%d in%n%d out%n", in, out);
		
		sc.close();


	}

}
