package _12_미션1002;

import java.util.Scanner;

public class CourseManager {
	// 입력을 위한 객체
	Scanner in = new Scanner(System.in);
	
	// 객체 초기화 작업
	StudentManager student = null;
	SubjectManager subject = null;
	
	// 생성자, 생략 가능
	CourseManager() {
		// 생성자 내에서 객체 초기화 처리
		// Main클래스, 프로그램이 실행될 때 객체 초기화 처리를 진행한다.
		if (student == null) {
			student = new StudentManager();
		}
		if (subject == null) {
			subject = new SubjectManager();
		}
		// 초기화 처리가 진행된 뒤 메뉴 메서드 실행
		menu();
	}
	
	// 메뉴 메서드
	private void menu() {
		while(true) {
			String selNum = null;
			System.out.println("◆ 수강신청 프로그램 ◆");
			System.out.println("0.프로그램 종료");
			System.out.println("1.학생관리");
			System.out.println("2.교과목관리");
			System.out.println("3.로그인");
			
			System.out.print("▷ 번호를 입력해주세요. : ");
			selNum = in.nextLine();
			
			if (selNum.equals("0")) {
				System.out.println("\n프로그램을 종료합니다.");
				break;
			} else if (selNum.equals("1")) {
				System.out.println("\n학생관리 메뉴로 넘어갑니다.");
				studentMenu();
			} else if (selNum.equals("2")) {
				System.out.println("\n교과목관리 메뉴로 넘어갑니다.");
				subjectMenu();
			} else if (selNum.equals("3")) {
				System.out.println("\n등록된 아이디로 로그인합니다.");
				
			} else {
				System.out.println("\n잘못된 입력입니다.");
				System.out.println("다시 입력해주세요.");
			}
		}
	}
	// 학생관리 메뉴 이동을 위한 메서드
	private void studentMenu() {
		student.menu();
	}
	// 교과목관리 메뉴 이동을 위한 메서드
	private void subjectMenu() {
		subject.menu();
	}

}
