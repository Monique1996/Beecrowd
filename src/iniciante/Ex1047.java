package iniciante;

import java.util.Scanner;

public class Ex1047 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int hora1 = sc.nextInt()*60;
		int minutos1 = sc.nextInt();
		int hora2 = sc.nextInt()*60;
		int minutos2 = sc.nextInt();
		
		int duracao, horatotal, minutostotal;
		
		int tempo1 = hora1+minutos1;
		int tempo2 = hora2+minutos2;

		if (tempo1 >= tempo2) {
			duracao = 1440 - tempo1 + tempo2;
		}else {
				duracao = tempo2 - tempo1;
			}
		
		horatotal= duracao/60;
		minutostotal = duracao%60;
		
		System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", horatotal, minutostotal);
		
		sc.close();	

	}

}
