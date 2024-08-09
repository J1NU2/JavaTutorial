package _03_반복문;

public class _0809_Q02 {

	public static void main(String[] args) {
		// 문제2
		// 1부터 100까지 숫자 중에서 홀수의 총합을 구하시오.
		int sum = 0;				// 총합을 저장할 변수 선언
		for (int i=0; i<100; i++) {	// 0부터 99까지 반복
			if (((i+1)%2) != 0) {	// i+1이 홀수일 경우의 조건 : 반복문이 0부터 시작하므로, 1~100까지 구하기 위해 i+1 사용
				sum += (i+1);		// 총합에 i+1값 추가
			}
		}
		System.out.println("1~100 숫자 중 홀수의 총합 : " + sum);
	}

}
