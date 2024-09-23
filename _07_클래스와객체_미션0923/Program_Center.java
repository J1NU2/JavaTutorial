package _07_클래스와객체_미션0923;

import java.util.Scanner;

public class Program_Center {
	Member_One[] mList = new Member_One[10];
	Event_One[] eList = new Event_One[10];
	
	// 입력을 위한 객체
	Scanner in = new Scanner(System.in);
	
	public Program_Center() {
		while (true) {
			menu();
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
				new Member_Manager();
			} else if (selNum.equals("2")) {
				System.out.println("\n이벤트관리 프로그램을 실행합니다.");
				new Event_Manager();
			} else {
				System.out.println("\n올바른 선택이 아닙니다.");
				System.out.println("다시 입력해주세요.");
			}
		}
	}
	// 기능에 대한 메뉴를 보여줄 메서드
	public void menu() {
		System.out.println("\n▷ 메뉴(Menu) ◁");
		System.out.println("0.프로그램 종료");
		System.out.println("1.고객관리 프로그램");
		System.out.println("2.이벤트관리 프로그램");
	}
}
