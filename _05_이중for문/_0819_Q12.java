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
		int zeroCnt = -1;
		for (int i=0; i<7; i++) {
			if (i < 4) {
				zeroCnt++;
			} else {
				zeroCnt--;
			}
			for (int j=0; j<4+zeroCnt; j++) {		
				if (j > 2-zeroCnt) {
					System.out.print("*");
				} else {
					System.out.print("0");
				}
			}
			System.out.println();
		}
	}

}
