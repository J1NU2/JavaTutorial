package _07_클래스와객체_미션0920;

import java.util.Scanner;

public class T_Center_Ex {
	// T_One을 의존하기 때문에 변수가 필요하다.
	
	// 기차 여러대를 등록하고, 보고, 수정하는 역할
	// 기차 여러대를 관리하기 위해서 배열이라는 자료형을 선택
	T_Manager_Ex tInfo = new T_Manager_Ex();
	T_One_Ex[] tList = new T_One_Ex[5];
	
	// 생성자는 없는게 아니라 기본이 생략이 된 상태
	public T_Center_Ex() {		// 생략이 된 상태
		Scanner in = new Scanner(System.in);
		
		while (true) {
			System.out.println("1. 등록");
			System.out.println("2. 수정");
			System.out.println("3. 전체보기");
			System.out.println("4. 종료");
			System.out.println("메뉴선택 > ");
			int selNum = in.nextInt();
			in.nextLine();
			
			if (selNum == 1) {
				add();
			} else if (selNum == 2) {
				mod();
			} else if (selNum == 3) {
				listAll();
			} else if (selNum == 4) {
				break;
			}
		}
		
	}

	private void add() {
		// 기차 시간을 추가
		// T_One 객체를 생성하고 기차번호와 기차시간을 입력
		Scanner in = new Scanner(System.in);
		T_One_Ex tTemp = new T_One_Ex();
		System.out.println("기차 번호를 입력하세요.");
		tTemp.tNum = in.nextLine();
		System.out.println("기차 시간을 입력하세요.");
		tTemp.tTime = in.nextLine();
		// 배열의 빈칸에 저장, 빈칸은 배열의 값이 null
		for (int i=0; i<tList.length; i++) {
			if (tList[i] == null) {
				tList[i] = tTemp;
				break;
			}
		}
	}

	private void mod() {
		Scanner in = new Scanner(System.in);
		System.out.println("수정할 기차 번호 입력");
		String modNum = in.nextLine();
		
		// 객체지향적 언어로는 아래 코드로 짜는 것이 옳다.
		// 직접 접근하는 것을 막을 수 있다.
		for (int i=0; i<tList.length; i++) {
			String mNum = tList[i].gettNum();
			if (mNum.equals(modNum)) {
				System.out.println("수정 시간 입력");
				tList[i].tTime = in.nextLine();
				break;
			}
		}
		
		// 조건 : 기차 번호는 유니크하다.
		for (int i=0; i<tList.length; i++) {
			if (tList[i].tNum.equals(modNum)) {
				// 기차 번호가 유니크하다는 것은 배열 뒤에 있는 기차 번호랑 중복이 될 수 없다.
				// 그래서 바로 수정이 가능하도록 한다.
				System.out.println("수정 시간 입력");
				tList[i].tTime = in.nextLine();
				break;
			}
		}
	}

	private void listAll() {
		for (int i=0; i<tList.length; i++) {
			if (tList[i] != null) {
				tList[i].prt();
			}
		}
	}
	
}
