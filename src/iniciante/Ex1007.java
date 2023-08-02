package iniciante;

import java.util.Scanner;

public class Ex1007 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A, B, C, D;

		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();

		int DIFERENCA = A * B - C * D;

		System.out.println("DIFERENCA = " + DIFERENCA);

		sc.close();

	}

}
