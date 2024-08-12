package _03_반복문;

public class _0812_Q06 {

	public static void main(String[] args) {
		// 문제6
		// 수식을 계산하는 프로그램을 작성하세오.
		// 수식 계산 규칙은 연산자 우선순위 없이 앞에서부터 차례대로 계산한다.
		// 지금까지 공부한 내용으로만 해결하고, 형 변환만 검색이 가능하다.
		// 메서드는 최대한 적게 사용하시오.
		String a ="23-56+45*2-56";	// 초기값
		
		String bT = "";
		String nT = "";
		String arithmetic = "";
		String result = "";
		for (int i=0; i<a.length(); i++) {
			if ((int)a.charAt(i) > 47) {
				nT += a.charAt(i);
			} else {
				arithmetic += a.charAt(i);
				bT = nT;
				nT = "";
			}
		}
		System.out.println(nT);
	}

}
