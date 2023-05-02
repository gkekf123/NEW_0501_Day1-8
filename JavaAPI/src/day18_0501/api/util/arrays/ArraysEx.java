package day18_0501.api.util.arrays;

import java.util.Arrays;

public class ArraysEx {

	public static void main(String[] args) {

		int[] arr = {3,1,2,5,6,7};
		
		// 정렬
		Arrays.sort(arr);
		
		// 배열을 문자열로
		System.out.println(Arrays.toString(arr));
		
		// 탐색 - (배열명, 찾고싶은 키) \\ 선행조건 : 정렬이 되어 있어야 된다 //
		int result = Arrays.binarySearch(arr, 3);
		System.out.println(result);
		System.out.println(Arrays.binarySearch(arr, 7));
		System.out.println(Arrays.binarySearch(arr, 4));	//찾는 키가 없으면 음수가 나온다	
		
		// 배열 복사 - (복사할 배열, 새로운 배열의 길이)
		int[] newArr = Arrays.copyOf(arr, arr.length);	
		System.out.println(Arrays.toString(newArr));
		System.out.println(arr == newArr);	// 깊은 복사 - 완전히 새로운 배열을 만든 것이기 때문에 다르다
		
		int[] newArr2 = Arrays.copyOf(arr, arr.length * 2);
		System.out.println(Arrays.toString(newArr2));
		
		// 배열 크기지정 복사
		int[] newArr3 = Arrays.copyOfRange(newArr, 1, 3);	// 이상 ~ 미만
		System.out.println(Arrays.toString(newArr3));
		
		// 배열의 원소비교
		if(Arrays.equals(newArr, arr)) {
			System.out.println("배열의 원소가 정확히 일치한다");
		}
		
	}

}
