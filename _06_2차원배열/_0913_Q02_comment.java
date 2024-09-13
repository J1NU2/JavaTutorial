package _06_2차원배열;

public class _0913_Q02_comment {

	public static void main(String[] args) {
		int[][] a = new int[4][5];
		int num = 1;
		
		/* 다음 형태로 출력하기
		 * 20  19  18  17  16
		 * 15  14  13  12  11
		 * 10  9   8   7   6
		 * 5   4   3   2   1
		 */
		
		// 값을 저장하는 코드
		/* 문제 분석
		 *  3,4  3,3  3,2  3,1  3,0		행 고정 3 / 열 4 3 2 1 0
		 *  2,4  2,3  2,2  2,1  2,0		행 고정 2 / 열 4 3 2 1 0
		 *  1,4  1,3  1,2  1,1  1,0		행 고정 1 / 열 4 3 2 1 0
		 *  0,4  0,3  0,2  0,1  0,0		행 고정 0 / 열 4 3 2 1 0
		 *  i를 행으로 보고, j를 열로 볼 때,
		 *  행은 고정되고 시도를 거듭할 수록 1씩 낮아진다.
		 *  각 행이 실행될 때마다 열은 4~0까지 실행된다.
		 */
		for (int i=3; i>=0; i--) {
			// System.out.println("현재 행 : " + i);
			for (int j=4; j>=0; j--) {
				// System.out.println(i + "," + j);
				a[i][j] = num;
				num++;
			}
		}
		
		// 출력을 위한 코드
		for (int i=0; i<4; i++) {
			for (int j=0; j<5; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}
