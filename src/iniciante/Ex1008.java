package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Ex1008 {

	public static void main(String[] args) {
        Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int number, horas;
		double valor, salary;
		
		number = sc.nextInt();
		horas = sc.nextInt();
		valor = sc.nextDouble();
		
		salary = horas * valor;
		
		System.out.printf("NUMBER = %d%nSALARY = U$ %.2f%n", number, salary);
		
		
		sc.close();
 

	}

}
