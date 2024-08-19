package _05_이중for문;

public class _0819_Q02 {

	public static void main(String[] args) {
		// 문제2
		// 다음과 같이 출력하시오.
		/*
		 * *****
		 * ****
		 * ***
		 * **
		 * *
		 */
		for (int i=0; i<5; i++) {
			for (int j=5; j>i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
