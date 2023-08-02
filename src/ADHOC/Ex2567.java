package ADHOC;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ex2567 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {

			int n = sc.nextInt();
			List<Integer> list = new ArrayList<>();

			for (int i = 0; i < n; i++) {
				list.add(sc.nextInt());
			}

			Collections.sort(list);

			int sum = 0;

			for (int i = 0; i < n / 2; i++) {
				sum += list.get(n - 1 - i) - list.get(i);
			}

			System.out.println(sum);

		}

		sc.close();

	}

}
