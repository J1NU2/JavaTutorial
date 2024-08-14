package _04_객체;

import java.util.Random;

public class _0814_Q02 {

	public static void main(String[] args) {
		// 문제2
		// 행운의 숫자인지를 판별해보자
		// 1부터 100까지 숫자 중 랜덤 수를 하나 뽑아서 출력한다.
		// 이 숫자가 7의 배수이면 행운의 숫자, 7의 배수가 아니면 조심해야하는 숫자입니다.
		Random ran = new Random();				// Random 객체 생성
		
		int ranNum = ran.nextInt(100) + 1;		// 0~99 +1
		
		if ((ranNum % 7) == 0) {				// 랜덤한 숫자가 7의 배수일 경우의 조건
			System.out.println(ranNum + ", 행운의 숫자입니다.");
		} else {
			System.out.println(ranNum + ", 조심해야하는 숫자입니다.");
		}
	}

}
