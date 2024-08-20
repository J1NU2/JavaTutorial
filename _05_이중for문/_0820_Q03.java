package _05_이중for문;

public class _0820_Q03 {

	public static void main(String[] args) {
		// 문제3
		// 팩토리얼의 합 구하기 (이중for로 해결)
		// 1부터 10까지 숫자의 각 팩토리얼의 합을 구하시오.
		// ex)	4팩토리얼 = 1*2*3*4
		//		5팩토리얼 = 1*2*3*4*5
		
		// 10팩토리얼
		// 3,628,800
		
		// ver1
		int factorial = 5, factoSum = 0;
		for (int i=1; i>=factoSum;) {
			factoSum++;
			for (int j=1; j<=factorial; j++) {
				factoSum *= j;
			}
		}
		System.out.println(factorial + "! : " + factoSum + "\n");
		
		// ver2
		int fac = 10, facSum = 0;
		for (int i=1; i<=fac; i++) {
			facSum++;
			for (int j=1; j<=i; j++) {
				facSum *= j;
			}
			System.out.println(i + "! : " + facSum);
			facSum = 0;
		}
	}

}
