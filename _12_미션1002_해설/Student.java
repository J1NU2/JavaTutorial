package _12_미션1002_해설;

import java.util.ArrayList;
import java.util.Scanner;

// 추상화 요구사항의 학생을 멤버변수와 메서드로 정의
public class Student {
	private String id = null;
	private String name = null;
	private String tel = null;
	private int grade = -1;
	
	
	// 수강 신청한 교과목을 저장할 리스트
	private ArrayList<Part> myList = new ArrayList<>();
	
	public void prt() {
		System.out.println("ID : " + id);
		System.out.println("Name : " + name);
	}
	
	// 객체의 주소를 저장할 멤버변수 선언
	private PartManager partMag = null;
	private Scanner in = new Scanner(System.in);
	// 로그인 후 메뉴
	public void menu(PartManager pmg) {
		partMag = pmg;
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.println("1.수강신청");
			System.out.println("2.신청목록");
			
			int selNum = in.nextInt();
			in.nextLine();
			
			if (selNum == 1) {
				add();
			} else if (selNum == 2) {
				list();
			} else {
				break;
			}
		}
	}
	// 수강신청
	private void add() {
		// 교과목의 리스트를 보여줘야 하는데, 이 리스트는 PartManager
		ArrayList<Part> getList = partMag.getPList();
		for (int i=0; i<getList.size(); i++) {
			System.out.println("과목번호 : " + i);
			getList.get(i).prt();
			System.out.println();
		}
		System.out.println("번호선택");
		int choiceNum = in.nextInt();
		in.nextLine();
		myList.add(getList.get(choiceNum));
	}
	// 수강신청목록
	private void list() {
		System.out.println("수강신청 목록");
		for (int i=0; i<myList.size(); i++) {
			myList.get(i).prt();
		}
	}

	// 아이디
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	// 이름
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	// 핸드폰 번호
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	// 학년
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
}
