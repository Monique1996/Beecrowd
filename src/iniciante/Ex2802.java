package iniciante;

import java.util.Scanner;

public class Ex2802 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		double face = 1 + (Math.pow(n, 4)- 6*Math.pow(n, 3) + 23*Math.pow(n, 2) - 18*n)/24;
 
	    System.out.printf("%.0f%n", face);


		sc.close();

	}

}
