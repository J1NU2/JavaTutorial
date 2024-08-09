package _03_반복문;

public class _0809_Q12 {

	public static void main(String[] args) {
		// 문제12 : 심화문제
		// 숫자는 터널의 번호이다.
		// 터널의 길이가 가장 긴 숫자와 길이를 출력하시오.
		int[] arr = {1,2,3,0,0,0,1,2,2,4,2,2,2,2,2,2,0,0,0,0,0,3,3};
		// prevN : 이전 숫자, presN : 현재 숫자, maxTunnelNumber : 가장 큰 터널 길이의 숫자
		// tunnel : 터널 길이, maxTunnel : 가장 큰 터널 길이
		int prevN = 0, presN = 0, maxTunnelNumber = 0, tunnel = 1, maxTunnel = 0;
		for (int i=0; i<arr.length; i++) {
			presN = arr[i];			// 현재 숫자에 i번째 배열값 저장
			if (presN != prevN) {	// 현재 숫자의 값이 이전 숫자의 값이 아니라면
				prevN = presN;		// 이전 숫자에 현재 숫자의 값 저장
				tunnel = 1;			// 그리고 터널 길이 초기화(1)
			} else {				// ~ 값이 맞다면
				tunnel++;			// 터널 길이 추가(+1)
				if (tunnel > maxTunnel) { 		// 현재 터널 길이가 가장 클 경우
					maxTunnel = tunnel;			// 가장 큰 터널의 길이에 현재 터널의 길이 저장
					maxTunnelNumber = presN;	// 가장 큰 터널을 가진 숫자에 현재 숫자를 저장
				}
			}
		}
		System.out.println("가장 긴 터널 번호 : " + maxTunnelNumber + ", 길이 : " + maxTunnel);
	}

}
