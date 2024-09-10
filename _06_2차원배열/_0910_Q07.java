package _06_2차원배열;

public class _0910_Q07 {

	public static void main(String[] args) {
		// 문제7
		/*
		 *　1　1　0　2
		 *　3　2　1　2
		 *　0　0　3　2
		 *　4　4　4　4
		 *　2　4　3　1
		 *　2　4　1　3
		 */
		// 위와 같은 게임 배열에서 같은 번호가 세로로 연속 3개 이상이면 제거가 가능하다.
		// 제거가 가능한 블록의 좌표를 출력하시오.
		
		// 초기값
		int[][] game = {{1,1,0,2},{3,2,1,2},{0,0,3,2},{4,4,4,4},{2,4,3,1},{2,4,1,3}};
		// 배열의 행과 열이 마지막일 때, 테스트값
//		int[][] game = {{1,1,0,2},{3,2,1,2},{0,0,3,2},{4,4,4,2},{2,4,3,2},{2,4,1,2}};
		
		int count = 0;		// 3개 이상인 것을 카운트하기 위한 변수
		int saveNum = 5;	// 게임 내 포함된 배열의 값이 아닌 수면 어떤 것이든 가능
		
		// 열을 행으로 생각하고 계산
		for (int i=0; i<game[i].length; i++) {
			for (int j=0; j<game.length; j++) {
				// 배열에 있는 이전 값과 현재 값이 같을 경우 count를 증가(count++)
				// 아닐 경우 count를 0으로 초기화하고 비교할 이전 값에 현재 값을 저장
				if (saveNum == game[j][i]) {
					count++;
				} else {
					// 위 조건이 아닐 경우에 해당하며 count가 2이상일 경우
					if (count >= 2) {
						// 열의 끝에 있을 경우
						if (j == 0) {
							j = (game.length-1);
							for (int k=0; k<=count; k++) {
								// System.out.print(game[j-k][i-1]);
								System.out.print("(" + (i-1) + "," + (j-k) + ") ");
							}
							j = 0;
						} else {
							for (int k=0; k<=count; k++) {
								// System.out.print(game[j-(k+1)][i]);
								System.out.print("(" + (i) + "," + (j-(k+1)) + ") ");
							}
						}
					}
					count = 0;
					saveNum = game[j][i];
				}
				// 배열의 행과 열이 마지막이며, 제거가 가능한 경우
				if (i == (game[i].length-1) && j == (game.length-1) && count >= 2) {
					for (int k=0; k<=count; k++) {
						System.out.print("(" + (i) + "," + (j-k) + ") ");
					}
				}
//				System.out.print(game[j][i]);
			}
//			System.out.println("");
		}
	}
}
