package _05_이중for문;

import java.util.Scanner;

public class _0820_Q07 {

	public static void main(String[] args) {
		// 문제7
		// 키보드로 아이디를 입력받는다.
		// 입력받은 아이디에 특수문자가 포함 되었는지 확인한다. (유효성 검사)
		// 특수문자는 String sign="!@#$%^&*" 로 정의한다.
		// 특수문자가 몇 개 포함되었는지 출력하시오.
		String sign="!@#$%^&*";		// 특수문자 초기값
		
		Scanner scan = new Scanner(System.in);
		System.out.print("아이디 : ");
		int symbolCnt = 0;
		String text = scan.nextLine();
		for (int i=0; i<text.length(); i++) {
			for (int j=0; j<sign.length(); j++) {
				if (text.charAt(i) == sign.charAt(j)) {
//					System.out.println("특수문자 '" + sign.charAt(j) + "'이 존재합니다.");
					symbolCnt++;
				}
			}
			if (symbolCnt == 0 && i == (text.length()-1)) {
				System.out.println(text);
			}
		}
		System.out.println("특수문자가 " + symbolCnt + "개 존재합니다.");
		scan.close();
	}

}
