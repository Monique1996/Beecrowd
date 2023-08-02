package iniciante;

import java.util.Scanner;

public class Ex1019 {

	public static void main(String[] args) {

		int N, horas, minutos;
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		
		horas = N / 3600;
		N = N % 3600;

		minutos = N / 60;
		N = N % 60;

		System.out.printf("%d:%d:%d%n", horas, minutos, N);

		
		sc.close();
	}

}
