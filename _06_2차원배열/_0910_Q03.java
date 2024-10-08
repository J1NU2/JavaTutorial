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
		
		// 정리
		/*
		 * 배열 a의 최대길이는 5일 때, 인덱스는 0부터 시작하므로 0~4의 5개의 인덱스를 가진다.
		 * length 메소드는 최대길이를 가져오기 때문에 반복문의 i,j값을 0으로 주고 i,j보다 최대길이가 클 때까지 반복 조건을 걸어주었다.
		 * 반복문이 종료된 뒤 i,j를 1씩 상승시키기 위해 증감식(++)을 사용하였다.
		 * 2차원배열의 3번째 열만 찾아내야 하므로 이중for문 내에 인덱스가 2일 경우의 조건을 걸어주었다.
		 */
	}
}
