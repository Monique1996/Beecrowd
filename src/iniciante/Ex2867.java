package iniciante;

import java.util.Scanner;

public class Ex2867 {

	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);

		    int n = sc.nextInt();

		    for(int t=1; t<=n; t++) {
		    	double a = sc.nextDouble();
		    	double b = sc.nextDouble();

		        int x = (int) (Math.log10(a)*b + 1);
		        
		        System.out.println(x);
		    }
		    
		    sc.close();

	}

}
