package _03_반복문;

public class _0812_Q00 {

	public static void main(String[] args) {
		// 문제0
		// 짝수만 출력하시오.
		int[] letter = {8,12,4,13,2,14,4,5};	// 초기값
		
		System.out.print("배열 letter에 포함된 짝수들 : ");
		for (int i=0; i<letter.length; i++) {	// 0부터 letter 배열의 최대 길이까지 반복
			if ((letter[i]%2) == 0) {			// letter[i]의 값이 짝수일 경우의 조건
				System.out.print(letter[i] + " ");
			}
		}
	}

}
