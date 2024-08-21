package _05_이중for문;

import java.util.Scanner;

public class _0820_Q06 {

	public static void main(String[] args) {
		// 문제6
		// 키보드로 아이디를 입력받는다.
		// 입력받은 아이디에 특수문자가 포함 되었는지 확인한다. (유효성 검사)
		// 특수문자는 '@' 한개로 정의한다.
		// 특수문자가 몇 개 포함되었는지 출력하시오.
		char symbol = '@';		// 초기값
		
		Scanner scan = new Scanner(System.in);	// 키보드로 입력받기 위한 객체 생성
		System.out.print("아이디 : ");
		int symbolCnt = 0;						// 문자가 있을 경우 카운트하기 위한 변수
		String text = scan.nextLine();			// 입력받은 문자열을 저장할 text변수
		for (int i=0; i<text.length(); i++) {	// 0부터 text문자열의 인덱스까지 반복
			if (text.charAt(i) == symbol) {		// text문자열의 i번째 인덱스의 문자에 '@'가 있는 경우의 조건
//				System.out.println("특수문자 '" + symbol + "'이 존재합니다.");
				symbolCnt++;					// 카운트 증가(symbolCnt++)
			// text문자열에 '@'가 존재하지 않고, i의 값이 text문자열의 마지막 인덱스 위치와 같을 경우
			} else if (text.charAt(i) != symbol && i == (text.length()-1)) {
				System.out.println(text);
			}
		}
		System.out.println("특수문자가 " + symbolCnt + "개 존재합니다.");
		scan.close();
	}

}
