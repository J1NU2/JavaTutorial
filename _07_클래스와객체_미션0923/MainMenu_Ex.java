package _07_클래스와객체_미션0923;

import java.util.Scanner;

// 메인메뉴 클래스
public class MainMenu_Ex {
	// 의존관계 설정
	// 의존관계 설정 전에 우선 변수만 설정한다.
	MemberAdmin_Ex memberAdm = null;
	EventAdmin_Ex eventAdm = null;
	// 이후 주소를 저장하는 방법은 두가지가 있는데
	// 1.직접 객체를 생성한다.
	// 2.주소를 주입받는다.
	// 해당 방법 중 하나를 선택해서 설정하도록 하자.
	// MemberAdmin_Ex memberAdm = new MemberAdmin_Ex();
	// EventAdmin_Ex eventAdm = new EventAdmin_Ex();
	
	MainMenu_Ex() {
		// 생성자는 초기화 작업할 때 많이 사용
		// 초기화 작업은 멤버변수의 값을 세팅하는 느낌
		// 예) 데이터베이스에서 값을 가져와서 초기값 결정
		// 메뉴는 초기화 작업이라고 보기 어렵다.
		// 별도로 메서드 처리
		
		// 생성자에서 객체 초기화 처리
		if (memberAdm == null) {
			memberAdm = new MemberAdmin_Ex();
		}
		if (eventAdm == null) {
			eventAdm = new EventAdmin_Ex();
		}
		menu();
	}
	
	public void menu() {
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.println("1.고객관리");
			System.out.println("2.이벤트관리");
			System.out.println("3.프로그램 종료");
			System.out.print("번호 입력 > ");
			int num = in.nextInt();
			in.nextLine();
			if (num == 1) {
				// memberAdm = new MemberAdmin_Ex();
				memberAdm.menu();
			} else if (num == 2) {
				// eventAdm = new EventAdmin_Ex();
				eventAdm.menu();
			} else if (num == 3) {
				break;		// 프로그램 종료
			}
		}
	}
}
