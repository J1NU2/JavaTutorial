package _04_객체;

import java.util.Scanner;

public class _01_Scanner {

	public static void main(String[] args) {
		// 6개의 로또번호를 수동으로 추출
		// 1부터 45까지를 키보드로 입력한다.
		// 이전에는 랜덤 기능이 필요해서 Random객체가 필요했지만
		// 지금은 키보드로 입력하기 위한 기능이 필요하므로 Scanner객체를 사용한다.
		
		int[] lotto = new int[6];					// 로또번호를 저장할 변수
		Scanner scan = new Scanner(System.in);		// 키보드로 입력받기 위한 객체 생성
		
		// lotto배열의 0~5인덱스까지 순회하는 반복문
		for (int i=0; i<lotto.length; i++) {
			System.out.println((i+1) + "번째 번호를 입력해주세요.");
			int scanLotto = scan.nextInt();		// 키보드로 입력받은 숫자만 가져온다.
			scan.nextLine();					// 버퍼 지우기
			lotto[i] = scanLotto;				// 입력받은 값을 lotto배열의 i번째 인덱스에 저장한다.
		}
		
		System.out.print("수동 로또 번호 : ");
		
		// 입력받은 lotto배열의 값을 출력하는 반복문
		for (int i=0; i<lotto.length; i++) {
			if (i == (lotto.length - 1)) {
				System.out.println("+" + lotto[i]);
			} else {
				System.out.print(lotto[i] + " ");
			}
		}
		scan.close();
	}

}
