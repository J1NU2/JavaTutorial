package _07_클래스와객체_미션0919;

import java.util.Scanner;

public class Car_Manager {
	Car_Object[] carList = new Car_Object[7];
	Scanner in = new Scanner(System.in);

	Car_Manager() {
		while (true) {
			System.out.println("이용하고자 하는 기능을 선택해주세요.");
			System.out.println("0. 종료하기");
			System.out.println("1. 차 등록하기");
			System.out.println("2. 특정 차 조회하기");
			System.out.println("3. 모든 차 조회하기");
			System.out.println("4. 차 삭제하기");
			
			System.out.print("선택지를 선택해주세요 : ");
			String selNum = in.nextLine();
			System.out.println("\n" + selNum + "번을 선택하였습니다.");
			
			if (selNum.equals("0")) {
				System.out.println("프로그램을 종료합니다.");
				System.out.println("이용해주셔서 감사합니다.");
				break;
			} else if (selNum.equals("1")) {
				System.out.println("차 등록을 선택하셨습니다.");
				add();
			} else if (selNum.equals("2")) {
				System.out.println("특정 차 조회를 선택하셨습니다.");
				read();
			} else if (selNum.equals("3")) {
				System.out.println("모든 차 조회를 선택하셨습니다.");
				allRead();
			} else if (selNum.equals("4")) {
				System.out.println("차 삭제를 선택하셨습니다.");
				delete();
			} else {
				System.out.println("올바르지 않은 번호입니다.");
				System.out.println("다시 입력해주세요.\n");
			}
		}
		in.close();
	}
	
	public void add() {
		Car_Object car = new Car_Object();
		
		System.out.print("소유자의 이름을 입력해주세요 : ");
		car.user = in.nextLine();
		System.out.print("자동차 번호를 입력해주세요 : ");
		car.carNum = in.nextLine();
		System.out.println();
		
		for (int i=0; i<carList.length; i++) {
			if (carList[i] == null) {
				carList[i] = car;
				break;
			}
		}
	}
	
	public void read() {
		while (true) {
			System.out.println("어떤 조건으로 검색하실건가요?");
			System.out.println("1. 소유자명");
			System.out.println("2. 자동차 번호");
			
			System.out.print("선택지를 선택해주세요 : ");
			String selNum = in.nextLine();
			System.out.println("\n" + selNum + "번을 선택하였습니다.");
			
			if (selNum.equals("1")) {
				System.out.println("소유자명으로 검색합니다.");
				
				System.out.println("소유자명을 입력해주세요.");
				System.out.print("소유자명 : ");
				String user = in.nextLine();
				
				for (int i=0; i<carList.length; i++) {
					if (carList[i] != null && carList[i].user == user) {
						carList[i].carInfo();
					}
				}
				break;
			} else if (selNum.equals("2")) {
				System.out.println("자동차 번호로 검색합니다.");
				
				System.out.println("자동차 번호를 입력해주세요.");
				System.out.print("자동차 번호 : ");
				String carNum = in.nextLine();
				
				System.out.println(carNum);
				for (int i=0; i<carList.length; i++) {
					if (carList[i] != null && carList[i].carNum == carNum) {
						carList[i].carInfo();
					}
				}
				break;
			} else {
				System.out.println("올바르지 않은 번호입니다.");
				System.out.println("다시 입력해주세요.\n");
			}
		}
	}
	
	public void allRead() {
		for (int i=0; i<carList.length; i++) {
			if (carList[i] != null) {
				carList[i].carInfo();
			}
		}
		System.out.println();
	}
	
	public void delete() {
		System.out.print("소유자의 이름을 입력해주세요 : ");
		String user = in.nextLine();
		System.out.print("자동차 번호를 입력해주세요 : ");
		String carNum = in.nextLine();
		System.out.println();
		
		for (int i=0; i<carList.length; i++) {
//			if (carList[i] != null && carList[i].user == user && carList[i].carNum == carNum) {
			if (carList[i].user == user && carList[i].carNum == carNum) {
				carList[i].carInfo();
				System.out.println("해당 차의 정보를 삭제하였습니다.");
				carList[i] = null;
			}
		}
	}
	
}
