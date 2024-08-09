package _03_반복문;

public class _0809_Q04 {

	public static void main(String[] args) {
		// 문제4
		// 배열에서 배열의 값이 짝수인 것만 출력하시오.
		int[] arr = {45,23,25,64,3,24,48};	// 초기값
		for (int i=0; i<arr.length; i++) {	// 0부터 arr배열의 길이까지 반복
			if ((arr[i]%2) == 0) {			// arr[i]의 값이 짝수일 경우의 조건
				System.out.print(arr[i] + " ");
			}
		}
	}

}
