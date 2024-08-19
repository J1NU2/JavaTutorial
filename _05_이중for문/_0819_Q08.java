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
		
		int number = 0, count = 1, startIndex = 0, index = 0;
		for (int i=0; i<pang.length-1; i++) {
			index++;
			for (int j=i; j<pang.length; j++) {
				startIndex = j+1;
				if (pang[i] != pang[i+1] || (i+2) == pang.length) {
					startIndex -= index;
					index = 0;
					break;
				}
			}

			if (pang[i] == pang[i+1]) {
				number = pang[i+1];
				count++;
				if ((i+2) == pang.length && count >= 3) {
					System.out.println(number + " / " + count + " / " + startIndex);
				}
			} else if (pang[i] != pang[i+1]) {
				if (count >= 3) {
					System.out.println(number + " / " + count + " / " + startIndex);
				}
				count = 1;
			}
		}
		
	}

}
