package _06_2차원배열;

public class _0911_Tetris {

	public static void main(String[] args) {
		// 테트리스 회전 문제
		// 초기값
		int[][] tetris = { { 1 , 1 , 0 } , 
						{ 0 , 1 , 0 } , 
						{ 0 , 1 , 1 } };
		
		// 오른쪽 회전
		/*
		 * {{ 1 , 1 , 0 }, 			{{ 0 , 0 , 1 },
		 * 	{ 0 , 1 , 0 },	  → 	 { 1 , 1 , 1 },
		 *  { 0 , 1 , 1 }};			 { 1 , 0 , 0 }};
		 */
		int row = tetris.length;
		int col = tetris[0].length;
		
		for (int i=0; i<row; i++) {
			for (int j=0; j<col; j++) {
				// System.out.print(i + "," + j + " ");			// 행,열 확인
				if (i != 1 || j != 1) {
					// System.out.print(i + "," + j + " ");		// 중앙이 아닌 행과 열 확인
					if (tetris[i][j] == 1) {		// 값이 있으면 0으로 전환, 없으면 1로 전환
						tetris[i][j] = 0;
						System.out.print(tetris[i][j] + " ");
					} else {
						tetris[i][j] = 1;
						System.out.print(tetris[i][j] + " ");
					}
				} else {
					System.out.print(tetris[i][j] + " ");
					// System.out.print("... ");				// 중앙인 행과 열 확인
				}
			}
			System.out.println("");
		}
	}
}
