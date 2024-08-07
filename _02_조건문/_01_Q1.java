package _02_조건문;

public class _01_Q1 {

	public static void main(String[] args) {
		/*
		 * 영수는 게임을 개발중인데,
		 * 명중에 따라 점수를 차등 부여하는 알고리즘을 개발 중이다.
		 * int point = 20;
		 * int x = 40;	// x는 화살의 위치이며, 화살의 위치는 달라진다.
		 * 화살의 위치가 0에서 12 사이라면 +10점		// 조건1
		 * 13~20 사이라면 +9점					// 조건2
		 * 21~30 사이라면 +8점					// 조건3
		 * 31 이상이면 +7점을 부여한다.			// 조건4			if-else문
		 * + 추가
		 * 0부터 12사이라면 +10점을 획득하고
		 * 0~1 사이라면 보너스 점수를 획득한다.		// 조건1-1		다중if문
		 * 보너스 점수는 현재 point의 10%이다.
		 */
		
		int point = 20, x = 40;
		if (x >= 0 && x <= 12) {
			point += 10;
			// 추가
			if (x <= 1) {
				double bonusPoint = point * 0.1;
				point += bonusPoint;
				System.out.println("+10점, 추가 보너스 점수 획득!!");
				System.out.println("총점 : " + point + ", 위치 : " + x);
			} else {
				System.out.println("+10점, 총점 : " + point + ", 위치 : " + x);
			}
		} else if (x <= 20) {
			point += 9;
			System.out.println("+9점, 총점 : " + point + ", 위치 : " + x);
		} else if (x <= 30) {
			point += 8;
			System.out.println("+8점, 총점 : " + point + ", 위치 : " + x);
		} else {
			point += 7;
			System.out.println("+7점, 총점 : " + point + ", 위치 : " + x);
		}
	}

}
