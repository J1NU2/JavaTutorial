package _06_2차원배열;

public class _0910_Q05 {

	public static void main(String[] args) {
		// 문제5
		// 전체 배열의 값 중 홀수를 0으로 마스킹하고, 마스킹 된 결과인 2차원배열을 출력하시오.
		/*
		 * 출력은
		 * 0 2 0 4 0
		 * 6 0 8 0 10
		 */
		// 위와 같은 패턴으로 모두 출력되어야한다.
		
		// 초기값
		int[][] a = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a[i].length; j++) {
				if ((a[i][j] % 2) == 1) {
					a[i][j] = 0;
					System.out.print(a[i][j] + " ");
				} else {
					System.out.print(a[i][j] + " ");
				}
			}
			System.out.println("");
		}
		
		// 정리
		/*
		 * 배열 a의 최대길이는 5일 때, 인덱스는 0부터 시작하므로 0~4의 5개의 인덱스를 가진다.
		 * length 메소드는 최대길이를 가져오기 때문에 반복문의 i,j값을 0으로 주고 i,j보다 최대길이가 클 때까지 반복 조건을 걸어주었다.
		 * 반복문이 종료된 뒤 i,j를 1씩 상승시키기 위해 증감식(++)을 사용하였다.
		 * 2차원배열의 홀수의 값만 찾아내야 하므로 이중for문 내에 i번째 인덱스(행)와 j번째 인덱스(열)의 값을 2로 나눈 나머지가 1일 조건을 만들어주었다.
		 * 위 조건을 만족할 때 i번째 인덱스(행)와 j번째 인덱스(열)의 값을 마스킹 해야하므로 a[i][j]에 0을 저장하였다.
		 * 조건이 아닐 경우에는 마스킹을 하지 않고 그대로 출력하도록 하였다.
		 */
	}
}
