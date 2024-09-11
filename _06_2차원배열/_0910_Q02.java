package _06_2차원배열;

public class _0910_Q02 {

	public static void main(String[] args) {
		// 문제2
		// 2차원배열 a의 3번째 행에서 짝수의 값만 출력하시오.
		
		// 초기값
		int[][] a = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		
		for (int i=0; i<a[2].length; i++) {
			if ((a[2][i] % 2) == 0) {
				System.out.print(a[2][i] + " ");
			}
		}
		
		// 정리
		/*
		 * 3번째 행의 값을 구하기 전에 3번째 행은 몇번 인덱스에 있는지부터 알아야한다.
		 * 인덱스는 항상 0부터 n까지 시작하므로,
		 * 1 2 3 ... 5 번째
		 * 0 1 2 ... 4 인덱스
		 * 위와 같이 이루어져있기 때문에 a배열의 2번째 인덱스의 값을 출력하면 된다.
		 * a배열에 들어있는 2차원배열들의 값의 길이가 전부 1~5까지의 길이로 동일하나,
		 * 만약 각 2차원배열들의 길이가 서로 다르다면 i<5로 할 경우 에러가 발생하기 때문에 length 메소드를 사용하였다.
		 * 그리고 각 배열들의 값이 짝수인 경우만 찾아내야하므로 반복문 내에 조건문을 걸어주었으며
		 * 조건식으로 i번째 인덱스의 나머지 값이 0인 경우의 조건을 걸어주었다.
		 */
	}
}
