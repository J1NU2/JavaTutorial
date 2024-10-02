package _12_미션1002;

import java.util.ArrayList;
import java.util.Scanner;

public class SubjectManager {
	// 리스트 생성
	ArrayList<SubjectOne> subList = new ArrayList<>();

	// 입력을 위한 객체
	Scanner in = new Scanner(System.in);
	
	// 생성자, 생략가능
	SubjectManager() {}
	
	// 메뉴 메서드
	public void menu() {
		while(true) {
			String selNum = null;
			System.out.println("\n◇ 교과목관리 메뉴 ◇");
			System.out.println("0.이전 메뉴로 나가기");
			System.out.println("1.교과목 등록하기");
			System.out.println("2.교과목 전체보기");
			
			System.out.print("▷ 번호를 입력해주세요. : ");
			selNum = in.nextLine();
			
			if (selNum.equals("0")) {
				System.out.println("\n이전메뉴로 돌아갑니다.");
				break;
			} else if (selNum.equals("1")) {
				System.out.println("\n새로운 교과 정보를 등록합니다.");
				subAdd();
			} else if (selNum.equals("2")) {
				System.out.println("\n등록된 교과목을 조회합니다.");
				subAllList();
			} else {
				System.out.println("\n잘못된 입력입니다.");
				System.out.println("다시 입력해주세요.");
			}
		}
	}
	// 교과목 등록을 위한 메서드
	private void subAdd() {
		SubjectOne sub = new SubjectOne();
		
		System.out.println("\n▷ 과목명을 입력해주세요.");
		System.out.print("▷ 과목명 : ");
		String name = in.nextLine();
		
		if (subjectCheckName(name)) {
			System.out.println("\n중복된 과목명이 존재합니다.");
		} else {
			System.out.println("\n▷ 강의실을 입력해주세요.");
			System.out.print("▷ 강의실명 : ");
			String classroom = in.nextLine();
			
			System.out.println("\n▷ 담당교수님의 이름을 입력해주세요.");
			System.out.print("▷ 담당교수 : ");
			String professor = in.nextLine();
			
			sub.setSubject(name, classroom, professor);
			subList.add(sub);
		}
	}
	// 과목명 중복 방지를 위한 메서드
	private boolean subjectCheckName(String name) {
		for (int i=0; i<subList.size(); i++) {
			if (subList.get(i).getName().equals(name)) {
				return true;
			}
		}
		return false;
	}
	// 교과목 전체보기를 위한 메서드
	private void subAllList() {
		System.out.println("--------------- 교과목 리스트 ---------------");
		for (int i=0; i<subList.size(); i++) {
			subList.get(i).subOne();
		}
		System.out.println("-----------------------------------------");
	}
}
