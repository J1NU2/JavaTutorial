package _05_이중for문;

public class _0819_Q09 {

	public static void main(String[] args) {
		// 문제9
		// 가장 긴 터널의 알파벳 이름과 길이를 구하시오. (이중for사용)
		String ttt = "aabbbcccaaaaddbbbaaaaaa";		// 초기값
		
		// prevT : 이전 문자
		// maxTunnelText : 최대 길이인 문자
		// tunnel : 터널의 길이
		// maxTunnel : 가장 긴 터널의 길이
		char prevT = '0', maxTunnelText = '0';
		int tunnel = 1, maxTunnel = 0;
		for (int i=0; i<ttt.length(); i++) {	// ttt배열의 최대 인덱스까지 반복
			if (ttt.charAt(i) != prevT) {		// ttt배열의 i번째 값이 이전 문자와 다른 경우의 조건
				prevT = ttt.charAt(i);			// 이전 문자에 현재 문자인 ttt배열의 i번째 값을 저장
				tunnel = 1;						// 터널의 길이 초기화(1)
			} else {
				tunnel++;						// 아니라면? 터널의 길이 증가(tunnel++)
			}
			for (int j=i; j<ttt.length(); j++) {	// 
				if (tunnel > maxTunnel) {			// 터널의 길이가 저장된 가장 긴 터널의 길이보다 클 경우
					maxTunnel = tunnel;				// 가장 긴 터널의 길이를 현재 터널의 길이 변경
					maxTunnelText = ttt.charAt(i);	// 가장 긴 터널의 문자를 현재 문자(ttt배열의 i번째 값)를 저장
					break;							// 반복문 종료
				}
			}
		}
		System.out.println("가장 긴 터널 알파벳 : " + maxTunnelText + ", 길이 : " + maxTunnel);
		
		// 리팩토링1
		String aaa = "aabbbcccaaaaddbbbaaaaaa";		// 초기값
		// a중 가장 긴 a찾기
		// for a는 aaa문자열의 index
		// for b는 aaa문자열의 길이 중 문자 a의 위치까지
		int aCnt = 0, aMaxCnt = 0;
		for (int a=0; a<aaa.length(); a++) {
			aCnt = 0;						// 반복문이 시작될 때 카운트 초기화
			char temp = aaa.charAt(a);
			if (temp == 'a') {				// aaa문자열의 a위치의 문자가 'a'일 경우의 조건
				for (int b=a; b<aaa.length(); b++) {
					if (aaa.charAt(b) != 'a') {
						break;				// aaa문자열의 b index의 문자가 'a'가 아니라면 반복문 종료
					} else {
						aCnt++;				// aaa문자열의 b index의 문자가 'a'라면 카운트 증가
					}
				}
				if (aMaxCnt < aCnt) {		// 최대 길이를 저장하는 조건식
					aMaxCnt = aCnt;
				}
				// a : 현재 a의 위치
				// aCnt : 마지막 a의 위치
				// a가 존재하는 for문이 끝날 때 a++로 인해 증가되므로 -1
				a = a + aCnt - 1;
			}
		}
		System.out.println("문자'a'의 최대 길이 : " + aMaxCnt);
		
		// 리팩토링2
		String str = "aabbbcccaaaaddbbbaaaaaa";		// 초기값
		// str문자열에서 가장 긴 길이를 지닌 알파벳과 길이를 구하시오.
		int count = 0, maxCount = 0;
		char maxText = ' ';
		for (int i=0; i<str.length(); i++) {
			count = 0;							// 반복문이 시작될 때 카운트 초기화
			char text = str.charAt(i);			// str문자열의 i인덱스, 현재 문자를 저장할 변수
			for (int j=i; j<str.length(); j++) {
				if (str.charAt(j) != text) {	// str문자열의 i인덱스와 j인덱스의 문자가 같지 않을 경우 반복문 종료
					break;
				} else {						// str문자열의 i인덱스와 j인덱스의 문자가 같을 경우의 조건
					count++;					// 카운트 증가 (길이)
				}
			}
			if (maxCount < count) {				// 저장된 문자의 길이가 가장 긴 길이보다 클 경우의 조건
				maxCount = count;				// 현재 길이를 가장 긴 길이를 저장하는 변수 maxCount에 저장
				maxText = text;					// 현재 문자를 maxText변수에 저장
			}
			// i : 현재 i의 위치
			// count : 마지막 i의 위치
			// i가 존재하는 for문이 끝날 때 i++로 인해 증가되므로 -1
			i = i + count - 1;		// 새로운 문자의 위치부터 시작하기 위한 식
		}
		System.out.println("가장 긴 알파벳 : " + maxText + ", 길이 : " + maxCount);
	}

}
