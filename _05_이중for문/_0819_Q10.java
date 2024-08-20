package _05_이중for문;

public class _0819_Q10 {

	public static void main(String[] args) {
		// 문제10
		// arr배열에서 0이 의미하는 것은 공터이다.
		// size는 건물의 크기이다. 건물은 하나만 짓는다. 공터는 연속적으로 있어야 한다.
		// size 설정값에 따라 공터에 건물을 지을 수 있는 위치는 모두 몇개인가?
		// ex) size가 2일 경우에는 7개이다.
		int[] arr = {1,0,0,0,1,1,1,0,0,0,0,1,1,1,1,0,0,0,1};	// 초기값
		int size = 2;											// 초기값(조정 가능)
		
		// size 1 = 3 4 3	10
		// size 2 = 2 3 2	7
		// size 3 = 1 2 1	4
		// size 4 = 0 1 0	1
		
		// field : 공터의 수
		// building : 건물의 수
		int field = 1, building = 0;
		for (int i=0; i<arr.length; i++) {		// arr배열의 마지막 인덱스까지 반복
			if (size == 1 && arr[i] == 0) {		// size가 1이고, arr배열의 1번째 값이 0일 경우의 조건
				building++;						// 건물의 수 증가(building++)
				continue;						// 반복문을 여기까지 실행 후 다시 시작
			}
			for (int j=i+1; j<arr.length; j++) {	// i+1부터 arr배열의 마지막 인덱스까지 반복
				if (arr[j] != arr[i]) {		// arr배열의 j번째 값이 i번째 값과 다를 경우
					field = 1;				// 공터의 수 초기화(1)
					i = j-1;				// 증감식(i++)으로 i값이 올라가도 다음 값으로 시작할 수 있도록 j-1의 값을 저장
					break;
				} else if (arr[j] == 1) {	// arr배열의 j번째 값이 1일 경우의 조건
					i = j-1;
					break;
				} else {					// 위 조건들에 아무것도 포함되지 않는 경우
					field++;				// 공터의 수 증가(field++)
					if (field == size) {	// 공터의 수가 size변수의 값과 같을 경우
						building++;			// 건물의 수 증가(building++)
						field = size - 1;	// 공터의 수에 size-1의 값을 저장
					}
				}
			}
		}
		System.out.println("지을 수 있는 건물의 수 : " + building + "개 \n");
		
		// 리팩토링
		int[] reArr = {1,0,0,0,1,1,1,0,0,0,0,1,1,1,1,0,0,0,1,0,0,0,0};	// 초기값
		int reSize = 2;											// 초기값(조정 가능)
		
		System.out.println(reArr.length);
		
		// size 1 = 3 4 3	10	13	14
		// size 2 = 2 3 2	7	9	10
		// size 3 = 1 2 1	4	5	6
		// size 4 = 0 1 0	1	1	2
		
		int reField = 1;		// 공터의 수
		int reBuilding = 0;		// 건물의 수
		for (int i=0; i<reArr.length; i++) {	// reArr의 마지막 인덱스까지 반복
			reField = 1;			// 반복문이 시작될 때 공터의 수 초기화(1)
			if (reArr[i] == 0) {	// reArr배열의 i번째 값이 공터(0)일 경우의 조건
				// reArr[i]의 값이 0이고 reSize가 1이면..
				// 사이즈가 1인 건물을 공터 1칸에 넣을 수 있기 때문에 빈 공터(0)가 존재하면 건물을 추가한다.
				if (reSize == 1) {
					reBuilding++;
				} else {
					// 현재 reArr[i]와 다음 reArr[i+1]의 값을 비교하기 위한 반복문
					for (int j=i+1; j<reArr.length; j++) {
						if (reArr[j] != 0) {	// reArr[j]의 값이 공터가 아닌 경우(1)
							// reArr의 값이 1인 곳부터 시작하도록 i의 값을 j-1로 변경
							// 반복문이 끝날 때 i++로 인해 증가되므로 -1을 붙여준다.
							i = j - 1;
							break;		// 반복문 종료
						} else {
							reField++;	// 공터 수 증가(reField++)
							if (reField == reSize) {	// 공터 수가 사이즈와 같을 경우의 조건
								reBuilding++;			// 건물 추가(reBuilding++)
								// 공터의 수를 reSize-1로 만들어 주면, 다음 공터가 연이어 존재할 때마다 계산할 수 있게 된다.
								reField = reSize - 1;
							}
						}
						i++;	// 현재 i를 다음 i로 바꿔주기 위한 증가식
					}
				}
			}
		}
		System.out.println("건물의 수 : " + reBuilding);
	}

}
