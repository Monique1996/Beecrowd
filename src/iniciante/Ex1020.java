package iniciante;

import java.util.Scanner;

public class Ex1020 {

	public static void main(String[] args) {
		
		int ano, meses, N;
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		
		ano = N / 365;
		N = N % 365;

		meses = N / 30;
		N = N % 30;

		System.out.printf("%d ano(s)%n%d mes(es)%n%d dia(s)%n", ano, meses, N);

		
		sc.close();

	}

}
