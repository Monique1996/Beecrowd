package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Ex1017 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int horas, velocidade, consumo=12;
		horas = sc.nextInt();
		velocidade = sc.nextInt();
		
		double litros = (double) velocidade * horas / consumo;
				
		System.out.printf("%.3f%n",litros);

		sc.close();

	}

}
