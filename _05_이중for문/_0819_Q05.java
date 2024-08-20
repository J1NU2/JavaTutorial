package _05_이중for문;

public class _0819_Q05 {

	public static void main(String[] args) {
		// 문제5
		// 다음 배열에서 40보다 큰 수는 모두 몇개인가?
		int[] a = {34,55,23,56,34,45,34};	// 초기값
		
		int cnt = 0;			// 갯수를 저장할 변수
		for (int i=0; i<a.length; i++) {	// a배열의 마지막 인덱스까지 반복
			if (a[i] > 40) {	// a배열의 i번째 값이 40보다 클 경우, 갯수 카운트를 증가(cnt++)
				cnt++;
			}
		}
		System.out.println("40보다 큰 숫자는 " + cnt + "개 있습니다.");
	}

}
