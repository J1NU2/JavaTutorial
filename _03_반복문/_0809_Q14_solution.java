package _03_반복문;

public class _0809_Q14_solution {

	public static void main(String[] args) {
		// 문제14 : 심화문제
		// 해당 문자열을 압축하시오.
		// 압축 방법 : a2b3c3a4d2b3a5	// 2334235
		String ttt ="aabbbcccaaaaddbbbaaaaa";		// 초기값
		
		// 1. ttt는 자료형이 String이기 때문에 참조타입이다.
		// 2. for문 사용 : ttt문자열의 최대 길이까지 반복한다.
		// 3. if문 조건 : 이전 글자가 현재 글자와 같다면?
		// > 참 : 카운트 증가(cnt++)
		// > 거짓 : 최종 텍스트에 이전 글자와 현재 카운트를 더하고, 이전 글자를 현재 글자로 변경한 뒤 카운트 초기화(cnt=1)
		// 4. if문 조건 : 터널의 최대 길이보다 현재 터널의 길이가 크다면?
		// > 최대 길이를 현재 길이로 바꿔주고, 최대 길이에 해당되는 글자를 저장한다.
		// 5. 최종 텍스트에 마지막 글자와 카운트를 추가한다.

		int cnt = 0;		// 터널을 카운팅하기 위한 변수
		int maxLength = 0;	// 터널의 최대 길이를 저장할 변수
		char bT = ttt.charAt(0);	// 최대 길이에 해당되는 숫자를 저장할 변수
		char maxChar = '0';			// 최대 길이에 해당되는 글자를 저장할 변수
		String resultText = "";		// 최종 텍스트를 저장할 변수
		for (int i=0; i<ttt.length(); i++) {
			char text = ttt.charAt(i);	// ttt문자열의 인덱스에 해당되는 글자를 text변수에 저장 (현재 글자)
			if (bT == text) {	// 3
				cnt++;
			} else {
				resultText = resultText + bT + cnt;
				bT = text;
				cnt = 1;
			}
			if (maxLength < cnt) {	// 4
				maxLength = cnt;
				maxChar = bT;
			}
		}
		resultText = resultText + bT + cnt;	// 5
		
		System.out.println(resultText);
		System.out.println(maxChar + " " + maxLength);
	}

}
