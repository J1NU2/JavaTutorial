package _06_2차원배열;

public class _0913_Q01_comment {

	public static void main(String[] args) {
		int[][] a = new int[4][5];
		int num = 1;
		
		/* 다음 형태로 출력하기
		 * 17  13  9   5   1
		 * 18  14  10  6   2
		 * 19  15  11  7   3
		 * 20  16  12  8   4 
		 */
		
		// 값을 저장하는 코드
		/* 문제 분석
		 *  0,4	 1,4  2,4  3,4		열 고정 4 / 행 0 1 2 3
		 *  0,3  1,3  2,3  3,3		열 고정 3 / 행 0 1 2 3
		 *  0,2  1,2  2,2  3,2		열 고정 2 / 행 0 1 2 3
		 *  0,1  1,1  2,1  3,1		열 고정 1 / 행 0 1 2 3
		 *  0,0  1,0  2,0  3,0		열 고정 0 / 행 0 1 2 3
		 *  i를 열로 보고, j를 행으로 볼 때,
		 *  열은 고정되고 시도를 거듭할 수록 1씩 낮아진다.
		 *  각 열이 실행될 때마다 행은 0~3까지 실행된다.
		 */
		for (int i=4; i>=0; i--) {
			// System.out.println("현재 행 : " + i);
			for (int j=0; j<4; j++) {
				// System.out.println(j + "," + i);
				a[j][i] = num;
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
