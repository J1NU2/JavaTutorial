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
		for (int i=0; i<5; i++) {		// i는 줄
			for (int j=5; j>i; j--) {	// j는 별(*)
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
