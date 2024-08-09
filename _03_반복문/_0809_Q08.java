package _03_반복문;

public class _0809_Q08 {

	public static void main(String[] args) {
		// 문제8 : 응용문제
		// 변수, 연산자, 조건문, 반복문을 생각할 것
		// 해당 코드를 분석하여 a문자열에 a가 몇개 있는지 구하는 프로그램을 작성하시오.
		String test = "abcdeabce";		// 초기값
		int cnt = 0;					// 갯수를 저장할 변수
		for(int i=0; i<9; i++){			// 0부터 8까지 반복
			char aaa = test.charAt(i);	// charAt : String 형태의 문자열을 char 형태로 하나씩 분리하는 메소드
			System.out.println(aaa);
			if (aaa == 'a') {			// 자른 문자열의 문자가 'a'일 경우의 조건
				cnt++;					// 카운트 증가
			}
	    }
		System.out.println("a는 몇개 있는가? : " + cnt);
	}

}
