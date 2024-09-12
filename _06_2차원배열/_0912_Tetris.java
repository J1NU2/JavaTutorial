package _06_2차원배열;

public class _0912_Tetris {

	public static void main(String[] args) {
		int[][] a = {{1,1,0},
					 {0,1,0},
					 {0,1,1}};

		int row = a.length;		// 3
		int col = a[0].length;	// 3
		
		System.out.println("초기");
		for (int i=0; i<row; i++) {
			for (int j=0; j<col; j++) {
				// 배열에 있는 모든 값 확인
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		/* 기존
		 * 0,0  0,1  0,2
		 * 1,0  1,1  1,2
		 * 2,0  2,1  2,2
		 */
		
		System.out.println("오른쪽 회전");
		/* 오른쪽 회전 시 좌표 출력
		 * 2,0  1,0  0,0
		 * 2,1  1,1  0,1
		 * 2,2  1,2  0,2
		 */
		for (int i=0; i<row; i++) {
			for (int j=(col-1); j>=0; j--) {
				/*
				 * 행 i(0) / j(2) j(1) j(0)
				 * 행 i(1) / j(2) j(1) j(0)
				 * 행 i(2) / j(2) j(1) j(0)
				 */
				System.out.print(a[j][i] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("왼쪽 회전");
		/* 왼쪽 회전 시 좌표 출력
		 * 0,2  1,2  2,2
		 * 0,1  1,1  2,1
		 * 0,0  1,0  2,0
		 */
		for (int i=(row-1); i>=0; i--) {
			for (int j=0; j<col; j++) {
				/*
				 * 행 i(2) / j(0) j(1) j(2)
				 * 행 i(1) / j(0) j(1) j(2)
				 * 행 i(0) / j(0) j(1) j(2)
				 */
				System.out.print(a[j][i] + " ");
			}
			System.out.println();
		}
	}
}
