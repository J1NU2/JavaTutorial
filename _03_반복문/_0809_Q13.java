package _03_반복문;

public class _0809_Q13 {

	public static void main(String[] args) {
		// 문제13 : 심화문제
		// 가장 긴 터널의 알파벳 이름과 숫자를 찾으세요.
		String ttt ="aabbbcccaaaaddbbbaaaaa";		// 초기값
		// prevT : 이전 글자, presT : 현재 글자, maxTunnelText : 가장 큰 터널 길이의 글자
		// tunnel : 터널 길이, maxTunnel : 가장 큰 터널 길이
		char prevT = '0', maxTunnelText = '0';
		int tunnel = 1, maxTunnel = 0;
		for (int i=0; i<ttt.length(); i++) {
			char presT = ttt.charAt(i);	// 현재 글자에 문자열 ttt의 i번째 글자 저장
			if (presT != prevT) {		// 현재 글자가 이전 글자와 같지 않다면
				prevT = presT;			// 이전 글자에 현재 글자 저장
				tunnel = 1;				// 그리고 터널 길이 초기화(1)
			} else {					// ~ 글자가 같다면
				tunnel++;				// 터널 길이 추가(+1)
				if (tunnel > maxTunnel) { 	// 현재 터널 길이가 가장 클 경우
					maxTunnel = tunnel;		// 가장 큰 터널의 길이에 현재 터널의 길이 저장
					maxTunnelText = presT;	// 가장 큰 터널을 가진 글자를 저장
				}
			}
		}
		System.out.println("가장 긴 터널 알파벳 : " + maxTunnelText + ", 길이 : " + maxTunnel);
	}

}
