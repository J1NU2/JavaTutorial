package _04_객체;

import java.util.Random;

public class _0814_Q03 {

	public static void main(String[] args) {
		// 문제3
		// 문제2 업그레이드, 랜덤 수를 하나 뽑아서 출력한다.
		// 랜덤 수가 7의 배수이면 행운의 숫자, 7의 배수가 아니면 행운의 숫자가 나올 때까지 계속 뽑는다.
		Random ran = new Random();	// Random 객체 생성
		
		int cnt = 1;				// 시도 횟수를 저장할 변수
		
		for (; true;) {				// 조건이 true일 경우 실행(무한루프=for문 내에서 멈추도록 할 것!)
			int ranNum = ran.nextInt(100) + 1;	// 0~99 +1
			if ((ranNum % 7) == 0) {			// 랜덤한 숫자가 7의 배수일 경우의 조건
				System.out.println(ranNum + ", 행운의 숫자입니다.");
				break;							// 조건을 만족하면 반복문을 종료(break)
			} else {
				cnt++;				// 7의 배수가 아닐 경우 시도 횟수(cnt)를 증가 (+1)
			}
		}
		System.out.println(cnt + "번 시도했습니다.");
	}

}
