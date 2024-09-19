package _07_클래스와객체_예제;

import java.util.Scanner;

// 고양이 관리 단일 책임을 정의한 클래스
public class Cat_manager {
	// 클래스 내에 있는 변수 : 멤버변수
	// 클래스 내에서 선언한 이유, 클래스 내부 어느 곳에서든 참조가 가능하도록 하기 위해서
	Cat_Object[] catList = new Cat_Object[5];
	Scanner in = new Scanner(System.in);
	
	Cat_manager() {
		while (true) {
			System.out.println("생성자");
			System.out.println("고양이 관리자");
			System.out.println("1. 등록");
//			System.out.println("2. 수정");
//			System.out.println("3. 삭제");
			System.out.println("4. 전체보기");
			
			System.out.print("선택 : ");
			int selNum = in.nextInt();
			in.nextLine();
			System.out.println("\n" + selNum + "번을 선택하였습니다.");
			
			if (selNum == 1) {
				add();			// 메서드 호출
			} else if (selNum == 2) {
//				update();		// 메서드 호출
			} else if (selNum == 3) {
//				delete();		// 메서드 호출
			} else if (selNum == 4) {
				allList();		// 메서드 호출
			} else {
				break;
			}
		}
		in.close();
	}
	
	public void add() {		// 메서드 정의
		System.out.println("고양이 등록");
		// 해당 클래스 내부에 선언한 변수 : 지역변수
		// 클래스가 종료되면 아래 지역 변수들은 사라진다.
		Cat_Object cat = new Cat_Object();
		
		System.out.println("고양이 이름을 입력해주세요.");
		cat.name = in.nextLine();
		
		for (int i=0; i<catList.length; i++) {
			if (catList[i] == null) {
				catList[i] = cat;
				break;
			}
		}
	}
//	public void update() {	// 메서드 정의
//		System.out.println("고양이 수정");
//	}
//	public void delete() {	// 메서드 정의
//		System.out.println("고양이 삭제");
//	}
	public void allList() {	// 메서드 정의
		System.out.println("고양이 전체보기");
		
		for (int i=0; i<catList.length; i++) {
			if (catList[i] != null) {
				catList[i].catInfo();
			}
		}
	}
}
