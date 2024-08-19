package _05_이중for문;

public class _0819_Q09 {

	public static void main(String[] args) {
		// 문제9
		// 가장 긴 터널의 알파벳 이름과 길이를 찾으시오. (이중for사용)
		String ttt = "aabbbcccaaaaddbbbaaaaaa";		// 초기값
		
		char prevT = '0', maxTunnelText = '0';
		int tunnel = 1, maxTunnel = 0;
		for (int i=0; i<ttt.length(); i++) {
			if (ttt.charAt(i) != prevT) {
				prevT = ttt.charAt(i);
				tunnel = 1;
			} else {
				tunnel++;
			}
			for (int j=i; j<ttt.length(); j++) {
				if (tunnel > maxTunnel) {
					maxTunnel = tunnel;
					maxTunnelText = ttt.charAt(i);
					break;
				}
			}
		}
		System.out.println("가장 긴 터널 알파벳 : " + maxTunnelText + ", 길이 : " + maxTunnel);
	}

}
