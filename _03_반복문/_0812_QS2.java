package _03_반복문;

public class _0812_QS2 {

	public static void main(String[] args) {
		// 특별2
		// 문자열 a는 해충에 대한 숫자를 카운팅한 결과이다.
		// 해충의 갯수를 모두 합하시오.
		// 조건 : 형변환이 필요하다면 사용한다. 메서드는 charAt()만 사용한다.
		String a ="67/414/1/23/32/45/54/12/11/232";		// 초기값
		
		// 문자 <-> 숫자 형변환은 Integer.parseInt() 또는 Integer.valueOf()를 사용해야 한다.
		
		String vermin = "";		// 해충의 수를 담을 문자열 변수
		int result = 0;			// 해충의 총합을 담을 정수형 변수
		for (int i=0; i<a.length(); i++) {	// 0부터 문자열 a의 마지막 인덱스까지 반복
			if (a.charAt(i) == '/') {		// charAt메소드로 떼어낸 문자가 '/'일 경우의 조건
				// Integer.parseInt() : 문자열을 그대로 파싱하여 int 객체로 바꿔준다.
				result += Integer.parseInt(vermin);		// 문자열 vermin을 그대로 파싱하여 정수형으로 변환한다.
				vermin = "";							// 문자열 vermin 초기화 ("")
			} else {
				vermin += a.charAt(i);					// 문자열 vermin에 a문자열에서 charAt한 문자를 추가한다.
			}
		}
		// 마지막으로 추가된 vermin 문자열을 result값에 추가하기 위해 해당 문자열을 파싱하여 정수형으로 변환한 뒤 result값에 더한다.
		result += Integer.parseInt(vermin);
		System.out.println("해충의 총합 : " + result);
	}

}
