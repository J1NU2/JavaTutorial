package _06_2차원배열;

public class _0910_Q04 {

	public static void main(String[] args) {
		// 문제4
		// 전체 배열의 값 중 짝수는 모두 몇 개인가?
		
		// 초기값
		int[][] a = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		int count = 0;
		
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a[i].length; j++) {
				if ((a[i][j] % 2) == 0) {
					count++;
				}
			}
		}
		System.out.println("2차원배열 a의 짝수의 수 : " + count);
	}
}
