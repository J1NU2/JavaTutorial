package _03_반복문;

public class _0809_Q12_solution {

	public static void main(String[] args) {
		// 문제12 : 심화문제
		// 숫자는 터널의 번호이다.
		// 터널의 길이가 가장 긴 숫자와 길이를 출력하시오.
		int[] arr = {1,2,3,0,0,0,1,2,3,4,5,2,2,2,2,0,0,0,0,0,3,3};	// 초기값
		
		// 1. for문으로 배열 순회 : 초기값은 0부터 조건(arr배열의 길이까지), i는 배열의 인덱스이다.
		// 2. if문으로 조건 확인 : arr[i]의 값이 연속된 터널인지 아닌지 판별 (arr[i] == bT)
		// : 카운팅한 값을 저장할 변수 cnt와 이전 터널의 값을 저장할 변수 bT 선언
		// > 만약 참이라면 : 카운팅 (cnt++;)
		// > 만약 거짓이라면 : 카운팅 초기화 (cnt=1;)
		// 3. 제일 긴 터널과 긴 터널의 길이를 저장할 변수를 선언 (maxLength, maxT)
		// : 만약 cnt의 값이 maxLength의 값보다 클 경우
		// > maxLength의 값을 cnt의 값으로 변경
		// > maxT의 값을 bT의 값으로 변경

		int cnt = 0;		// 터널을 카운팅하기 위한 변수
		int maxLength = 0;	// 터널의 최대 길이를 저장할 변수
		int bT = arr[0];	// 이전 터널의 숫자를 저장할 변수
		int maxT = 0;		// 최대 길이에 해당되는 숫자를 저장할 변수
		for (int i=0; i<arr.length; i++) {
			if (arr[i] == bT) {
				cnt++;
			} else {
				bT = arr[i];
				cnt = 1;
			}
			// System.out.println(i + " : " + cnt);
			if (cnt > maxLength) {
				maxLength = cnt;
				maxT = bT;
			}
		}
		System.out.println(maxT + " " + maxLength);
	}

}
