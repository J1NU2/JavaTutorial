package _02_조건문;

public class _04_Problem {

	public static void main(String[] args) {
		// 조건문 미션 			※ for문 사용 금지! ※
		
		// 문제1
		System.out.println("---------- 문제 1 ----------");
		double avg = 89.2;
		if (avg >= 80) {
			System.out.println("평균 : " + avg + "점, 합격입니다.");
		} else {
			System.out.println("평균 : " + avg + "점, 불합격입니다.");
		}
		
		// 문제2
		System.out.println("---------- 문제 2 ----------");
		int level = 2;
		int point = 30;
		if (level == 1) {
			point += 30;
		} else {
			point += 10;
		}
		System.out.println("Level : " + level + ", point : " + point);
		
		// 문제3
		System.out.println("---------- 문제 3 ----------");
		int[] lotto = {6,12,33,4,5,26};			// 배열의 값은 바뀔 수 있다.
		lotto[2] += 80;
		System.out.println("3번째 값 : " + lotto[2]);
		
		// 문제4
		System.out.println("---------- 문제 4 ----------");
		if (lotto[3] % 2 != 0) {
			System.out.println("홀수입니다.");
		} else {
			System.out.println("짝수입니다.");
		}

		// 문제5
		System.out.println("---------- 문제 5 ----------");
		lotto[2] = 33;			// 초기값으로 값 초기화
		int oddLottoNumber = lotto[2] + lotto[4];
		System.out.println("홀수인 로또 번호의 총합 : " + oddLottoNumber);
		
		// 문제6
		System.out.println("---------- 문제 6 ----------");
		int[] number = {45,34,64,45,24};
		int totalNumber = number[0] + number[1] + number[2] + number[3] + number[4];
		System.out.println("모든 번호의 총합 : " + totalNumber);
		
		// 문제7
		System.out.println("---------- 문제 7 ----------");
		int[] a = {45,34,64};
		// a[0]
		int aIndex01 = a[0] / 10, aIndex02 = a[0] % 10;
		int a0 = aIndex01 + aIndex02;
		System.out.println("첫번째 : " + a0);
		// a[1]
		int aIndex11 = a[1] / 10, aIndex12 = a[1] % 10;
		int a1 = aIndex11 + aIndex12;
		System.out.println("두번째 : " + a1);
		// a[2]
		int aIndex21 = a[2] / 10, aIndex22 = a[2] % 10;
		int a2 = aIndex21 + aIndex22;
		System.out.println("세번째 : " + a2);

		if (a0 > a1 && a0 > a2) {
			System.out.println(a[0] + ", 선택한 숫자는 첫번째에 있습니다.");
		} else if (a1 > a2) {
			System.out.println(a[1] + ", 선택한 숫자는 두번째에 있습니다.");
		} else {
			System.out.println(a[2] + ", 선택한 숫자는 세번째에 있습니다.");
		}
		
		// 문제8				※ for문 사용 금지 ※
		System.out.println("---------- 문제 8 ----------");
		// 0번새 6,4 / 1번새 5,10 / 2번새 9,6
		// 총알의 좌표 3,2
		int[] x = {6,5,9};
		int[] y = {4,10,6};
		int[] bullet = {3,2};
		
		// 발사
		System.out.println("발사 : " + bullet[0] + "," + bullet[1]);
		if (x[0] == bullet[0] && y[0] == bullet[1]) {
			System.out.println("첫번째 새가 맞았습니다.");
		} else if (x[1] == bullet[0] && y[1] == bullet[1]) {
			System.out.println("두번째 새가 맞았습니다.");
		} else if (x[2] == bullet[0] && y[2] == bullet[1]) {
			System.out.println("세번째 새가 맞았습니다.");
		}
		// 거리 증가
		bullet[0]++;
		bullet[1]++;
		System.out.println("총알이 궤도를 벗어났습니다.");
		
		System.out.println("---------------------------");
		
		// 만약, for문을 사용한다면?
		System.out.println("-------- 문제 8 for문 -------");
		bullet[0] = 3;			// 초기값으로 값 초기화
		bullet[1] = 2;			// 초기값으로 값 초기화
		for (int i = 0; i < 10; i++) {
			System.out.println("현재 총알의 좌표 : " + bullet[0] + "," + bullet[1]);
			if (x[0] == bullet[0] && y[0] == bullet[1]) {
				System.out.println("첫번째 새가 맞았습니다.");
			} else if (x[1] == bullet[0] && y[1] == bullet[1]) {
				System.out.println("두번째 새가 맞았습니다.");
			} else if (x[2] == bullet[0] && y[2] == bullet[1]) {
				System.out.println("세번째 새가 맞았습니다.");
			}
			bullet[0]++;
			bullet[1]++;
		}
		System.out.println("총알이 궤도를 벗어났습니다.");
		
		// 문제9				※ for문 사용 금지 ※
		System.out.println("---------- 문제 9 ----------");
		// 적의 위치 x(10) y(20) 크기 가로(w(5)) 세로(l(6))
		// 미사일의 위치 x(11) y(5) 크기 가로(w(2)) 세로(l(2))
		int xEnemy = 10, yEnemy = 20, wEnemy = 5, lEnemy = 6;
		int xMissile = 11, yMissile = 5, wMissile = 2, lMissile = 2;
		
		if ((xMissile >= xEnemy) || ((xMissile + wMissile) >= (xEnemy))) {
			if (((xMissile + wMissile) <= (xEnemy + wEnemy))) {
				if ((yMissile >= yEnemy) || ((yMissile + lMissile) >= yEnemy)) {
					if (((yMissile + lMissile) <= (yEnemy + lEnemy))) {
						System.out.println("미사일이 적을 맞췄습니다.");
					}
				}
			}
		}
		yMissile++;
		
		System.out.println("---------------------------");
		
		// 만약, for문을 사용한다면?
		System.out.println("-------- 문제 9 for문 -------");
		for (int i = 0; i <= 20; i++) {
			if ((xMissile >= xEnemy) || ((xMissile + wMissile) >= (xEnemy))) {
				if (((xMissile + wMissile) <= (xEnemy + wEnemy))) {
					if ((yMissile >= yEnemy) || ((yMissile + lMissile) >= yEnemy)) {
						if (((yMissile + lMissile) <= (yEnemy + lEnemy))) {
							System.out.println("미사일이 적을 맞췄습니다.");
							break;
						}
					}
				}
			}
			yMissile++;
		}
	}

}
