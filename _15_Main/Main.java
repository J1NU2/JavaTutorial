package _15_Main;

import _15_Service.FishService;

public class Main {

	public static void main(String[] args) {
		System.out.println("Fish World");
//		/*
		FishService fs = new FishService();
		fs.menu();
//		*/
		
		// DAO 단위 테스트 : DAO INSERT 기능 테스트 : 결과(성공)
		/*
		FishDTO fdto = new FishDTO();
		FishDAO fdao = new FishDAO();
		fdto.setId("test");
		fdto.setPwd("1111");
		fdao.add(fdto);
		*/
	}

}
