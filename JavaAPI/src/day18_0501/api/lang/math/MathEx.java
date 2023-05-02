package day18_0501.api.lang.math;

public class MathEx {

	public static void main(String[] args) {

		//double d = Math.random();	// 반환은 더블형~
		//System.out.println(d);
		int r = (int)(Math.random() * 10) + 1;	// 1 ~ 10
		System.out.println(r);
		
		//절대값
		double d = Math.abs(-3.14);
		System.out.println(d);
		
		//올림
		double d1 = Math.ceil(3.14);
		System.out.println(d1);
		
		//내림
		double d2 = Math.floor(3.14);
		System.out.println(d2);
		
		//반올림
		double d3 = Math.round(3.5);
		System.out.println(d3);
		
		//큰 수 반환
		int i = Math.max(3, 20);
		System.out.println(i);
		
		//작은 수 반환
		int i1 = Math.min(4, 10);
		System.out.println(i1);
	}

}
