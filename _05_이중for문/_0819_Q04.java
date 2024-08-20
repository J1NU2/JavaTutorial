package _05_이중for문;

public class _0819_Q04 {

	public static void main(String[] args) {
		// 문제4
		// 다음과 같이 출력하시오.
		/*
		 * *******
		 * 0*****
		 * 00***
		 * 000*
		 */
		int starCnt = 0;	// 별의 갯수를 저장할 변수
		for (int i=0; i<4; i++) {	// i는 줄
			for (int zero=0; zero<i; zero++) {			// 숫자(0)을 출력할 반복문
				System.out.print("0");
			}
			for (int star=6; star>=i+starCnt; star--) {	// 별(*)을 출력할 반복문
				System.out.print("*");
				if (star == (i+starCnt)) {		// 현재 star의 값이 i+starCnt의 값과 똑같아지면
					starCnt++;					// starCnt의 값을 증가시키고 반복문 종료
					break;
				}
			}
			System.out.println();
		}
		
		System.out.println();
		// 7	*******
		// 6	0*****		0
		// 5	00***		01
		// 4	000*		012
		
		// i0 j7 6 5 4 3 2 1
		// i1 j7 6 5 4 3 2
		// i2 j7 6 5 4 3
		// i3 j7 6 5 4
		
		// 리팩토링 : for문 갯수 줄이기
		for (int i=0; i<4; i++) {			// i는 열(세로)
			for (int j=7; j>i; j--) {		// j는 행(가로)
				if (j > 7-i) {				// j의 값이 7-i의 값보다 클 경우 숫자(0) / 작거나 같을 경우 별(*) 출력
					System.out.print("0");					
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
