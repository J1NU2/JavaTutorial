package _07_클래스와객체_미션0923;

import java.util.Scanner;

public class Event_Manager {
	// 이벤트에 대한 정보가 담긴 주소를 저장할 객체 생성
	// 고객관리 메뉴에서 현재 진행중인 이벤트를 보기 위해서 static변수로 설정
	// 한 패키지 내 모든 클래스에서 사용이 가능하다.
	// 프로그램이 실행될 때 메모리에 할당되며, 프로그램이 종료되면 할당된 메모리도 사라진다.
	static Event_One[] eList = new Event_One[10];
	
	static int eListLeng = eList.length;
	
	// 입력을 위한 객체
	Scanner in = new Scanner(System.in);
	
	Event_Manager() {
		// menu();
	}
	
	// 기능에 대한 메뉴를 보여줄 메서드
	public void menu() {
		while (true) {
			System.out.println("\n▷ 이벤트관리 메뉴(Menu) ◁");
			System.out.println("0.이전 메뉴로 나가기");
			System.out.println("1.이벤트 등록하기");
			System.out.println("2.이벤트 전체보기");
			
			String selNum = "";
			System.out.println("\n▷ 메뉴를 선택해주세요.");
			System.out.print("▷ 선택할 번호 : ");
			selNum = in.nextLine();
			
			if (selNum.equals("0")) {
				System.out.println("\n프로그램을 종료합니다.");
				System.out.println("메인 화면으로 돌아갑니다.");
				break;
			} else if (selNum.equals("1")) {
				System.out.println("\n이벤트 등록을 진행합니다.");
				add();
			} else if (selNum.equals("2")) {
				System.out.println("\n모든 이벤트의 정보를 출력합니다.");
				eventList();
			} else {
				System.out.println("\n올바른 선택이 아닙니다.");
				System.out.println("다시 입력해주세요.");
			}
		}
	}
	// 이벤트 등록에 대한 기능을 수행할 메서드
	private void add() {
		Event_One event = new Event_One();
		
		System.out.println("\n제목을 입력해주세요.");
		System.out.print("제목 : ");
		event.eTitle = in.nextLine();
		System.out.println("\n내용을 입력해주세요.");
		System.out.print("내용 : ");
		event.eDetail = in.nextLine();
		
		for (int i=0; i<eListLeng; i++) {
			if (eList[i] == null) {
				System.out.println("\n이벤트가 등록되었습니다.");
				eList[i] = event;
				break;
			}
		}
	}
	// 등록된 이벤트의 정보를 보여주는 기능을 수행할 메서드
	public static void eventList() {
		for (int i=0; i<eListLeng; i++) {
			if (eList[i] != null) {
				eList[i].eventList();
			}
		}
	}
}
