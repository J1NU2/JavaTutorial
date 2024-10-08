package _15_Service;

import java.util.ArrayList;
import java.util.Scanner;

import _15_DAO.FishDAO;
import _15_DTO.FishDTO;

public class FishService {
	// fishdata 테이블의 데이터를 입력하기 위해서는 FishDAO객체에 의존해야한다.
	FishDAO fdao = new FishDAO();
	
	public void menu() {
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.println("1.등록하기");
			System.out.println("2.삭제하기");
			System.out.println("3.검색하기");
			System.out.println("4.전체보기");
			System.out.println("5.수정하기");
			System.out.println("6.종료하기");
			
			System.out.println("메뉴선택 > ");
			int selNum = in.nextInt();
			in.nextLine();
			
			if (selNum == 1) {
				add();
			} else if (selNum == 2) {
				del();
			} else if (selNum == 3) {
				search();
			} else if (selNum == 4) {
				list();
			} else if (selNum == 5) {
				update();
			} else if (selNum == 6) {
				break;
			}
		}
	}
	// 등록
	private void add() {
		Scanner in = new Scanner(System.in);
		System.out.println("신규 물고기 등록하기");
		System.out.println("아이디 > ");
		String id = in.nextLine();
		System.out.println("비밀번호 > ");
		String pwd = in.nextLine();
		
		// DTO에 저장
		FishDTO fdto = new FishDTO();
		fdto.setId(id);
		fdto.setPwd(pwd);
		
		// DAO의 add메서드를 호출하여 데이터베이스에 INSERT
		fdao.add(fdto);
	}
	// 삭제
	private void del() {
		Scanner in = new Scanner(System.in);
		System.out.println("삭제할 아이디 > ");
		String delId = in.nextLine();
		
		fdao.delete(delId);
	}
	// 검색
	private void search() {
		Scanner in = new Scanner(System.in);
		System.out.println("검색할 아이디 > ");
		String findId = in.nextLine();
		
		FishDTO fdto = fdao.selectOne(findId);
		if (fdto != null) {
			System.out.println(fdto.toString());
		}
	}
	// 전체보기
	private void list() {
		ArrayList<FishDTO> fdto = fdao.selectAll();
		System.out.println("총 " + fdto.size() + "마리의 물고기가 있습니다.");
		// DB에 저장된 정보를 모두 출력
		for (FishDTO tempf : fdto) {
			System.out.println(tempf.toString());
		}
	}
	// 수정
	private void update() {
		Scanner in = new Scanner(System.in);
		System.out.println("수정할 아이디 > ");
		String modId = in.nextLine();
		
		FishDTO fdto = fdao.selectOne(modId);
		if (fdto != null) {
			System.out.println("수정할 아이디는 다음과 같습니다.");
			System.out.println(fdto.toString());
		}
		
		System.out.println("비밀번호를 수정하세요. > ");
		String modPwd = in.nextLine();
		fdto.setPwd(modPwd);
		
		fdao.update(fdto);
	}
}
