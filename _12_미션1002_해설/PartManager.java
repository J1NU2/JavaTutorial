package _12_미션1002_해설;

import java.util.ArrayList;
import java.util.Scanner;

// 교과목 관리 추상화 클래스
public class PartManager {
	// 여러 교과목을 저장할 리스트
	private ArrayList<Part> pList = new ArrayList<>();
	
	// 교과목 리스트 목록
	public ArrayList<Part> getPList() {
		return pList;
	}
	// 메뉴
	public void menu() {
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.println("1.등록");
			System.out.println("2.전체보기");

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
	// 교과목 등록을 위한 메서드
	public void add() {
		Scanner in = new Scanner(System.in);
		Part newTemp = new Part();
		System.out.println("과목명 입력");
		String partName = in.nextLine();
		
		newTemp.setPartName(partName);
		pList.add(newTemp);
	}
	// 교과목 전체를 보여주는 메서드
	public void list() {
		for (int i=0; i<pList.size(); i++) {
			pList.get(i).prt();
		}
	}
}
