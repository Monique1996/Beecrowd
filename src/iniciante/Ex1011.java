package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Ex1011 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double R, volume, pi;
		R = sc.nextDouble();
		pi = 3.14159;
		volume = (4/3.0) * pi * Math.pow(R, 3);
		
		System.out.printf("VOLUME = %.3f%n", volume);
		
		sc.close();

	}

}
