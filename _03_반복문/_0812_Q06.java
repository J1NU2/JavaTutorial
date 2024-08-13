package _03_반복문;

public class _0812_Q06 {

	public static void main(String[] args) {
		// 문제6
		// 수식을 계산하는 프로그램을 작성하세오.
		// 수식 계산 규칙은 연산자 우선순위 없이 앞에서부터 차례대로 계산한다.
		// 지금까지 공부한 내용으로만 해결하고, 형 변환만 검색이 가능하다.
		// 메서드는 최대한 적게 사용하시오.
		String a ="23-56+45*2-56";	// 초기값
		
		String text = "";			// 문자열 a에서 숫자를 담을 변수
		char arithmetic = '?';		// 문자열 a에서 연산자를 담을 변수
		int result = 0;				// 문자열 a의 사칙연산 최종값을 담을 변수
		for (int i=0; i<a.length(); i++) {		// 0부터 문자열 a의 마지막 인덱스까지 반복
			// ASCII Code에서 47을 기준으로 47이 넘어가면(48~) 0 1 2 3 4 ... 등의 숫자를
			// 47 이하라면 / . - , + * ... 등의 사칙연산자가 나오게 된다.
			// 문자열 a의 i번째의 문자가 47보다 클 경우의 조건(만약 숫자라면)
			if ((int)a.charAt(i) > 47) {
				text += a.charAt(i);	// 문자열 변수인 text에 문자열 a의 i번째 문자를 추가한다.
			} else {
				// 1. result 연산자= Integer.parseInt(text); : 
				// > text가 문자열이므로 형변환을 위해 parseInt를 사용하여 정수형으로 파싱한 뒤 result 변수에 사칙연산을 진행
				// 2. text = ""; : 사칙연산을 진행한 뒤 숫자가 담겨져 있는 문자열 text의 값을 초기화
				// 3. arithmetic = '?'; : 사칙연산을 진행한 뒤 연산자가 담겨져 있는 문자열 arithmetic의 값을 초기화
				if (result == 0) {	// 맨 처음 숫자 다음으로 연산자가 나온 경우의 조건 (a문자열의 23- 부분)
					result += Integer.parseInt(text);
					text = "";
				} else if (arithmetic == '+') {			// arithmetic의 문자가 + 일 경우의 조건
					result += Integer.parseInt(text);
					text = "";
					arithmetic = '?';
				} else if (arithmetic == '-') {			// arithmetic의 문자가 - 일 경우의 조건
					result -= Integer.parseInt(text);
					text = "";
					arithmetic = '?';
				} else if (arithmetic == '*') {			// arithmetic의 문자가 * 일 경우의 조건
					result *= Integer.parseInt(text);
					text = "";
					arithmetic = '?';
				} else if (arithmetic == '/') {			// arithmetic의 문자가 / 일 경우의 조건
					result /= Integer.parseInt(text);
					text = "";
					arithmetic = '?';
				} else if (arithmetic == '%') {			// arithmetic의 문자가 % 일 경우의 조건
					result %= Integer.parseInt(text);
					text = "";
					arithmetic = '?';
				}
				arithmetic = a.charAt(i);				// arithmetic를 a문자열의 i번째 사칙연산자로 변경
			}
		}	// for반복문 종료
		
		// 마지막 값을 계산하기 위한 조건문
		if (arithmetic == '+') {				// arithmetic의 문자가 + 일 경우의 조건
			result += Integer.parseInt(text);
		} else if (arithmetic == '-') {			// arithmetic의 문자가 - 일 경우의 조건
			result -= Integer.parseInt(text);
		} else if (arithmetic == '*') {			// arithmetic의 문자가 * 일 경우의 조건
			result *= Integer.parseInt(text);
		} else if (arithmetic == '/') {			// arithmetic의 문자가 / 일 경우의 조건
			result /= Integer.parseInt(text);
		} else if (arithmetic == '%') {			// arithmetic의 문자가 % 일 경우의 조건
			result %= Integer.parseInt(text);
		}
		System.out.println(result);				// 최종값 출력
	}

}
