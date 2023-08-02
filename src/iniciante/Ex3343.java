package iniciante;

import java.util.Scanner;

//Accepted

public class Ex3343 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int x = sc.nextInt();
		int AltMuralha[] = new int[n];

		for (int i = 0; i < AltMuralha.length; i++) {
			AltMuralha[i] = x;
		}

		String Tamanho = sc.next();
		String[] split = Tamanho.split("");

		int Medida[] = new int[3];

		for (int i = 0; i < 3; i++) {
			Medida[i] = sc.nextInt();
		}

		int Ataque[] = new int[n];

		for (int i = 0; i < n; i++) {
			if (split[i].equals("P")) {
				Ataque[i] = Medida[0];
			} else if (split[i].equals("M")) {
				Ataque[i] = Medida[1];
			} else if (split[i].equals("G")) {
				Ataque[i] = Medida[2];
			}
		}

		int j = 0;
		int jmin_p = 0;
		int jmin_m = 0;
		int jmin_g = 0;

		for (int i = 0; i < n; i++) {

			if (split[i].equals("P")) {
				j = jmin_p;

				while (AltMuralha[j] < Ataque[i]) {
					j += 1;
				}
				AltMuralha[j] -= Ataque[i];
				jmin_p = j;
				
			} else if (split[i].equals("M")) {
				j = jmin_m;

				while (AltMuralha[j] < Ataque[i]) {
					j += 1;
				}

				AltMuralha[j] -= Ataque[i];
				jmin_m = j;

			} else if (split[i].equals("G")) {
				j = jmin_g;
				while (AltMuralha[j] < Ataque[i]) {
					j += 1;
				}
				AltMuralha[j] -= Ataque[i];
				jmin_g = j;

			} 
		}
		
		int maior;
		
		if (jmin_g>jmin_m && jmin_g>jmin_p) {
			maior = jmin_g;
		}else if (jmin_m>jmin_g && jmin_m>jmin_p) {
			maior = jmin_m;
		} else{
			maior = jmin_p;
		}

		System.out.println(maior+1);

		sc.close();

	}
}
