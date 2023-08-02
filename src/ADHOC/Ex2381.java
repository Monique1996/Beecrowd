package ADHOC;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ex2381 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		List<String> list = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			list.add(sc.next()); 
		}
		
		 Collections.sort(list);

	     System.out.printf("%s\n", list.get(k-1));
		
		sc.close();
	}

}
