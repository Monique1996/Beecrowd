package ADHOC;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex2479 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		List<String> name = new ArrayList<>();
		List<Character> status = new ArrayList<>();

		sc.nextLine();

		for (int i = 0; i < n; i++) {
			String fields[] = sc.nextLine().split(" ");
			status.add(fields[0].charAt(0));
			name.add(fields[1]);
		}

		Collections.sort(name);
		int a = status.stream().filter(p -> p == '+').collect(Collectors.toList()).size();
		int b = status.stream().filter(p -> p == '-').collect(Collectors.toList()).size();

		for (int i = 0; i < n; i++) {
			System.out.printf("%s\n", name.get(i));

		}

		System.out.printf("Se comportaram: %d | Nao se comportaram: %d%n", a, b);

		sc.close();

	}

}
