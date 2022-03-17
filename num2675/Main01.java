package num2675;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main01 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			
			String[] str = br.readLine().split(" ");
			
			// 한줄 안에 '숫자' '문자' 두개의 다른 입력값을 넣으려고한다
			// 그러기위해서 split을 이용해 숫자와 문자 사이의 공백을 제거하면서
			// 문자배열로 분리 시켜서 활용하는 방식을 보여준다
			
			int num = Integer.parseInt((str[0]));
			String s = str[1];
			
			for(int j = 0; j < s.length(); j++) {
				for(int j2 = 0; j2 < num; j2++) {
					System.out.println(s.charAt(j));
				}
			}
			System.out.println();
		}
	}
}
