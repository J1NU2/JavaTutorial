package _06_2차원배열;

public class _0910_Q03 {

	public static void main(String[] args) {
		// 문제3
		// 2차원배열의 3번째 열의 모든 값을 순서대로 출력하시오.
		// 예시) 3 8 13 18 23
		
		// 초기값
		int[][] a = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a[i].length; j++) {
				if (j == 2) {
					System.out.print(a[i][j] + " ");
				}
			}
		}
	}
}
