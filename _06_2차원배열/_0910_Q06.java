package _06_2차원배열;

public class _0910_Q06 {

	public static void main(String[] args) {
		// 문제6
		// 2차원배열의 모든 값을 출력하시오.
		// 출력할 때 행의 번호는 내림차순, 열의 번호도 내림차순으로 출력하시오.
		
		// 초기값
		int[][] a = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		
		for (int i=a.length-1; i>=0; i--) {
			for (int j=a[i].length-1; j>=0; j--) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println("");
		}
	}
}
