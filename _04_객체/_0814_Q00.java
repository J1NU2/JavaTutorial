package _04_객체;

import java.util.Scanner;

public class _0814_Q00 {

	public static void main(String[] args) {
		// 문제0
		// 키보드로 숫자 한 개를 입력 받아서 홀짝을 출력하는 프로그램을 작성하시오.
		Scanner scan = new Scanner(System.in);	// Scanner 객체 생성
		
		System.out.print("숫자를 입력해주세요 : ");
		int scanNum = scan.nextInt();			// 입력받은 정수형인 숫자를 저장하는 변수
		scan.nextLine();						// 버퍼 지우기
		
		if ((scanNum % 2) != 0) {				// 입력받은 값이 홀수일 경우의 조건
			System.out.println("홀수입니다.");
		} else {
			System.out.println("짝수입니다.");
		}
		
	}

}
