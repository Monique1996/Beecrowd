package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Ex1002 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio, area, n = 3.14159;
	    
	    raio = sc.nextDouble();

	    area = Math.pow(raio, 2) * n;

	    System.out.printf("A=%.4f%n", area);

		sc.close();
	}
}
