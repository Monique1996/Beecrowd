package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Ex1012 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C;
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		double pi = 3.14159;
		double areaTriangulo = A * C / 2;
		double areaCirculo = pi * Math.pow(C, 2);
		double areaTrapezio = (C * (A+B))/2;	
		double areaQuadrado = Math.pow(B, 2);
		double areaRetangulo = 	A* B;
		
		System.out.printf("TRIANGULO: %.3f%n",areaTriangulo);
		System.out.printf("CIRCULO: %.3f%n",areaCirculo);
		System.out.printf("TRAPEZIO: %.3f%n",areaTrapezio);
		System.out.printf("QUADRADO: %.3f%n",areaQuadrado);
		System.out.printf("RETANGULO: %.3f%n",areaRetangulo);
				
		sc.close();
	}

}
