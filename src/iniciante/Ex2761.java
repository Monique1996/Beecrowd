package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Ex2761 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		float B = sc.nextFloat();
		char C = sc.next().charAt(0);
		String Di = sc.nextLine();
		String D = Di.trim().replaceAll(" +", " ");
		
		System.out.printf("%d%.6f%c%s\n", A, B, C, D);
		System.out.printf("%d\t%.6f\t%c\t%s\n", A, B, C, D);
		System.out.printf("%10d%10.6f%10c%10s\n", A, B, C, D);
		
		
	/*	Scanner leitor = new Scanner(System.in);
		int A = leitor.nextInt();
		float B = leitor.nextFloat();
		char C = leitor.next().charAt(0);
		String input = leitor.nextLine();
		String[] sd = input.split("");
		String after = input.trim().replaceAll(" +", " ");
		
		//String D = "";
		//for (int i = 1; i < sd.length; i++) D += sd[i];
		//System.out.printf("%d%.6f%c%s\n", A, B, C, D);
		//System.out.printf("%d\t%.6f\t%c\t%s\n", A, B, C, D);
	*/	//System.out.printf("%10d%10.6f%10c%10s\n", A, B, C, D);
		
		//leitor.close();
		sc.close();
	}

}
