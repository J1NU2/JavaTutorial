package _07_클래스와객체_미션0920;

import java.util.Scanner;

public class Rail_Manager {
	Rail_Time[] railTime = new Rail_Time[10];
	Scanner in = new Scanner(System.in);
	
	int rTime = railTime.length;
	
	Rail_List railList = new Rail_List();
	int[] rListNum = railList.railNumber;
	boolean[] rListRepair = railList.railRepair;
	
	Rail_Manager() {
		String selNum = "";
		while(true) {
			menu();
			System.out.print("번호를 선택해주세요 : ");
			selNum = in.nextLine();
			if (selNum.equals("0")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if (selNum.equals("1")) {
				railTimeAdd();
			} else if (selNum.equals("2")) {
				railTimeEdit();
			} else if (selNum.equals("3")) {
				railList();
			} else if (selNum.equals("4")) {
				railRepair();
			} else if (selNum.equals("5")) {
				railRepairList();
			} else {
				System.out.println("\n잘못된 번호입니다.");
				System.out.println("다시 입력해주세요.\n");
			}
		}
	}
	
	public void menu() {
		System.out.println("메뉴(Menu)");
		System.out.println("0.종료");
		System.out.println("1.등록");
		System.out.println("2.수정");
		System.out.println("3.전체보기");
		System.out.println("4.수리가 필요한 열차 지정하기");
		System.out.println("5.수리중인 열차 보기");
	}
	
	public void railTimeAdd() {
		System.out.println("\n기차 정보를 등록합니다.");
		
		Rail_Time add = new Rail_Time();
		
		
		while (true) {
			System.out.println("입력할 수 있는 기차 번호");
			for (int i=0; i<rListNum.length; i++) {
				System.out.print(rListNum[i] + " ");
			}
			System.out.print("\n기차 번호를 입력해주세요 : ");
			int num = in.nextInt();
			in.nextLine();
			for (int i=0; i<rListNum.length; i++) {
				if (rListNum[i] == num) {
					add.railNumber = num;
					break;
				}
			}
			if (add.railNumber == num) {
				break;
			} else {
				System.out.println("올바르지 않은 기차 번호입니다.");
				System.out.println("메인 메뉴로 돌아갑니다.\n");
				return;
			}
		}
		
		while (true) {
			System.out.println("입력 양식 : 시(00~23) 분(00~59)");
			System.out.print("도착 시간을 입력해주세요 : ");
			String time = in.nextLine();
			
			int timeCheck = Integer.parseInt(time);

			if (time.length() == 4 && (timeCheck/100) < 24 && (timeCheck%100) < 60) {
				add.railTime = time;
				break;
			} else {
				System.out.println("다시 입력해주세요.\n");
			}
		}
		
		for (int i=0; i<rTime; i++) {
			if (railTime[i] == null) {
				System.out.println("\n기차 도착 시간이 등록되었습니다.\n");
				railTime[i] = add;
				break;
			}
		}
	}
	
	public void railTimeEdit() {
		System.out.println("\n기차 정보를 수정합니다.");
		
		System.out.println("수정하고 싶은 기차 번호를 입력해주세요.");
		System.out.print("기차 번호 : ");
		int editNum = in.nextInt();
		in.nextLine();
		
		int count = 0;
		
		for (int i=0; i<rTime; i++) {
			if (railTime[i] != null && railTime[i].railNumber == editNum) {
				count++;
			}
		}
		if (count == 0) {
			System.out.println("올바르지 않은 기차 번호입니다.");
			System.out.println("메인 메뉴로 돌아갑니다.\n");
			return;
		}
		
		System.out.println("수정하고 싶은 기차 도착 시간을 입력해주세요.");
		String time = "";
		
		while (true) {
			System.out.println("입력 양식 : 시(00~23) 분(00~59)");
			System.out.print("도착 시간 : ");
			String changeTime = in.nextLine();
			
			int timeCheck = Integer.parseInt(changeTime);

			if (changeTime.length() == 4 && (timeCheck/100) < 24 && (timeCheck%100) < 60) {
				time = changeTime;
				break;
			} else {
				System.out.println("다시 입력해주세요.\n");
			}
		}
		
		for (int i=0; i<rTime; i++) {
			if (railTime[i] != null && railTime[i].railNumber == editNum && railTime[i].railTime.equals(time)) {
				String editTime = "";
				while (true) {
					System.out.println("어떤 번호로 변경하시겠습니까?");
					System.out.print("(현재 도착 시간) " + time + " => ");
					String changeTime = in.nextLine();
					
					int timeCheck = Integer.parseInt(changeTime);
					
					if (changeTime.length() == 4 && (timeCheck/100) < 24 && (timeCheck%100) < 60) {
						editTime = changeTime;
						break;
					} else {
						System.out.println("다시 입력해주세요.\n");
					}
				}
				railTime[i].railTime = editTime;
				System.out.println("변경되었습니다.\n");
			}
		}
	}
	
	public void railList() {
		System.out.println("\n기차 정보를 조회합니다.");
		
		for (int i=0; i<rListRepair.length; i++) {
			for (int j=0; j<rTime; j++) {
				if (railTime[j] != null && railTime[j].railNumber == rListNum[i] && rListRepair[i] == false) {
					railTime[j].railTimeList();
				}
			}
		}
		System.out.println();
	}
	
	public void railRepair() {
		System.out.println("\n수리가 필요한 기차를 조회합니다.");
		
		while (true) {
			System.out.println("현재 기차 번호");
			for (int i=0; i<rListNum.length; i++) {
				System.out.print(rListNum[i] + " ");
			}
			System.out.println("\n수리 여부를 변경할 기차 번호를 입력해주세요.");
			System.out.print("기차 번호 : ");
			int num = in.nextInt();
			in.nextLine();
			
			int numCheck = 0;
			
			for (int i=0; i<rListRepair.length; i++) {
				if (rListNum[i] == num && rListRepair[i] == false) {
					rListRepair[i] = true;
					numCheck = num;
				} else if (rListNum[i] == num && rListRepair[i] == true) {
					rListRepair[i] = false;
					numCheck = num;
					break;
				}
			}
			
			if (num == numCheck) {
				break;
			} else {
				System.out.println("올바르지 않은 기차 번호입니다.");
				System.out.println("메인 메뉴로 돌아갑니다.\n");
				return;
			}
		}
	}
	
	public void railRepairList() {
		System.out.println("\n수리중인 기차를 조회합니다.");
		railList.railRepairList();
		System.out.println();
	}
	
}
