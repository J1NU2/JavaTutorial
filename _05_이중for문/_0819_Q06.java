package _05_이중for문;

public class _0819_Q06 {

	public static void main(String[] args) {
		// 문제6
		// b배열의 값보다 큰 값이 a배열의 값에 모두 몇개가 있는지 카운팅하시오.
		// 출력 형태
		// a배열의 값에는 36번호보다 큰 숫자가 ??개 있습니다.
		// a배열의 값에는 49번호보다 큰 숫자가 ??개 있습니다.
		int[] a = {34,55,23,56,34,45,34};	// 초기값
		int[] b = {36,49};					// 초기값
		
		int cnt = 0;
		for (int i=0; i<b.length; i++) {
			for (int j=0; j<a.length; j++) {
				if (a[j] > b[i]) {
					cnt++;
				}
			}
			System.out.println("a배열의 값에는 " + b[i] + "번호보다 큰 숫자가 " + cnt + "개 있습니다.");
			cnt = 0;
		}
	}

}
