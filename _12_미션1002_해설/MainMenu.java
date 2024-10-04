package _12_미션1002_해설;

import java.util.Scanner;

public class MainMenu {
	// 객체 초기화
	private StudentManager stuMag = null;
	private PartManager partMag = null;
	
	// 로그인 정보 객체 주소
	private Student loginStu = null;
	
	// 생성자
	MainMenu() {
		init();
		Scanner in = new Scanner(System.in);
		while (true) {
			menu();
			System.out.println("메뉴선택");
			int selNum = in.nextInt();
			in.nextLine();
			
			if (selNum == 1) {
				goStuMag();
			} else if (selNum == 2) {
				goPartMag();
			} else if (selNum == 3) {
				loginProcess();
			} else {
				break;
			}
		}
	}
	
	private void init() {
		if (stuMag == null) {
			stuMag = new StudentManager();
		}
		if (partMag == null) {
			partMag = new PartManager();
		}
	}
	private void goStuMag() {
		// 학생관리 하는 객체의 메뉴를 호출
		// 이때, 주의 할 점 : 객체를 새로 만들지 말고 기존에 생성된 객체의 주소를 참조하여 메뉴를 호출해야한다.
		// new StudentManager(); 로 새롭게 객체를 만드는 것이 아니다.
		stuMag.menu();
	}

	private void goPartMag() {
		partMag.menu();
	}

	private void loginProcess() {
		Scanner in = new Scanner(System.in);
		System.out.println("로그인하세요.");
		System.out.println("ID 입력");
		String id = in.nextLine();
		
		loginStu = stuMag.loginID(id);
		if (loginStu == null) {
			System.out.println("아이디 없음");
		} else {
			System.out.println("로그인 성공, 메뉴 이동");
			loginStu.menu(partMag);
		}
	}

	
	// 관리들에 대한 메뉴 선택을 위한 메서드
	private void menu() {
		System.out.println("1.학생관리");
		System.out.println("2.교과목관리");
		System.out.println("3.로그인");
	}
}
