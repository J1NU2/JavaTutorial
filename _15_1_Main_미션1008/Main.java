package _15_1_Main_미션1008;

import _15_1_Service_미션1008.IdeaService;

public class Main {

	public static void main(String[] args) {
		System.out.println("아이디어 공모전 프로그램 실행 중..\n");
		IdeaService is = new IdeaService();
		is.menu();
	}

}
