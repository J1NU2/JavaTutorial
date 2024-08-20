package _05_이중for문;

public class _0819_Q07 {

	public static void main(String[] args) {
		// 문제7
		// 거스름돈 구하기
		// 10000원짜리 0개, 1000원짜리 0개, 100짜리 0개, 10짜리 0개
		// 조건 : /나 %연산자는 각 최대 2번씩 사용 가능
		// 단, 거스름돈은 만천원이 최대값이다.
		int money = 4570;	// 가격
		int pay = 10000;	// 지불금액
		// = 5430원
		int cnt = 0, change = pay - money;	// n원짜리 갯수와 거스름돈을 저장할 변수
		for (int i=10000; i>1; i/=10) {		// n원짜리 값을 계산하기 위한 반복문 (10000 1000 100 10)
			// 1회	5430/10000	cnt=0
			// 2회	5430/1000	cnt=5
			// 3회	5430/100	cnt=54
			// 4회	5430/10		cnt=543
			cnt = (change)/i;		// n원짜리 값의 갯수를 cnt변수에 저장
			if (cnt > 10) {			// n원짜리 값을 구할 때 최소값이 10원이므로, cnt가 10보다 클 때의 조건
				// 1회	0%10	cnt=0
				// 2회	5%10	cnt=5
				// 3회	54%10	cnt=4
				// 4회	543%10	cnt=3
				cnt %= 10;			// cnt의 값에서 10으로 나눈 값의 나머지를 cnt에 저장
			}
			System.out.print(i + "원짜리 " + cnt + "개 ");
		}
		System.out.println();
		
		// 문자,문자열 형식으로 계산 : toString 사용
		System.out.println("----- toString 사용 -----");
		int chanIndex = 0;		// chan문자열의 인덱스를 지정할 변수
		String chan = "";		// 거스름돈을 저장할 변수
		for (int j=10000; j>1; j/=10) {	// n원짜리 값을 계산하기 위한 반복문 (10000 1000 100 10)
			char cntChar = ' ';			// chan문자열의 chanIndex번째 문자를 저장할 변수
			chan += Integer.toString(pay - money);	// toString : 정수형의 값을 문자열의 값으로 변경
			if (j > (pay-money)) {		// 거스름돈이 만원보다 많을 경우 반복문을 다시 시작
				continue;
			} else {
				cntChar = chan.charAt(chanIndex);	// 거스름돈이 저장된 문자열의 chanIndex번째의 문자를 저장
				chanIndex++;						// 인덱스 증가
				System.out.print(j + "원짜리 : " + cntChar + "개\n");
			}
		}
		
	}

}
