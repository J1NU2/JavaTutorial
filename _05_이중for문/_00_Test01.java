package _05_이중for문;

public class _00_Test01 {

	public static void main(String[] args) {
		// 시나리오1
		// 구구단 1단만 출력하시오.
		System.out.println("-------- 시나리오1 --------");
		for (int i=1; i<=9; i++) {
			System.out.println("1x" + i + "=" + (1*i));
		}
		
		// 시나리오2
		// 구구단 1단부터 9단까지 출력하시오.
		System.out.println("-------- 시나리오2 --------");
		for (int i=1; i<=9; i++) {
			System.out.println(i + "단");
			for (int j=1; j<=9; j++) {
				System.out.println(i + "x" + j + "=" + (i*j));
			}
		}
	}

}
