package _05_이중for문;

public class _0819_Q12 {

	public static void main(String[] args) {
		// 문제12
		// 다음과 같이 출력하시오.
		/*
		 * 000*
		 * 00***
		 * 0*****
		 * *******
		 * 0*****
		 * 00***
		 * 000*
		 */
		// 단, for문 2개만 사용하여 출력하시오. (if문의 수는 상관없음)
		int zeroCnt = -1;			// 0을 출력하기 위한 zeroCnt변수
		for (int i=0; i<7; i++) {	// 열(세로)
			if (i < 4) {	// i가 4보다 작을 경우의 조건 (0 1 2 3)
				zeroCnt++;	// zeroCnt증가 (zeroCnt++)
			} else {		// i가 4보다 크거나 같을 경우의 조건 (4 5 6)
				zeroCnt--;	// zeroCnt감소 (zeroCnt--)
			}
			for (int j=0; j<4+zeroCnt; j++) {	// 행(가로)
				if (j > 2-zeroCnt) {			// j가 2-zeroCnt보다 클 경우 *을 출력
					System.out.print("*");
				} else {						// j가 2-zeroCnt보다 작을 경우 0을 출력
					System.out.print("0");
				}
			}
			System.out.println();
		}
	}

}
