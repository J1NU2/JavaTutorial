package _03_반복문;

public class _0809_Q10 {

	public static void main(String[] args) {
		// 문제10 : 심화문제
		// 범인 숫자 구하기
		// 범인은 100부터 999까지 숫자 중에서 여러명이 있다.
		// 범인의 특징은 숫자의 각 자릿수를 더한 값이 짝수인 숫자가 범인이다.
		// 범인을 찾으시오.
		System.out.print("----- 범인 목록 -----");
		for (int i=100; i<=999; i++) {
			if ((((i/100) + ((i/10)%10) + (i%10))%2) == 0) {
				System.out.print(i + " ");
			}
			if ((i%50) == 0) {
				System.out.print("\n");
			}
		}
	}

}
