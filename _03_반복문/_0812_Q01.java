package _03_반복문;

public class _0812_Q01 {

	public static void main(String[] args) {
		// 문제1
		// 배열에서 가장 큰 수가 있는 인덱스를 출력하시오.
		int[] letter = {8,12,4,13,2,14,4,5};	// 초기값
		
		int maxNumber = 0;						// 최대값을 저장할 변수
		for (int i=0; i<letter.length; i++) { 	// 0부터 letter 배열의 최대 길이까지 반복
			if (letter[i] > maxNumber) {		// 현재 letter[i]의 값이 최대값보다 클 경우의 조건
				maxNumber = letter[i];			// maxNumber에 현재 letter[i]의 값 저장
			}
		}
		System.out.println("배열 letter에서 가장 큰 수 : " + maxNumber);
	}

}
