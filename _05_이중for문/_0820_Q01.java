package _05_이중for문;

public class _0820_Q01 {

	public static void main(String[] args) {
		// 문제1
		// a로 나누어 떨어지는 배열의 값을 모두 출력하시오.
		int[] arr = {3,45,26,50,74};	// 초기값
		int a = 5;						// 초기값
		
		for (int i=0; i<arr.length; i++) {
			if ((arr[i]%a) == 0) {
				System.out.println(arr[i]);
			}
		}
	}

}
