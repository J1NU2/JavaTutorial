package _04_객체;

import java.util.Random;

public class _0814_Q04 {

	public static void main(String[] args) {
		// 문제4
		// 숫자 10개를 저장할 수 있는 배열을 만들고 0부터 99까지의 숫자 중 랜덤으로 10개를 뽑습니다.
		// 이중 짝수만 저장하고 홀수는 무시합니다. (다시 뽑지 않습니다.)
		// ex)
		// 0번째 번호가 98이라면 0번 인덱스에 저장
		// 1번째 번호가 97이라면 무시 1번 인덱스는 선언 시 초기값
		// 2번째 번호가 88이라면 2번 인덱스에 저장
		Random ran = new Random();		// Random 객체 생성
		
		int[] arr = new int[10];		// 숫자 10개를 저장할 배열 선언
		
		for (int i=0; i<arr.length; i++) {	// 0부터 arr배열의 길이-1까지 순회하는 반복문
			int ranNum = ran.nextInt(100);	// 0~99 중 랜덤한 값을 ranNum변수에 저장
			if ((ranNum % 2) == 0) {		// ranNum변수의 값이 짝수일 경우의 조건
				arr[i] = ranNum;			// arr배열의 i번째에 ranNum변수의 값을 저장
			} else {
				arr[i] = 0;					// 홀수라면 초기값 저장
			}
			System.out.print(arr[i] + " ");
		}
	}

}
