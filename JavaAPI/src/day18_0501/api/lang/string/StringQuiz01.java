package day18_0501.api.lang.string;

import java.util.Scanner;

public class StringQuiz01 {

	public static void main(String[] args) {

		/* 
		 * 스캐너 사용해서 id를 입력받는다
		 * 아이디는 공백을 포함해서 받을 수 있습니다 nextList()
		 * 단, 곻백을 제거한 아이디가 5글자 미만이면 다시 입력받는다
		 * 		5글자 이상이라면	 "id가 등록되었습니다" 출력 후 종료
		 */
		
		Scanner sc = new Scanner(System.in);
			
		
		
			while(true) {
				
				String s = sc.nextLine();
				s = s.replace(" ", "");
				
				if(s.length() >= 5) {
					System.out.println("id가 등록되었습니다.");
					break;
					
				} else if(s.length() < 5) {
					System.out.println("id를 다시 입력 받습니다");
				}	
				sc.close();
			}
			

			
			
			
		
		
		
		
	}

}
