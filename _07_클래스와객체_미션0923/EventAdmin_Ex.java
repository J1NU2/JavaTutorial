package _07_클래스와객체_미션0923;

import java.util.ArrayList;
import java.util.Scanner;

// 이벤트관리 클래스
public class EventAdmin_Ex {
	// 의존관계 설정
	// 중요한 것은 EventOne_Ex 객체를 만든 것이 아니다.
	// EventOne_Ex 객체의 주소값을 저장할 배열(길이 5)를 생성한 것이다.
	// 하지만 배열도 객체이다.
	// eList는 참조변수이고 EventOne_Ex객체의 주소를 저장한 배열의 주소를 저장하고 있다.
//	EventOne_Ex[] eList = new EventOne_Ex[5];
	ArrayList<EventOne_Ex> eList = new ArrayList<>();	// 배열을 리스트로 변경

	EventAdmin_Ex() {
		// menu();
	}

	public void menu() {
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.println("0.이전메뉴");
			System.out.println("1.이벤트등록");
			System.out.println("2.전체보기");
			System.out.print("번호 입력 > ");
			int num = in.nextInt();
			in.nextLine();
			if (num == 1) {
				addEvent();
			} else if (num == 2) {
				allListEvent();
			} else if (num == 0) {
				break;		// 프로그램 종료
			}
		}
	}
	
	private void addEvent() {
		Scanner in = new Scanner(System.in);
		EventOne_Ex temp = new EventOne_Ex();
		System.out.println("제목을 입력하세요.");
		String title = in.nextLine();
		temp.title = title;
		System.out.println("내용을 입력하세요.");
		String memo = in.nextLine();
		temp.memo = memo;
		
		eList.add(temp);
		
		/* 배열일 때 코드
		for (int i=0; i<eList.length; i++) {
			if (eList[i] == null) {
				eList[i] = temp;
				break;
			}
		}
		*/
		temp = null;	// temp에 저장된 주소값을 사용 후 null 처리
		// in.close();		// Scanner에 필요한 자원 반납
	}
	
	private void allListEvent() {
		for (int i=0; i<eList.size(); i++) {
			eList.get(i).prt();
		}
		
		/* 배열일 때 코드
		for (int i=0; i<eList.length; i++) {
			if (eList[i] != null) {
				eList[i].prt();
			}
		}
		*/
	}
}
