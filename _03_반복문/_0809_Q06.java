package _03_반복문;

public class _0809_Q06 {

	public static void main(String[] args) {
		// 문제6
		// 배열의 값을 모두 더한 총합을 구하시오.
		int[] arr = {45,23,25,64,3,24,48};	// 초기값
		int sum = 0;						// 배열의 총합을 저장할 변수
		for (int i=0; i<arr.length; i++) {	// 0부터 arr배열의 길이까지 반복
			sum += arr[i];					// arr[i]의 값을 저장
		}
		System.out.println("배열의 총합 : " + sum);
	}

}
