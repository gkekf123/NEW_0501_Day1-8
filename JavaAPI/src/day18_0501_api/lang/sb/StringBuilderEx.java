package day18_0501_api.lang.sb;

public class StringBuilderEx {

	public static void main(String[] args) {

		
		//StringBuilder - 단일 쓰레드 환경에서 사용
		//StringBuffer - 멀티 쓰레드 환경에서 사용
		
		String str = new String("Java ");
		StringBuffer sb = new StringBuffer("Java ");	

		// 차이점
		str = str + "program";
		sb.append("program");	// 원본 문자열이 변함
		
		System.out.println(str);
		System.out.println(sb);	// 원본 문자열이 변함
		
		//========== 빌더의 함수 ==========\\
		
		//appned() - 문자열 끝에 바로 추가
		sb.append("ming");
		System.out.println(sb);
		
		//insert() - 중간에 추가
		sb.insert(4, "study ");	// insert(시작, 인덱스번째)
		System.out.println(sb);
		
		//replace() - 문자열 변경
		sb.replace(5, 10, "book");
		System.out.println(sb);
		
		//delete() - 삭제
		sb.delete(5, 9);	//5이상 9미만 삭제
		System.out.println(sb);
		
		sb.deleteCharAt(0);	//인덱스번째 삭제
		System.out.println(sb);
		
		//reverse() - 거꾸로 -> 원본이 변경 
		sb.reverse();
		System.out.println(sb);
			
		//toString() - 문자열로 형변환
		String result = sb.toString();
		System.out.println(result);
//		if("gnimmargorp sava".equals(sb)) {
//			System.out.println("같다"); -> 같지 않은게 맞다
//		}
	}

}
