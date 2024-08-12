package _03_반복문;

public class _0809_Q11_solution {

	public static void main(String[] args) {
		// 문제11 : 심화문제
		// 0은 터널이다.
		// 가장 긴 터널의 길이를 구하시오.
		int[] arr = {1,2,3,0,0,0,1,2,3,4,5,2,2,2,2,0,0,0,0,0,3,3};	// 초기값
		
		// 1. for문으로 배열 순회 : 초기값은 0부터 조건(arr배열의 길이까지), i는 배열의 인덱스이다.
		// 2. if문으로 조건 확인 : arr[i]의 값이 터널인지 아닌지 판별 (arr[i] == 0)
		// : 카운팅한 값을 저장할 변수 cnt 선언
		// > 만약 참이라면 : 카운팅 (cnt++;)
		// > 만약 거짓이라면 : 카운팅 초기화 (cnt=0;)
		// 3. 제일 긴 터널의 길이를 저장 : 긴 터널의 길이값을 저장하기 위한 변수 maxLength 선언
		// > 만약 cnt의 값이 maxLength의 값보다 클 경우 : maxLength의 값을 cnt의 값으로 변경

		int cnt = 0;		// 터널을 카운팅하기 위한 변수
		int maxLength = 0;	// 터널의 최대 길이를 저장할 변수
		for (int i=0; i<arr.length; i++) {
			// System.out.println(arr[i]);
			if (arr[i] == 0) {			// 터널 카운팅을 위한 조건
				cnt++;
			} else {
				cnt = 0;
			}
			// System.out.println(i + " : " + cnt);
			if (cnt > maxLength) {		// 최대 길이의 터널을 저장하기 위한 조건
				maxLength = cnt;
			}
		}
		System.out.println(maxLength);
	}

}
