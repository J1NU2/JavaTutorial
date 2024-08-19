package _05_이중for문;

public class _0819_Q03 {

	public static void main(String[] args) {
		// 문제3
		// 다음과 같이 출력하시오.
		/*
		 * 000*
		 * 00***
		 * 0*****
		 * *******
		 */
		int starCnt = 0;
		for (int i=0; i<4; i++) {
			for (int zero=3; zero>i; zero--) {
				System.out.print("0");
			}
			for (int star=0; star<=i+starCnt; star++) {
				System.out.print("*");
				if (star == (i+starCnt)) {
					starCnt++;
					break;
				}
			}
			System.out.println();
		}
	}

}
