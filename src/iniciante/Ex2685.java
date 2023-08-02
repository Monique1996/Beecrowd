package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Ex2685 {
public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		

		while (sc.hasNext()) {

			double M = sc.nextDouble();
			double graus = M % 360;			

			String resposta;

			if (graus < 90) { 
				resposta = "Bom Dia!!";
			} else if (graus < 180) {
				resposta = "Boa Tarde!!";
			} else if (graus < 270) {
				resposta = "Boa Noite!!";
			} else {
				resposta = "De Madrugada!!";
			}

			
			System.out.println(resposta);

		}

		sc.close();

	}
}
