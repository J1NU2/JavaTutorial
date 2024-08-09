package _03_반복문;

public class _0809_Q01 {

	public static void main(String[] args) {
		// 문제1
		// 100부터 999까지의 숫자 중에서 홀수만 출력하시오.
		for (int i=100; i<=999; i++) {		// 100부터 999까지 반복
			if ((i%2) != 0) {				// i가 홀수일 경우의 조건
				System.out.print(i + " ");
			}
		}
	}

}
