package _12_미션1002;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
	// 리스트 생성
	ArrayList<StudentOne> stuList = new ArrayList<>();
	
	// 학생 인원 제한을 위한 상수
	private final int STUDENTLIMITED = 10;
	
	// 핸드폰 번호 정규 표현식
	// 첫번째 번호 : 010 011 016 017 018 019
	// 구분자 -
	// 두번째 번호 : 3자리or4자리 / 세번째 번호 4자리
	String regExp = "^01(?:0|1|[6-9])-(\\d{3}|\\d{4})-(\\d{4})$";
	
	// 입력을 위한 객체
	Scanner in = new Scanner(System.in);
	
	// 생성자, 생략가능
	StudentManager() {}
	
	// 메뉴 메서드
	public void menu() {
		while(true) {
			String selNum = null;
			System.out.println("\n◇ 학생관리 메뉴 ◇");
			System.out.println("0.이전 메뉴로 나가기");
			System.out.println("1.학생 등록하기");
			System.out.println("2.학생 검색하기");
			System.out.println("3.학생 삭제하기");
			System.out.println("4.학생 전체보기");
			
			System.out.print("▷ 번호를 입력해주세요. : ");
			selNum = in.nextLine();
			
			if (selNum.equals("0")) {
				System.out.println("\n이전메뉴로 돌아갑니다.");
				break;
			} else if (selNum.equals("1")) {
				System.out.println("\n새로운 학생 정보를 등록합니다.");
				stuAdd();
			} else if (selNum.equals("2")) {
				System.out.println("\n특정 학생을 검색합니다.");
				stuSel();
			} else if (selNum.equals("3")) {
				System.out.println("\n등록된 학생 정보를 삭제합니다.");
				stuDel();
			} else if (selNum.equals("4")) {
				System.out.println("\n등록된 학생 전체를 조회합니다.");
				stuAllList();
			} else {
				System.out.println("\n잘못된 입력입니다.");
				System.out.println("다시 입력해주세요.");
			}
		}
	}
	// 학생 등록을 위한 메서드
	private void stuAdd() {
		if (stuList.size() == STUDENTLIMITED) {
			System.out.println("\n정원 초과입니다.");
		} else {
			StudentOne stu = new StudentOne();
			
			System.out.println("\n▷ 아이디를 입력해주세요.");
			System.out.print("▷ 아이디 : ");
			String id = in.nextLine();
			
			if (studentCheckID(id) != -1) {
				System.out.println("\n중복된 아이디가 존재합니다.");
			} else {
				System.out.println("\n▷ 이름을 입력해주세요.");
				System.out.print("▷ 이름 : ");
				String name = in.nextLine();
				
				String phone = null;
				while (true) {
					System.out.println("\n▷ 핸드폰이 존재하시나요? (Y/N) : ");
					String check = in.nextLine();
					if (check.equals("y") || check.equals("Y")) {
						while (true) {
							System.out.println("\n--------------- 입력 양식 ---------------");
							System.out.println("☆ 앞자리 : 010 011 016 017 018 019");
							System.out.println("☆ 뒷자리 : 3자리or4자리 / 4자리");
							System.out.println("☆ 구분자 '-'를 꼭 사용해주세요.");
							System.out.println("☆ 예시) 010-1234-5678 or 011-123-4567");
							System.out.println("--------------------------------------");
							System.out.println("▷ 핸드폰 번호를 입력해주세요.");
							System.out.print("▷ 핸드폰 번호 : ");
							phone = in.nextLine();
							
							if (phone.matches(regExp)) {
								break;
							} else {
								System.out.print("\n올바른 입력 양식이 아닙니다.");
							}
						}
						break;
					} else if (check.equals("n") || check.equals("N")) {
						phone = "X";
						break;
					} else {
						System.out.println("\n올바른 입력 양식이 아닙니다.");
						System.out.println("다시 입력해주세요.");
					}
				}
				
				System.out.println("\n▷ 학년을 입력해주세요.");
				System.out.print("▷ 학년 : ");
				String grade = in.nextLine();
				
				stu.setStudent(id, name, phone, grade);
				stuList.add(stu);
			}
		}
	}
	// 아이디 중복 검사를 위한 메서드
	private int studentCheckID(String id) {
		for (int i=0; i<stuList.size(); i++) {
			if (stuList.get(i).stId.equals(id)) {
				return i;
			}
		}
		return -1;
	}
	// 학생 검색을 위한 메서드
	private void stuSel() {
		System.out.println("\n▷ 검색할 이름을 입력해주세요.");
		System.out.print("▷ 이름 : ");
		String name = in.nextLine();
		
		if (studentCheckNameSelect(name)) {
			System.out.println("--------------- 검색한 학생 정보 ---------------");
			studentCheckNameSelectList(name);
			System.out.println("-------------------------------------------");
		} else {
			System.out.println("\n해당 이름을 가진 학생은 존재하지 않습니다.");
		}
	}
	// 학생 검색 시 검색한 이름이 있는지 검사하는 메서드
	private boolean studentCheckNameSelect(String name) {
		for (int i=0; i<stuList.size(); i++) {
			if (stuList.get(i).getName().equals(name) || stuList.get(i).getName().contains(name)) {
				return true;
			}
		}
		return false;
	}
	// 이름으로 검색한 학생의 정보를 출력하는 메서드
	private void studentCheckNameSelectList(String name) {
		for (int i=0; i<stuList.size(); i++) {
			if (stuList.get(i).getName().equals(name) || stuList.get(i).getName().contains(name)) {
				stuList.get(i).stuOne();
			}
		}
	}
	// 학생 삭제를 위한 메서드
	private void stuDel() {
		System.out.println("\n▷ 정보를 삭제할 학생의 아이디를 입력해주세요.");
		System.out.print("▷ 아이디 : ");
		String id = in.nextLine();
		
		int checkIndex = studentCheckID(id);
		if (checkIndex != -1) {
			while (true) {
				studentCheckIDSelectList(id);
				System.out.println("\n해당 학생의 정보를 정말 삭제하시겠습니까? (Y/N) : ");
				String check = in.nextLine();
				if (check.equals("y") || check.equals("Y")) {
					System.out.println("\n해당 학생의 정보가 삭제되었습니다.");
					stuList.remove(checkIndex);
					break;
				} else if (check.equals("n") || check.equals("N")) {
					System.out.println("\n학생 정보 삭제를 취소합니다.");
					break;
				} else {
					System.out.println("\n올바른 입력 양식이 아닙니다.");
					System.out.println("다시 입력해주세요.");
				}
			}
		} else {
			System.out.println("\n해당 아이디를 가진 학생은 존재하지 않습니다.");
		}
	}
	// 아이디로 검색한 학생의 정보를 출력하는 메서드
	private void studentCheckIDSelectList(String id) {
		for (int i=0; i<stuList.size(); i++) {
			if (stuList.get(i).getID().equals(id)) {
				stuList.get(i).stuOne();
				break;
			}
		}
	}
	// 학생 전체보기를 위한 메서드
	private void stuAllList() {
		System.out.println("--------------- 학생 리스트 ---------------");
		for (int i=0; i<stuList.size(); i++) {
			stuList.get(i).stuOne();
		}
		System.out.println("----------------------------------------");
	}
}
