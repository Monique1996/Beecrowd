package iniciante;

import java.util.Scanner;

public class Ex2968 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int V = sc.nextInt();
		int N = sc.nextInt();
		
		long totalPlacas = V * N;
		long P=0;
		
		for (int i = 10; i < 90; i+=10) {
			P = (long) Math.ceil(totalPlacas*i/100.0);
			System.out.printf("%d ",P);
		}
		
		P = (long) Math.ceil(totalPlacas*90/100.0);
		
		System.out.printf("%d%n",P);
		
		sc.close();
	}

}
