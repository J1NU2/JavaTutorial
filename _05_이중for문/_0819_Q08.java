package _05_이중for문;

public class _0819_Q08 {

	public static void main(String[] args) {
		// 문제8
		// 애니팡 게임의 일부분이다.
		// 게임의 캐릭터는 숫자로 구분한다.
		// 가로에 같은 캐릭터가 3개 이상이면 제거 대상이다.
		// 제거 대상 캐릭터 번호와 갯수, 시작위치 인덱스를 모두 출력하시오. (이중for사용)
		int[] pang = {1,0,0,0,2,3,4,4,6,2,2,2,2,5};		// 초기값
		
		// 0 3 1
		// 2 4 9
		// 5 3 13	만약, 인덱스 끝이 5,5,5 라면
		
		// number : 제거할 번호
		// count : 제거할 번호의 갯수
		// startIndex : 제거할 번호의 시작 위치
		// index : 인덱스를 저장할 변수
		int number = 0, count = 1, startIndex = 0, index = 0;
		for (int i=0; i<pang.length-1; i++) {	// pang배열의 마지막 인덱스 전까지 반복
			index++;	// 인덱스 카운트 증가
			for (int j=i; j<pang.length; j++) {	// pang배열의 마지막 인덱스까지 반복
				startIndex = j+1;				// 시작 위치에 현재위치(j)+1의 값을 저장
				// 1. pang배열의 i번째의 값과 그 다음 인덱스인 i+1번째의 값이 다르거나
				// 2. i+2의 값이 pang배열의 최대 길이와 같은 경우의 조건
				if (pang[i] != pang[i+1] || (i+2) == pang.length) {
					startIndex -= index;	// 시작 위치에서 저장된 인덱스 카운트만큼을 뺀 값을 시작 위치에 저장
					index = 0;				// 인덱스 카운트 초기화(0)
					break;					// 반복문 종료
				}
			}
			if (pang[i] == pang[i+1]) {		// pang배열의 i번째 값과 그 다음 인덱스인 i+1번째 값이 같은 경우의 조건
				number = pang[i+1];			// 번호에 pang배열의 i+1번째 값을 저장
				count++;					// 카운트 증가
				// 1. i+2의 값이 pang배열의 최대 길이면서
				// 2. 갯수가 3 이상일 경우의 조건
				if ((i+2) == pang.length && count >= 3) {
					System.out.println(number + " / " + count + " / " + startIndex);
				}
			} else if (pang[i] != pang[i+1]) {	// pang배열의 i번째 값과 그 다음 인덱스인 i+1의 값이 다를 경우의 조건
				if (count >= 3) {				// 갯수가 3개 이상일 경우의 조건
					System.out.println(number + " / " + count + " / " + startIndex);
				}
				count = 1;		// 갯수 초기화(1)
			}
		}
		
	}

}
