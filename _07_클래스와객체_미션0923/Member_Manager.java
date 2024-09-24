package _07_클래스와객체_미션0923;

import java.util.Scanner;

public class Member_Manager {
	// 고객에 대한 정보가 담긴 주소를 저장할 객체 생성
	Member_One[] mList = new Member_One[10];
	
	int mListLeng = mList.length;
	
	// 입력을 위한 객체
	Scanner in = new Scanner(System.in);
	
	Member_Manager() {
		// menu();
	}
	// 기능에 대한 메뉴를 보여줄 메서드
	public void menu() {
		while (true) {
			System.out.println("\n▷ 고객관리 메뉴(Menu) ◁");
			System.out.println("0.프로그램 종료");
			System.out.println("1.가입하기");
			System.out.println("2.정보보기");
			System.out.println("3.수정하기");
			System.out.println("4.삭제하기");
			
			String selNum = "";
			System.out.println("\n▷ 메뉴를 선택해주세요.");
			System.out.print("▷ 선택할 번호 : ");
			selNum = in.nextLine();
			
			if (selNum.equals("0")) {
				System.out.println("\n프로그램을 종료합니다.");
				System.out.println("메인 화면으로 돌아갑니다.");
				break;
			} else if (selNum.equals("1")) {
				System.out.println("\n고객님의 가입을 진행합니다.");
				add();
			} else if (selNum.equals("2")) {
				System.out.println("\n모든 고객의 정보를 출력합니다.");
				memberList();
			} else if (selNum.equals("3")) {
				System.out.println("\n고객님의 정보를 수정합니다.");
				mod();
			} else if (selNum.equals("4")) {
				System.out.println("\n고객님의 탈퇴를 진행합니다.");
				del();
			} else {
				System.out.println("\n올바른 선택이 아닙니다.");
				System.out.println("다시 입력해주세요.");
			}
		}
	}
	// 고객 가입에 대한 기능을 수행할 메서드
	private void add() {
		Member_One member = new Member_One();
		
		System.out.println("\n아이디를 입력해주세요.");
		System.out.print("아이디 : ");
		member.mId = in.nextLine();
		System.out.println("\n이름을 입력해주세요.");
		System.out.print("이름 : ");
		member.mName = in.nextLine();
		
		for (int i=0; i<mListLeng; i++) {
			if (mList[i] == null) {
				System.out.println("\n기입된 정보로 가입되었습니다.");
				mList[i] = member;
				break;
			}
		}
	}
	// 가입된 고객의 정보를 보여주는 기능을 수행할 메서드
	private void memberList() {
		for (int i=0; i<mListLeng; i++) {
			if (mList[i] != null) {
				mList[i].memberList();
			}
		}
	}
	// 고객 정보를 수정하는 기능을 수행할 메서드
	private void mod() {
		System.out.println("\n아이디를 입력해주세요.");
		System.out.print("아이디 : ");
		String checkId = in.nextLine();
		System.out.println("\n이름을 입력해주세요.");
		System.out.print("이름 : ");
		String checkName = in.nextLine();
		
		for (int i=0; i<mListLeng; i++) {
			if (mList[i] != null) {
				String[] member = mList[i].getMember();
				if (member[0].equals(checkId) && member[1].equals(checkName)) {
					System.out.println("\n수정할 이름을 입력해주세요.");
					System.out.print("(현재 이름) " + checkName + " => ");
					String modName = in.nextLine();
					mList[i].setmName(modName);
					System.out.println("\n변경되었습니다.");
				}
			}
		}
	}
	// 고객 정보를 삭제하는 기능을 수행할 메서드
	private void del() {
		System.out.println("\n아이디를 입력해주세요.");
		System.out.print("아이디 : ");
		String checkId = in.nextLine();
		System.out.println("\n이름을 입력해주세요.");
		System.out.print("이름 : ");
		String checkName = in.nextLine();
		
		for (int i=0; i<mListLeng; i++) {
			if (mList[i] != null) {
				String[] member = mList[i].getMember();
				if (member[0].equals(checkId) && member[1].equals(checkName)) {
					System.out.println("\n해당 고객의 정보가 삭제되었습니다.");
					mList[i].memberList();
					mList[i] = null;
				}
			}
		}
	}
	
}
