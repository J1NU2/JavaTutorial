package _12_미션1002_해설;

import java.util.ArrayList;
import java.util.Scanner;

// 요구사항에서 학생을 관리하는 내용을 추상화
public class StudentManager {
	// 여러 학생을 저장할 리스트
	private ArrayList<Student> sList = new ArrayList<>();	
	
	// 메뉴
	public void menu() {
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.println("1.등록");
			System.out.println("2.검색");
			System.out.println("3.삭제");
			System.out.println("4.전체보기");

			int selNum = in.nextInt();
			in.nextLine();
			
			if (selNum == 1) {
				add();
			} else if (selNum == 2) {
				search();
			} else if (selNum == 3) {
				delete();
			} else if (selNum == 4) {
				list();
			} else {
				break;
			}
		}
	}
	// 로그인한 정보를 넘겨주는 메서드
	public Student loginID(String id) {
		int index = findID(id);
		if (index != -1) {
			return sList.get(index);
		} else {
			return null;
		}
	}
	// 학생 등록을 위한 메서드
	private void add() {
		Scanner in = new Scanner(System.in);
		Student newTemp = new Student();
		System.out.println("아이디 입력");
		String id = in.nextLine();
		
		int resultValue = findID(id);
		if (resultValue == -1) {
			System.out.println("이름 입력");
			String name = in.nextLine();
			
			newTemp.setId(id);
			newTemp.setName(name);
			sList.add(newTemp);
		} else {
			System.out.println(id + "는 사용중");
		}
	}
	// 학생 검색을 위한 메서드
	private void search() {
		
	}
	// 처음... private 리턴타입? findID(매개변수?)
	private int findID(String id) {
		// 아이디를 찾는다는 것은, 검색이나 입력에서도 응용할 수 있다.
		// 그래서 이 코드는 재사용성을 높이기 위해서 메서드를 분리하는 것이 좋아보인다.
		// 아이디를 찾는 반복문
		for (int i=0; i<sList.size(); i++) {
			if (sList.get(i).getId().equals(id)) {
				return i;
			}
		}
		return -1;
	}
	// 학생 정보 삭제를 위한 메서드
	private void delete() {
		Scanner in = new Scanner(System.in);
		System.out.println("삭제할 아이디 입력");
		String delId = in.nextLine();
		
		int returnValue = findID(delId);
		
		if (returnValue != -1) {
			System.out.println("삭제");
			sList.remove(returnValue);
		} else {
			System.out.println("해당 아이디는 없음");
		}
		
		// 아이디를 찾는다는 것은, 검색이나 입력에서도 응용할 수 있다.
		// 그래서 이 코드는 재사용성을 높이기 위해서 메서드를 분리하는 것이 좋아보인다.
		// 아이디를 찾는 반복문
		/*
		for (int i=0; i<sList.size(); i++) {
			if (sList.get(i).getId().equals(delId)) {
				sList.remove(i);
				break;
			}
		}
		*/
	}
	// 학생 전체를 보여주는 메서드
	private void list() {
		for (int i=0; i<sList.size(); i++) {
			sList.get(i).prt();
		}
	}
}
