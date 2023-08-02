package iniciante;
 
//ACEITO

import java.util.Arrays;
import java.util.Scanner;

public class Ex2493 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {

			// número de expressões

			int T = sc.nextInt();
			int[][] matriz = new int[T][3];
			String[] resposta = new String[T];
			String nome, respostaUsuario;
			int escolha, cont = 0;
			String[] nomes = new String[T];

			for (int i = 0; i < resposta.length; i++) {

				int p1 = sc.nextInt();
				String p2 = sc.next();
				String[] separar = p2.split("=");

				matriz[i][0] = p1;
				matriz[i][1] = Integer.parseInt(separar[0]);
				matriz[i][2] = Integer.parseInt(separar[1]);

				// resposta correta

				if (matriz[i][0] + matriz[i][1] == matriz[i][2]) {
					resposta[i] = "+";
				} else if (matriz[i][0] - matriz[i][1] == matriz[i][2]) {
					resposta[i] = "-";
				} else if (matriz[i][0] * matriz[i][1] == matriz[i][2]) {
					resposta[i] = "*";
				} else {
					resposta[i] = "I";
				}
			}

			for (int i = 0; i < resposta.length; i++) {

				nome = sc.next();
				escolha = sc.nextInt() - 1;
				respostaUsuario = sc.next();

				if (respostaUsuario.equals(resposta[escolha])) {
					cont++;
					nomes[i] = "";
				} else {
					nomes[i] = nome;
				}
			}

			if (cont == T) {
				System.out.print("You Shall All Pass!");
			} else if (cont == 0) {
				System.out.print("None Shall Pass!");

			} else {

				Arrays.sort(nomes);
				// String players = null;

				for (int i = 0; i < nomes.length; i++) {
					if (nomes[i] != "") {
						// players = players.concat(nomes[i]);
						System.out.print(nomes[i]);
						if (i > 0 && i < nomes.length - 1) {
							// players = players.concat(" ");
							System.out.print(" ");
						}
					}
				}
			}
			System.out.println();
		}
		sc.close();

	}

}
