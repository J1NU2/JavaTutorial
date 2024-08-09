package _03_반복문;

public class _0809_Q07 {

	public static void main(String[] args) {
		// 문제7
		// 짝수는 모두 몇개인가?
		int[] arr = {45,23,25,64,3,24,48};	// 초기값
		int cnt = 0;						// 갯수를 저장할 변수
		for (int i=0; i<arr.length; i++) {	// 0부터 arr배열의 길이까지 반복
			if ((arr[i]%2) == 0) {			// arr[i]의 값이 짝수일 경우의 조건
				cnt++;						// 조건에 맞는 카운트 증가 (=짝수일 경우+1)
			}
		}
		System.out.println("짝수의 갯수 : " + cnt);
	}

}
