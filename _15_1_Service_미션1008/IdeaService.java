package _15_1_Service_미션1008;

import java.util.ArrayList;
import java.util.Scanner;

import _15_1_DAO_미션1008.IdeaDAO;
import _15_1_DTO_미션1008.IdeaDTO;

public class IdeaService {
	// 입력을 위한 객체
	Scanner in = new Scanner(System.in);
	
	// IdeaDAO 클래스 내에서 해당 객체를 한번만 선언하고, 공유받아 사용(싱글톤)
	IdeaDAO idao = IdeaDAO.getInstance();
	
	// 생성자, 생략가능
	public IdeaService() {}
	
	// 메뉴
	public void menu() {
		while (true) {
			String selNum = null;
			
			System.out.println("★☆ 아이디어 공모전 ☆★");
			System.out.println("0.프로그램 종료");
			System.out.println("1.아이디어 제안하기");
			System.out.println("2.등록된 아이디어 수정하기");
			System.out.println("3.등록된 아이디어 삭제하기");
			System.out.println("4.등록된 아이디어 전체보기");
			System.out.println("5.아이디어 제목으로 검색하기");
			
			System.out.print("▷ 번호 : ");
			selNum = in.nextLine();
			
			if (selNum.equals("0")) {
				System.out.println("\n프로그램을 종료합니다.");
				break;
			} else if (selNum.equals("1")) {
				System.out.println("\n내가 생각한 아이디어를 제안합니다.");
				suggest();
			} else if (selNum.equals("2")) {
				System.out.println("\n등록된 아이디어를 수정합니다.");
				update();
			} else if (selNum.equals("3")) {
				System.out.println("\n등록된 아이디어를 삭제합니다.");
				delete();
			} else if (selNum.equals("4")) {
				System.out.println("\n등록된 아이디어를 확인합니다.");
				select();
			} else if (selNum.equals("5")) {
				System.out.println("\n특정 아이디어를 검색합니다.");
				search();
			} else {
				System.out.println("\n올바른 번호가 아닙니다.");
				System.out.println("다시 입력해주세요.");
			}
		}
	}
	// 아이디어 제안
	private void suggest() {
		// 아이디어 제안은 번호,제목,설명,작성자 4가지의 정보로 이루어져있다.
		// 번호는 DB내 시퀀스를 이용하여 0부터 순차적으로 증가하도록 설정한다. (0 1 2 3 4 ~ n)
		System.out.println("\n▷ 아이디어 제목을 입력해주세요.");
		System.out.print("▷ 제목 : ");
		String title = in.nextLine();
		
		System.out.println("\n▷ 아이디어 내용을 입력해주세요.");
		System.out.print("▷ 내용 : ");
		String content = in.nextLine();
		
		System.out.println("\n▷ 해당 아이디어의 작성자 이름을 입력해주세요.");
		System.out.print("▷ 작성자 : ");
		String author = in.nextLine();
		
		// IdeaDTO에 저장
		IdeaDTO idto = new IdeaDTO();
		idto.setTitle(title);		// 제목
		idto.setContent(content);	// 내용
		idto.setAuthor(author);		// 작성자
		
		// IdeaDAO의 suggest메서드를 호출하여 데이터베이스에 INSERT
		idao.suggest(idto);
	}
	// 아이디어 수정/삭제 시 아이디어 번호와 제목만 보여주는 메서드
	private void selectNumberTitle() {
		ArrayList<IdeaDTO> idto = idao.selectAll();
		System.out.println("◇ 아이디어 목록 ◇");
		for (IdeaDTO itemp : idto) {
			System.out.println(itemp.toNumberTitle());
		}
		System.out.println();
	}
	// 아이디어 수정
	private void update() {
		// 아이디어 수정 시 모든 제목이 먼저 다 보여지고, 제목 앞에는 번호가 표시된다.
		// 번호를 입력해서 아이디어 정보를 수정한다.
		// 단, 작성자 이름은 수정할 수 없도록 한다.
		selectNumberTitle();
		
		int modNo = 0;
		while (true) {
			System.out.println("\n▷ 수정할 아이디어 번호를 입력해주세요.");
			System.out.print("▷ 번호 : ");
			try {
				modNo = in.nextInt();
				in.nextLine();
				break;
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("\n잘못된 입력입니다.");
				System.out.println("다시 입력해주세요.");
			}
		}
		
		IdeaDTO idto = idao.selectOne(modNo);
		if (idto != null) {
			System.out.println("\n◆ 수정할 아이디어는 다음과 같습니다.");
			System.out.println(idto.toString());
			
			System.out.println("▷ 정말로 수정하실건가요?");
			while (true) {
				System.out.print("예(Y) / 아니오(N) : ");
				String check = in.nextLine();
				if (check.equals("Y") || check.equals("y")) {
					break;
				} else if (check.equals("N") || check.equals("n")) {
					return;
				} else {
					System.out.println("\n잘못된 입력입니다.");
					System.out.println("다시 입력해주세요.");
				}
			}
		}
		
		System.out.println("\n▷ 수정할 제목을 입력해주세요.");
		System.out.print("▷ 제목 : ");
		String modTitle = in.nextLine();
		
		System.out.println("\n▷ 수정할 내용을 입력해주세요.");
		System.out.print("▷ 내용 : ");
		String modContent = in.nextLine();
		
		idto.setTitle(modTitle);
		idto.setContent(modContent);
		
		idao.update(idto, modNo);
	}
	// 아이디어 삭제
	private void delete() {
		// 아이디어 삭제 시 모든 제목이 먼저 다 보여지고, 제목 앞에는 번호가 표시된다.
		// 번호를 입력해서 아이디어 정보를 삭제한다.
		selectNumberTitle();
		
		int delNo = 0;
		while (true) {
			System.out.println("\n▷ 삭제할 아이디어 번호를 입력해주세요.");
			System.out.print("▷ 번호 : ");
			try {
				delNo = in.nextInt();
				in.nextLine();
				break;
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("\n잘못된 입력입니다.");
				System.out.println("다시 입력해주세요.");
			}
		}
		
		IdeaDTO idto = idao.selectOne(delNo);
		if (idto != null) {
			System.out.println("\n◆ 삭제할 아이디어는 다음과 같습니다.");
			System.out.println(idto.toString());
			
			System.out.println("▷ 정말로 삭제하실건가요?");
			while (true) {
				System.out.print("예(Y) / 아니오(N) : ");
				String check = in.nextLine();
				if (check.equals("Y") || check.equals("y")) {
					break;
				} else if (check.equals("N") || check.equals("n")) {
					return;
				} else {
					System.out.println("\n잘못된 입력입니다.");
					System.out.println("다시 입력해주세요.");
				}
			}
		}
		
		idao.delete(delNo);
	}
	// 아이디어 전체보기
	private void select() {
		// 아이디어 전체보기 시 등록된 모든 아이디어가 보여진다.
		ArrayList<IdeaDTO> idto = idao.selectAll();
		System.out.println("똑똑이들이 등록한 아이디어가 " + idto.size() + "개 있습니다.");
		for (IdeaDTO itemp : idto) {
			System.out.println(itemp.toString());
		}
	}
	// 아이디어 찾기
	private void search() {
		// 아이디어 찾기 시 검색어를 입력받고, 입력받은 검색어가 포함된 모든 아이디어를 볼 수 있게 한다.
		System.out.println("\n▷ 검색할 검색어를 입력해주세요.");
		System.out.print("▷ 검색어 : ");
		String find = in.nextLine();
		
		ArrayList<IdeaDTO> idto = idao.selectFindList(find);
		for (IdeaDTO itemp : idto) {
			System.out.println(itemp.toString());
		}
	}
}
