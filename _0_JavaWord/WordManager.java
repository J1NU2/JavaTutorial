package _0_JavaWord;

import java.util.ArrayList;
import java.util.Scanner;

// 단어를 등록, 조회, 삭제, 수정할 기능을 관리하는 클래스
public class WordManager {
	// 객체 생성
	ArrayList<Word> wList = new ArrayList<>();
	
	// 입력을 위한 객체 생성
	Scanner in = new Scanner(System.in);
	
	// 생성자, 생략해도 상관없다.
	WordManager() {
		menu();
	}
	
	// 기능에 대한 메뉴를 보여줄 메서드
	public void menu() {
		while (true) {
			String selNum = "";
			System.out.println("\n0.프로그램 종료");
			System.out.println("1.등록하기");
			System.out.println("2.조회하기");
			System.out.println("3.삭제하기");
			System.out.println("4.수정하기");
			
			System.out.println("◇ 번호를 입력해주세요.");
			System.out.print("◇ 번호 : ");
			selNum = in.nextLine();
			
			if (selNum.equals("0")) {
				System.out.println("\n프로그램을 종료합니다.");
				break;
			} else if (selNum.equals("1")) {
				System.out.println("\n영어단어를 등록합니다.");
				add();
			} else if (selNum.equals("2")) {
				System.out.println("\n등록된 영어단어 목록을 출력합니다.");
				wordList();
			} else if (selNum.equals("3")) {
				System.out.println("\n영어단어 삭제를 진행합니다.");
				del();
			} else if (selNum.equals("4")) {
				System.out.println("\n영어단어 수정을 진행합니다.");
				mod();
			} else {
				System.out.println("\n올바른 번호가 아닙니다.");
				System.out.println("다시 입력해주세요.");
			}
		}
	}
	// 중복되는 영어단어가 있는지 체크하는 메서드(중복검사)
	// wList 리스트의 english 변수의 값이 매개변수 값(en)과 같을 경우 참(true) 아닐 경우 거짓(false)을 반환한다.
	public boolean englishExistCheck(String en) {
		for (int i=0; i<wList.size(); i++) {
			if (wList.get(i).english.equals(en)) {
				return true;
			}
		}
		return false;
	}
	// 중복되는 한글 뜻이 있는지 체크하는 메서드(중복검사)
	// wList 리스트의 korean 변수의 값이 매개변수 값(ko)과 같을 경우 참(true) 아닐 경우 거짓(false)을 반환한다.
	public boolean koreanExistCheck(String ko) {
		for (int i=0; i<wList.size(); i++) {
			if (wList.get(i).korean.equals(ko)) {
				return true;
			}
		}
		return false;
	}
	// 영어단어 등록에 대한 기능을 수행할 메서드
	private void add() {
		Word word = new Word();
		
		System.out.println("▷ 영어단어를 입력해주세요.");
		System.out.print("▷ 영어단어 : ");
		String en = in.nextLine();
		word.english = en;
		
		System.out.println("▷ 해당 영어단어의 한글 뜻을 입력해주세요.");
		System.out.println("▷ 입력된 영어단어 : " + en);
		System.out.print("▷ 한글 뜻 : ");
		String ko = in.nextLine();
		word.korean = ko;
		
		wList.add(word);
		System.out.println("등록되었습니다.");
		
		word = null;
		/* 영어단어 중복검사를 진행할 때 사용하는 코드
		if (wordEnglishCheck(en)) {
			System.out.println(en + " : 해당 영어단어는 이미 등록되어있습니다.");
		} else {
			word.english = en;
			System.out.println("▷ 해당 영어단어의 뜻을 입력해주세요.");
			System.out.println("▷ 입력된 영어단어 : " + en);
			System.out.print("▷ 영어단어 : ");
			String ko = in.nextLine();
			word.korean = ko;
			
			wList.add(word);
		}
		*/
	}
	// 등록된 영어단어 목록을 보여주는 기능을 수행할 메서드
	private void wordList() {
		for (int i=0; i<wList.size(); i++) {
			wList.get(i).wordList();
		}
	}
	// 영어단어 삭제에 대한 기능을 수행할 메서드
	private void del() {
		System.out.println("▷ 영어단어를 입력해주세요.");
		System.out.print("▷ 영어단어 : ");
		String en = in.nextLine();
		
		if (englishExistCheck(en)) {
			for (int i=0; i<wList.size(); i++) {
				if (wList.get(i).english.equals(en)) {
					wList.remove(i);
					System.out.println("'"+ en + "' 해당 영어단어가 삭제되었습니다.");
				}
			}
		} else {
			System.out.println(en + " : 해당 영어단어는 등록되어있지 않습니다.");
		}
	}
	// 영어단어 수정에 대한 기능을 수행할 메서드
	private void mod() {
		System.out.println("▷ 영어단어를 입력해주세요.");
		System.out.print("▷ 영어단어 : ");
		String en = in.nextLine();
		
		if (englishExistCheck(en)) {
			System.out.println("\n'" + en + "' 단어가 포함된 목록입니다.");
			System.out.println("------------------------------");
			for (int i=0; i<wList.size(); i++) {
				if (wList.get(i).english.equals(en)) {
					wList.get(i).wordList();
				}
			}
			System.out.println("------------------------------");
			System.out.println("▷ 목록 중 바꾸고 싶은 한글 뜻을 적어주세요.");
			System.out.print("▷ 한글 뜻 : ");
			String ko = in.nextLine();
			
			if (koreanExistCheck(ko)) {
				System.out.println("▷ 무엇으로 바꾸시겠습니까?");
				System.out.print("▷ (" + ko + ") => ");
				String changeKo = in.nextLine();
				for (int i=0; i<wList.size(); i++) {
					if (wList.get(i).english.equals(en) && wList.get(i).korean.equals(ko)) {
						wList.get(i).korean = changeKo;
						System.out.println("변경되었습니다.");
					}
				}
			} else {
				System.out.println("올바른 입력값이 아닙니다.");
			}
		} else {
			System.out.println(en + " : 해당 영어단어는 등록되어있지 않습니다.");
		}	
	}
	
}
