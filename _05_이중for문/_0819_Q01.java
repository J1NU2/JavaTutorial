package _05_이중for문;

public class _0819_Q01 {

	public static void main(String[] args) {
		// 문제1
		// 다음과 같이 출력하시오.
		/*
		 * 1*1=1  1*2=2  1*3=3
		 * 2*1=2  2*2=4  2*3=6
		 * 3*1=3  3*2=6  3*3=9
		 * 4*1=4  4*2=8  4*3=12
		 */
		for (int i=1; i<=4; i++) {		// i는 단
			for (int j=1; j<=3; j++) {	// j는 수
				System.out.print(i + "*" + j + "=" + (i*j) + " ");
			}
			System.out.println();
		}
	}

}
