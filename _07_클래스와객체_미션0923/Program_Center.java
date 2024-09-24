package _07_클래스와객체_미션0923;

import java.util.Scanner;

public class Program_Center {
	// 객체 생성 후 객체에 대한 주소를 각 변수에 저장
	Member_Manager member = null;
	Event_Manager event = null;
	
	// 입력을 위한 객체
	Scanner in = new Scanner(System.in);
	
	Program_Center() {
		if (member == null) {
			member = new Member_Manager();
		}
		if (event == null) {
			event = new Event_Manager();
		}
		menu();
	}
	// 기능에 대한 메뉴를 보여줄 메서드
	public void menu() {
		while (true) {
			System.out.println("\n▷ 메뉴(Menu) ◁");
			System.out.println("0.프로그램 종료");
			System.out.println("1.고객관리 프로그램");
			System.out.println("2.이벤트관리 프로그램");
			
			String selNum = "";
			System.out.println("\n▷ 메뉴를 선택해주세요.");
			System.out.print("▷ 선택할 번호 : ");
			selNum = in.nextLine();
			
			if (selNum.equals("0")) {
				System.out.println("\n프로그램을 종료합니다.");
				System.out.println("이용해주셔서 감사합니다.");
				break;
			} else if (selNum.equals("1")) {
				System.out.println("\n고객관리 프로그램을 실행합니다.");
				member.menu();
			} else if (selNum.equals("2")) {
				System.out.println("\n이벤트관리 프로그램을 실행합니다.");
				event.menu();
			} else {
				System.out.println("\n올바른 선택이 아닙니다.");
				System.out.println("다시 입력해주세요.");
			}
		}
	}
}
