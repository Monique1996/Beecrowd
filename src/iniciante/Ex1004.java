package iniciante;

import java.util.Scanner;

public class Ex1004 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A, B;

		A = sc.nextInt();
		B = sc.nextInt();

		int PROD = A * B;

		System.out.println("PROD = " + PROD);

		sc.close();

	}

}
