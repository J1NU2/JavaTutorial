package _02_조건문;

public class _00_if {

	public static void main(String[] args) {
		// if : 조건식으로 참과 거짓을 구분하여 코드를 분리
		// 조건의 종류
		//	- 1. 조건이 하나인 경우
		//	- 2. 1차 조건, 2차 조건.. n차 조건이 순서를 판별하여 하나의 조건에 해당하는 경우
		//	- 3. 1차 조건 판별 후 2차 조건을 연속적으로 조건을 판별하는 경우
		
		// 1번 시나리오 : if문
		// 키가 160미만이면 집에 가는 시나리오
		int cm1 = 163;
		if (cm1 < 160) {
			System.out.println("집에 갑니다.");
		}
		// 키가 160미만이면 집에 가고, 160이상이면 집에 못가는 시나리오
		if (cm1 < 160 ) {
			System.out.println("집에 갑니다.");
		} else {
			System.out.println("집에 못갑니다..");
		}
		// 점수가 있다, 만약 점수가 홀수라면 +10을 해주세요.
		int point = 9;
		if (point % 2 != 0) {		// 또는, point % 2 == 1
			point += 10;
		}
		System.out.println(point);
		
		// 2번 시나리오 : if-else문
		// 키가 180이상이면 A조, 170~179라면 B조, 170미만이면 C조
		int cm2 = 175;
		// 조건만 보기
		System.out.println(cm2 >= 180);					// A조
		System.out.println(cm2 < 180 && cm2 >= 170);	// B조
		System.out.println(cm2 < 170);					// C조
		// if문 사용
		if (cm2 >= 180) {
			System.out.println("A조");
		} else if (cm2 >= 170) {
			System.out.println("B조");
		} else {
			System.out.println("C조");
		}
		// 아래 if문은 2번 시나리오랑 비슷해 보이지만
		// 단독 if가 3개이다, 즉 2번 시나리오랑은 다른 것이다.
		if (cm2 >= 180) {
			System.out.println("A조");
		}
		if (cm2 >= 170) {
			System.out.println("B조");
		}
		if (cm2 < 170) {
			System.out.println("C조");
		}
		
		// 3번 시나리오 : 다중 if문
		// 출석률이 100%이고, 과제 제출률이 90% 이상인 경우 MVP
		int cnt = 100;		// 출석
		int cntAnswer = 95;	// 과제 제출
		if (cnt == 100) {
			if (cntAnswer >= 90) {
				System.out.println("당신이 MVP입니다.");
			} else {
				System.out.println("과제 제출률이 미달입니다.");
			}
		} else {
			System.out.println("출석률이 미달입니다.");
		}
	}

}
