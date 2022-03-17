package num1157;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		int[] arr = new int[26];

//######################################
//		for (int i = 0; i < s.length(); i++) {
//			char ch = s.charAt(i);
//			
//			for(char j = 'a'; j <= 'z'; j++) {
//				
//				if(ch == j) {
//					ch = (char)(s.charAt(i) - 32);
//					System.out.println(ch);
//					cnt[i]++;
//				}
//			} //대문자로 바꾸기, 갯수 새기 완료
//			// cnt를 비교하는 방법 : cnt자체를 배열로 만들어서 for문을 이용해서 
//			// cnt배열 안에서 값이 젤 큰놈을 출력하는 방법
//		}
//#######################################
// 대소문자 구분이 없으니
// 대문자든 소문자든 같은 값을 int값으로 설정해두면됨
		for (int i = 0; i < s.length(); i++){
			 
			if (65 <= s.charAt(i) && s.charAt(i) <= 90) { // 대문자 범위
				arr[s.charAt(i) - 65]++;	// 해당 인덱스의 값 1 증가
			}
		    
			else {	// 소문자 범위
				arr[s.charAt(i) - 97]++;
			}
		}
//####################################		
//		int max = 0;
//		for (int i = 0; i < cnt.length; i++) {
//			if(cnt[i] > max) {
//				max = cnt[i];
//			}
//		}
//		 sc.close();
//####################################
//
			int max = -1;
			char ch = '?';
	 
			for (int i = 0; i < 26; i++) {
				if (arr[i] > max) {
					max = arr[i];
					ch = (char) (i + 65); // 대문자로 출력해야하므로 65를 더해준다.
				}
				else if (arr[i] == max) {
					ch = '?';
				}
			}
			System.out.print(ch);
		}
		 
	}
