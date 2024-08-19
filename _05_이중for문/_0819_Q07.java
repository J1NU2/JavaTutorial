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
		int cnt = 0, change = pay - money;
		for (int i=10000; i>1; i/=10) {
			for (int j=10; j<=i; j*=10) {
				cnt = (change)/i;
			}
			if (cnt > 10) {
				cnt %= 10;
			}
			System.out.print(i + "원짜리 " + cnt + "개 ");
		}
		System.out.println();
		
		// toString 사용
		System.out.println("----- toString 사용 -----");
		char cntChar = '0', chanIndex = 0;
		String chan = "0";
		chan += Integer.toString(pay - money);
		for (int k=10000; k>1; k/=10) {
			cntChar = chan.charAt(chanIndex);
			chanIndex++;
			System.out.print(k + "원짜리 : " + cntChar + "개\n");
			cntChar = ' ';
		}
		
	}

}
