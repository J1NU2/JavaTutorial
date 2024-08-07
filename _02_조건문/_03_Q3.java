package _02_조건문;

public class _03_Q3 {

	public static void main(String[] args) {
		/*
		 * int a = 10;
		 * int b = 20;
		 * int my = 15;
		 * 문제 a와 b는 도로의 길이이며 위치이다.
		 * my는 나의 위치이다.
		 * 내가 도로 위에 있으면 "도로 위..", 도로 위가 아니라면 "도로가 아님"이라고 출력하시오.		// 조건1	if문
		 * + 추가1
		 * 만약 내가 도로 위라면
		 * "a 지점으로부터 n만큼 떨어져 있습니다." 라고 출력하시오. (my위치에 따라 n이 달라진다.)		// 조건1-1	if문
		 * + 추가2
		 * 추가1에서 현재 my의 위치가 가까운 쪽 기준으로 출력한다.
		 * 예를들어 my 18이면 b에 더 가까우니 "b 지점으로부터 2만큼 떨어져 있습니다."				// 조건1-2 	if문
		 */
		
		int a = 10, b = 20, my = 18;
		if (my >= a && my <= 20) {
			System.out.println("도로 위에 있습니다.");
			// 추가1
			/*
			 * System.out.println("a 지점으로부터 " + (my - a) + "만큼 떨어져 있습니다.");
			 */
			// 추가2
			// a = 10 11 12 13 14
			// 정중앙 = 15
			// b = 16 17 18 19 20
			double center = a + (b - a) / 2;
			if (my > center) {
				System.out.println("b 지점으로부터 " + (b - my) + "만큼 떨어져 있습니다.");
			} else if (my < center) {
				System.out.println("a 지점으로부터 " + (my - a) + "만큼 떨어져 있습니다.");
			} else {
				System.out.println("현재 도로의 정중앙에 있습니다.");				
			}
		} else {
			System.out.println("도로 위에 있지 않습니다.");
		}
	}

}
