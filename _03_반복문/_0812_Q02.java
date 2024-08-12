package _03_반복문;

public class _0812_Q02 {

	public static void main(String[] args) {
		// 문제2
		// 범인을 찾으시오.
		// 범인은 짝수이면서 가장 큰 값이다.
		int[] letter = {8,12,4,13,2,14,4,5};	// 초기값
		
		int criminal = 0;						// 범인인 숫자를 저장할 변수
		for (int i=0; i<letter.length; i++) {	// 0부터 letter 배열의 최대 길이까지 반복
			// letter[i]의 값이 짝수이면서, letter[i]의 값이 범인인 숫자보다 클 경우의 조건
			if ((letter[i]%2) == 0 && letter[i] > criminal) {
				criminal = letter[i];			// criminal에 letter[i]의 값을 저장
			}									// > 최대값만을 저장하게 되므로 범인은 letter 배열의 가장 큰 값으로 고정된다.
		}
		System.out.println("범인 : " + criminal);
	}

}
