package _06_2차원배열;

public class _0910_Q01 {

	public static void main(String[] args) {
		// 문제1
		// 2차원배열 a의 2번째 행의 모든 값을 출력하시오.
		
		// 초기값
		int[][] a = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		
		for (int i=0; i<a[1].length; i++) {
			System.out.print(a[1][i] + " ");
		}
	}
}
