package _05_이중for문;

public class _0820_Q02 {

	public static void main(String[] args) {
		// 문제2
		// 배열의 평균값을 구하시오. 소수점으로 표현하시오.
		int[] arr = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 102};	// 초기값
		
		int sum = 0;
		for (int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum / (arr.length*1.0));
	}

}
