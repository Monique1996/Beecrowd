package iniciante;

import java.util.Scanner;

public class Ex1046 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int hora1 = sc.nextInt();
		int hora2 = sc.nextInt();
		int duracao;

		if (hora1 > hora2) {
			duracao = 24 - hora1 + hora2;
		} else if (hora1 == hora2){
			duracao = 24;
		}else {
				duracao = hora2 - hora1;
			}
		
		System.out.printf("O JOGO DUROU %d HORA(S)%n",duracao);
		
		sc.close();	


	}

}
