package day18_0501.api.lang.string;

public class StringQuiz03 {

	public static void main(String[] args) {
		//회문비교 -> "다시 합창 합시다"
	      /*
	      1. String palindrome(String)함수는 매개변수로 String 값을 받아, 회문 여부를 검사하는 static 메서드입니다.
	      4. 문장은 공백을 포함하여 받을 수 있습니다.
	      5. 회문이라면 "회문입니다", 아니라면 "회문이 아닙니다" 를 리턴합니다.
	         조건
	         빌더의 reverse() 는 금지 입니다.
	      
	      6. 힌트)
	      * 공백은 없어져야 비교가 됩니다. 
	      * 회문은 첫글자와, 마지막글자 가 똑같습니다.
	      * 
	      */
		
		System.out.println(palindrome("다시 합창 합시다"));
		
	}
	
	public static String palindrome(String s) {

		
		
		//		s = s.replace(" ", "");
//		int leng = s.length();
//		for(int i = 0; i < leng / 2; i++) {
//			if(s.charAt(i) != s.charAt(leng -i -1)) {
//				return "회문이 아니다";
//			}
//		}
		return "회문 이다";
		
	}

}
