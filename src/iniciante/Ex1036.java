package iniciante;
import java.util.Locale;
import java.util.Scanner;

public class Ex1036 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b, c;
		
		a = sc.nextDouble();
		b = sc.nextDouble();;
		c = sc.nextDouble();;
		
		double R1, R2;
		double delta = Math.pow(b, 2.0) - 4*a*c;
		
		if (delta < 0 || a ==0) {
			System.out.println("Impossivel calcular");
		} else {
			R1 = (-b + Math.sqrt(delta)) / (2.0 * a);
			R2 = (-b - Math.sqrt(delta)) / (2.0 * a);
			System.out.printf("R1 = %.5f%nR2 = %.5f", R1, R2);
		}
		
		sc.close();

	}

}
