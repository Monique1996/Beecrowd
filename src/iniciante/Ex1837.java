package iniciante;

import java.util.Scanner;

public class Ex1837 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int q = a/b;
		int r = a%b;
		
		if (r < 0 && a <0 && b > 0) {
			q -=1;
			r = a - b*q;
		} else if (r<0){
			q +=1;
			r = a - b*q;
		}
		
		System.out.printf("%d %d%n", q, r);
		
		sc.close();

	}

}
