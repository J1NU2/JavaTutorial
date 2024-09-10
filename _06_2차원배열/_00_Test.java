package _06_2차원배열;


public class _00_Test {

	public static void main(String[] args) {
		/* 
		 * 2차원배열
		 * 배열 안에 또 다른 배열이 있는 것
		 * 행과 열로 구성된 배열
		 */
		
		// 2차원배열 자료형을 저장할 배열을 선언 (정수형)
		// 2차원배열 a,b는 행이 5(0~4), 열이 4(0~3)
		int[][] a = new int[5][4];
		a[1][2] = 50;
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println();
		
		int[][] b = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},{17,18,19,20}};
		for (int i=0; i<b.length; i++) {
			for (int j=0; j<b[i].length; j++) {
				System.out.print(b[i][j]+"\t");
			}
			System.out.println();
		}
		
		
	}

}
