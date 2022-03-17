package num2675;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			
			int num = sc.nextInt();
			String a = sc.next();
			
			for (int j2 = 0; j2 < a.length(); j2++) {
				
				for (int j = 0; j < num; j++) {
					System.out.print(a.charAt(j2));
				}
			}
			System.out.println();
		}
		
		sc.close();
		
	}
}
