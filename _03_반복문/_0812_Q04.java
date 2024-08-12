package _03_반복문;

public class _0812_Q04 {

	public static void main(String[] args) {
		// 문제4
		// arr 배열에서 0이 의미하는 것은 공터이다.
		// size는 건물의 크기이다. 건물은 하나만 짓는다. 공터는 연속적으로 있어야 한다.
		// size 설정값에 따라 공터에 건물을 지을 수 있는 위치는 모두 몇개인가?
		// ex) size가 2일 경우에는 7개이다.
		int[] arr = {1,0,0,0,1,1,1,0,0,0,0,1,1,1,1,0,0,0,1};	// 초기값
		int size = 2;											// 초기값(조정 가능)
		// size 1 = 3 4 3	10
		// size 2 = 2 3 2	7
		// size 3 = 1 2 1	4
		// size 4 = 0 1 0	1
		
		int cnt = 0;						// 공터의 수를 카운트할 변수
		int building = 0;					// 건물의 수를 저장할 변수
		for (int i=0; i<arr.length; i++) {	// 0부터 letter 배열의 최대 길이까지 반복
			if (arr[i] == 0) {				// arr[i]의 값이 공터(0)일 경우의 조건
				cnt++;						// 공터의 수 카운트(cnt++)
				if (cnt == size) {			// 공터의 수가 초기값 크기(size)와 동일할 경우의 조건
					building++;				// 건물 수 증가(building++)
					cnt = size - 1;			// 공터의 수에 크기(size)-1의 값으로 초기화
				}
			} else {						// 공터(0)가 아닌 경우
				cnt = 0;					// 공터의 수를 초기화(cnt=0)
			}
		}
		System.out.println(building);
	}

}
