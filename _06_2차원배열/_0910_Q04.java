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
		
		// 정리
		/*
		 * 우선 짝수의 갯수를 카운팅하기 위해 반복문을 시작하기 전 갯수를 저장할 정수형 변수 count를 선언하였다.
		 * 배열 a의 최대길이는 5일 때, 인덱스는 0부터 시작하므로 0~4의 5개의 인덱스를 가진다.
		 * length 메소드는 최대길이를 가져오기 때문에 반복문의 i,j값을 0으로 주고 i,j보다 최대길이가 클 때까지 반복 조건을 걸어주었다.
		 * 반복문이 종료된 뒤 i,j를 1씩 상승시키기 위해 증감식(++)을 사용하였다.
		 * 2차원배열의 짝수의 값만 찾아내야 하므로 이중for문 내에 i번째 인덱스(행)와 j번째 인덱스(열)의 값을 2로 나눈 나머지가 0일 조건을 만들어주었다.
		 * 위 조건을 만족할 때 변수 count를 1씩 상승시키도록 증감식(++)을 사용하였다.
		 * 이후 짝수의 수를 알아보기 위해 모든 반복문이 종료된 후 count변수에 저장된 값을 출력하였다.
		 */
	}
}
