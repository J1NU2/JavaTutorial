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
		int starCnt = 0;	// 별의 갯수를 저장할 변수
		for (int i=0; i<4; i++) {	// i는 줄
			for (int zero=3; zero>i; zero--) {			// 숫자(0)을 출력할 반복문
				System.out.print("0");
			}
			for (int star=0; star<=i+starCnt; star++) {	// 별(*)을 출력할 반복문
				System.out.print("*");
				if (star == (i+starCnt)) {		// 현재 star의 값이 i+starCnt의 값과 똑같아지면
					starCnt++;					// starCnt의 값을 증가시키고 반복문 종료
					break;
				}
			}
			System.out.println();
		}
		
		System.out.println();
		// 4	000*		012
		// 5	00***		01
		// 6	0*****		0
		// 7	*******
		
		// i0 j0 1 2 3
		// i1 j0 1 2 3 4
		// i2 j0 1 2 3 4 5
		// i3 j0 1 2 3 4 5 6
		
		// 리팩토링 : for문 갯수 줄이기
		for (int i=0; i<4; i++) {			// i는 열(세로)
			for (int j=0; j<4+i; j++) {		// j는 행(가로)
				if (j > 2-i) {				// j의 값이 2-i의 값보다 클 경우 별(*) / 작거나 같을 경우 숫자(0) 출력
					System.out.print("*");
				} else {
					System.out.print("0");					
				}
			}
			System.out.println();
		}
	}

}
