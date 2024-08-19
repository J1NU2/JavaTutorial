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
		
		int cnt = 1;
		int building = 0;
		for (int i=0; i<arr.length; i++) {
			if (size == 1 && arr[i] == 0) {
				building++;
				continue;
			}
			for (int j=i+1; j<arr.length; j++) {
				if (arr[j] != arr[i]) {
					cnt = 1;
					i = j-1;
					break;
				} else if (arr[j] == 1) {
						i = j-1;
						break;
				} else {
					cnt++;
					if (cnt == size) {
						building++;
						cnt = size - 1;
					}
				}
			}
		}
		System.out.println("지을 수 있는 건물의 수 : " + building + "개");
		
//		int cnt = 0;
//		int building = 0;
//		for (int i=0; i<arr.length; i++) {
//			if (arr[i] == 0) {
//				cnt++;
//				if (cnt == size) {
//					building++;
//					cnt = size - 1;
//				}
//			} else {
//				cnt = 0;
//			}
//		}
//		System.out.println(building);
	}

}
