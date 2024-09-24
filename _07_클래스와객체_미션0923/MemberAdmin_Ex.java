package _07_클래스와객체_미션0923;

import java.util.Scanner;

// 고객관리 클래스
public class MemberAdmin_Ex {
	// 의존관계 설정
	// 중요한 것은 MemberOne_Ex 객체를 만든 것이 아니다.
	// MemberOne_Ex 객체의 주소값을 저장할 배열(길이 5)를 생성한 것이다.
	// 하지만 배열도 객체이다.
	// mList는 참조변수이고 MemberOne_Ex객체의 주소를 저장한 배열의 주소를 저장하고 있다.
	MemberOne_Ex[] mList = new MemberOne_Ex[5];

	MemberAdmin_Ex() {
		// menu();
	}
	
	public void menu() {
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.println("0.이전메뉴");
			System.out.println("1.고객등록");
			System.out.println("2.전체보기");
			System.out.print("번호 입력 > ");
			int num = in.nextInt();
			in.nextLine();
			if (num == 1) {
				addUser();
			} else if (num == 2) {
				allListUser();
			} else if (num == 0) {
				break;		// 프로그램 종료
			}
		}
	}
	
	public boolean duplexIDcheck(String id) {
		for (int i=0; i<mList.length; i++) {
			if (mList[i] != null) {
				if (mList[i].id.equals(id)) {
					// return이 된다면 함수가 종료되고 호출부로 이동한다.
					// break를 사용할 필요가 없다.
					return true;
				}
			}
		}
		return false;
	}

	private void addUser() {
		Scanner in = new Scanner(System.in);
		MemberOne_Ex temp = new MemberOne_Ex();
		System.out.println("아이디를 입력하세요.");
		String id = in.nextLine();
		if (duplexIDcheck(id)) {
			System.out.println("중복된 아이디가 있습니다.");
		} else {
			temp.id = id;
			System.out.println("이름을 입력하세요.");
			String name = in.nextLine();
			temp.name = name;
			
			for (int i=0; i<mList.length; i++) {
				if (mList[i] == null) {
					mList[i] = temp;
					break;
				}
			}
			temp = null;	// temp에 저장된 주소값을 사용 후 null 처리
			// in.close();		// Scanner에 필요한 자원 반납
		}
	}
	
	private void allListUser() {
		for (int i=0; i<mList.length; i++) {
			if (mList[i] != null) {
				mList[i].prt();
			}
		}
	}

}
