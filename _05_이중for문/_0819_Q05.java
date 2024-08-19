package _05_이중for문;

public class _0819_Q05 {

	public static void main(String[] args) {
		// 문제5
		// 다음 배열에서 40보다 큰 수는 모두 몇개인가?
		int[] a = {34,55,23,56,34,45,34};	// 초기값
		
		int cnt = 0;
		for (int i=0; i<a.length; i++) {
			if (a[i] > 40) {
				cnt++;
			}
		}
		System.out.println("40보다 큰 숫자는 " + cnt + "개 있습니다.");
	}

}
