package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Ex2686 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {

			double M = sc.nextDouble();
			double graus = M % 360;	

			double segundostotais = graus * 240 + 21600;
			
			int quociente = (int) (segundostotais/60);
			int segundos =  (int) segundostotais % 60;
			int horas = (int) (quociente/60);
			int minutos = (int) (quociente % 60);
			

			String resposta;

			if (graus < 90) {
				resposta = "Bom Dia!!";
			} else if (graus < 180) {
				resposta = "Boa Tarde!!";
			} else if (graus < 270) {
				resposta = "Boa Noite!!";
			} else {
				resposta = "De Madrugada!!";
				horas = horas - 24;
			}

			System.out.println(resposta);
			System.out.printf("%02d:%02d:%02d%n", horas, minutos,segundos);

		}
		sc.close();
	}
}