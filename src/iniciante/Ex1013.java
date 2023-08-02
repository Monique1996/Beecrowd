package iniciante;

import java.util.Scanner;

public class Ex1013 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, MaiorAB, MaiorABC;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		MaiorAB = (a+b+Math.abs(a-b))/2;
		MaiorABC = (MaiorAB+c+Math.abs(MaiorAB-c))/2;
		
		System.out.printf("%d eh o maior%n",MaiorABC);
				
		sc.close();
 

	}

}
