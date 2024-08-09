package _03_반복문;

public class _0809_Q09 {

	public static void main(String[] args) {
		// 문제9 : 심화문제
		// 배열에서 가장 큰 값과 가장 큰 값이 있는 인덱스를 출력하시오.
		int[] arr = {45,23,25,64,3,24,48};	// 초기값
		int maxNumber = 0, maxIndex = 0;	// 큰 값과 큰 값이 있는 인덱스를 저장할 변수
		for (int i=0; i<arr.length; i++) {	// 0부터 arr배열의 길이까지 반복
			if (maxNumber < arr[i]) {		// 저장된 큰 값(maxNumber)이 arr[i]의 값보다 작을 경우의 조건
				maxNumber = arr[i];			// maxNumber에 현재의 값 저장
				maxIndex = i;				// maxIndex에 현재의 값이 있는 번호(index)를 저장
			}
		}
		System.out.println("가장 큰 값 : " + maxNumber + ", 해당 값의 인덱스 : " + maxIndex);
	}

}
