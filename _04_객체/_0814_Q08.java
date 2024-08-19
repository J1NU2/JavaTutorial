package _04_객체;

import java.util.Scanner;

public class _0814_Q08 {

	public static void main(String[] args) {
		// 문제8
		// 배열 저장 변수
		/*
		 * int[] lotto = new int[6];
		 * // 키보드로 부터 입력받기 위한 객체 만들기.
		 * Scanner in = new Scanner(System.in); // ctrl shift o
		 * // 0번째 번호부터 로또 번호 입력받기
		 * for (int i = 0; i < lotto.length; i++) {
		 * 		System.out.println((i + 1) + "번 입력하세요");
		 * 		int k = in.nextInt();  // nextInt는 키보드로 숫자만 가져온다.
		 * 		in.nextLine();  // 버퍼 지우기
		 * 		lotto[i] = k;
		 * }
		 * // 로또 번호를 출력하는 반복문
		 * for (int i = 0; i < lotto.length; i++) {
		 * 		if (i == lotto.length - 1) { // 마지막 번호
		 * 			System.out.println("보너스 : " + lotto[i]);
		 * 		} else {
		 * 			System.out.println(lotto[i]);
		 * 		}
		 * }
		 */
		// 해당 코드에서 1~45숫자를 벗어난 숫자를 입력하면
		// 범위 오류라고 출력하고 다시 번호를 입력할 수 있도록 수정하세요.
		int[] lotto = new int[6];
		Scanner in = new Scanner(System.in);
		for (int i=0; i<lotto.length; i++) {
			System.out.print((i+1) + "번 로또 번호 : ");
			int k = in.nextInt();
			in.nextLine();
			// 1~45숫자를 벗어난 경우의 추가 부분
			if (k <= 0 || k > 45) {		// 입력받은 숫자(k)가 0이하거나 46이상일 경우의 조건
				System.out.println("입력한 번호는 로또 번호가 아닙니다, 다시 입력해주세요.");
				// 반복문이 끝날 때 i값이 증가되므로 현재 값을 고정하기 위해 i-1을 저장
				// ex) i=2라면, 2-1+1=2로 만들어주는 형태
				i -= 1;
				continue;			// 반복문을 여기까지 실행한 뒤 반복문의 처음부터 실행
			}	// 여기까지 실행하고 반복문 이어서 다시 실행
			lotto[i] = k;
		}
		for (int i=0; i<lotto.length; i++) {
			if (i == (lotto.length - 1)) {
				System.out.print("보너스(" + lotto[i] + ")");
			} else {
				System.out.print(lotto[i] + " ");
			}
		}
		in.close();
	}

}
