package day18_0501.api.lang.wrapper;

public class BoxingEx {

	public static void main(String[] args) {

		// 기본 타입 변수
		int a = 100;
		double b = 3.14;
		char c = 'A';
		boolean d = false;
		
		// boxing : 기본타입을 -> 클래스형으로 변환
		Integer v1 = new Integer(a);
		Double v2 = new Double(b);
		Character v3 = new Character(c);
		Boolean v4 = new Boolean(d);
		
		/* 값은 나온다
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
		*/
		
		Object[] arr = {v1, v2, v3, v4};
		
		// unboxing : 클래스형 -> 기본타입으로 변환
		int result = v1.intValue();
		double result2 = v2.doubleValue();
		char result3 = v3.charValue();
		boolean result4 = v4.booleanValue();
	
		// 위 코드처럼 만들 필요 없다
		// parse.기본타입
		
		
		
	}

}
