package day17_0428.api.lang.object;

import java.io.PrintStream;

public class MainClass {

	public static void main(String[] args) {
		
		Person p = new Person("홀길동");
		
		Person p2 = new Person("홍길동");
		
		//equals
		// 객체의 name변수가 같다면 true반환 하도록 오버라이딩
		boolean result = p.equals(p2);	//equals메서드는 모든 클래스에 다 있따 true/false 판단
		System.out.println(result);
		
		//toString - 주소값을 문자열로 반환
		//toString 메서드는 멤버변수 값ㅇ를 출력하도록 오버라이딩 많이 사용됩니다.
		System.out.println(p.toString());
		
		try {
			// 새로운 Person객체를 복사해서 반환
			Person clonePeople = (Person)p.clone();	
			System.out.println(clonePeople.getName());
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//객체의 주소를 해시알고리즘을 통해 변경한 값을 반환 (사용할 일 없음)
		int x = p.hashCode();
		System.out.println(x);
		
		//PrintStream ps = System.out;
		//ps.print("출력");
		//System.out -> PrintStream
		
	}
}
