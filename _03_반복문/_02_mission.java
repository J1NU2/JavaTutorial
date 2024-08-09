package _03_반복문;

public class _02_mission {

	public static void main(String[] args) {
		// 이중 For는 사용하지 않습니다.
		
		// 문제1 : 1~100까지 숫자 중 홀수는 더하고 짝수는 뺀 결과값 출력
		System.out.println("---------- 문제 1 ----------");
		int oddPlusEvenMinus = 0;			// 홀수는 더하고, 짝수는 뺀 결과값을 저장할 변수
		for (int i=0; i<100; i++) {			// 0부터 99까지 반복
			if ((i+1)%2 != 0) {				// i가 0부터 시작하므로, i+1 사용 : i+1의 나머지 값이 0이 아니면 홀수/맞으면 짝수
				oddPlusEvenMinus += (i+1);	// 홀수인 숫자를 더한 뒤 변수에 저장
			} else {
				oddPlusEvenMinus -= (i+1);	// 짝수인 숫자를 뺀 뒤 변수에 저장
			}
		}
		System.out.println(oddPlusEvenMinus);
		
		// 문제2 : 1~100까지 숫자 중 각 홀수/짝수끼리 더한 값 출력
		System.out.println("---------- 문제 2 ----------");
		int oddSum = 0, evenSum = 0;	// 홀수의 합과 짝수의 합을 저장할 변수
		for (int i=0; i<100; i++) {		// 0부터 99까지 반복
			if ((i+1)%2 != 0) {			// i가 0부터 시작하므로, i+1 사용 : i+1의 나머지 값이 0이 아니면 홀수/맞으면 짝수
				oddSum += (i+1);		// 홀수인 숫자를 더한 뒤 변수에 저장
			} else {
				evenSum += (i+1);		// 짝수인 숫자를 뺀 뒤 변수에 저장
			}
		}
		System.out.println("홀수의 합 : " + oddSum + ", 짝수의 합 : " + evenSum);
		
		// 문제3 : 1~100까지 숫자 중 홀수의 갯수
		System.out.println("---------- 문제 3 ----------");
		int oddCount = 0;				// 홀수의 갯수를 저장할 변수
		for (int i=0; i<100; i++) {		// 0부터 99까지 반복
			if ((i+1)%2 != 0) {			// i가 0부터 시작하므로, i+1 사용 : i+1의 나머지 값이 0이 아니면 홀수
				oddCount++;				// 조건식을 만족하면 oddCount 1씩 증가
			}
		}
		System.out.println("홀수의 갯수 : " + oddCount);
		
		// 문제4 : 100~999까지 숫자들의 총합, 숫자가 453인 경우 4+5+3으로 계산
		System.out.println("---------- 문제 4 ----------");
		int sum = 0, sum453 = 0;		// 100부터 999까지의 모든 숫자의 합을 저장할 변수, 453인 숫자를 쪼갠 합을 저장할 변수
		for (int i=100; i<=999; i++) {	// 100부터 999까지 반복
			if (i == 453) {				// i가 453이라면 조건문 실행
				sum453 = (i/100) + ((i%100)/10) + (i%10);	// 453을 쪼갠 4+5+3의 값 저장
			} else {
				sum += i;				// 453을 제외한 100부터 999까지의 숫자의 합 저장
			}
		}
		System.out.println("100부터 999까지의 총합 : " + (sum+453));
		System.out.println("453을 제외한 100부터 999까지의 총합 : " + sum);
		System.out.println("453을 쪼갠 값과 100부터 999까지의 총합 : " + (sum+sum453));
		System.out.println("453을 쪼갠 4+5+3의 값 : " + sum453);
		
		// 문제5 : 100~999까지의 숫자 중 모든 범인 찾기(범인은 10의 자리에 있고 3의 배수)
		System.out.println("---------- 문제 5 ----------");
		for (int i=100; i<=999; i++) {		// 100부터 999까지 반복
			if ((i%3) == 0) {				// 3의 배수
				// 10의 자리가 3,6,9 (3의 배수)에 해당되는 조건
				if (((i%100)/10) == 3 || ((i%100)/10) == 6 || ((i%100)/10) == 9) {
					System.out.print(i + ", ");
				}
			}
		}
		System.out.print("\n");		// 반복문 내에서 줄바꿈이 없는 출력문을 사용하였으므로, 줄바꿈을 위한 sysout 사용
		
		// 문제6 : 0~100까지의 숫자 중 순서대로 합한 값이 44가 넘어갈 때, 최초로 넘어가게 한 범인 찾기
		System.out.println("---------- 문제 6 ----------");
		// 44가 넘어간 시점을 저장할 변수 total
		// 합이 44가 넘어가면서 추가되는 숫자를 저장할 변수 criminal
		// 44를 처음으로 넘긴 숫자를 저장할 변수 criminalNumber
		int total = 0, criminal = 0, criminalNumber = 100;
		for (int i=0; i<=100; i++) {	// 0부터 100까지 반복
			total += i;					// 0부터 100까지의 합
			if (total > 44) {			// 합이 44가 넘어갈 때의 조건
				criminal = i;			// criminal 변수에 현재 숫자(i) 저장
				if (criminal < criminalNumber) {	// 처음으로 44를 넘긴 숫자를 찾을 조건
					criminalNumber = criminal;		// 처음으로 44를 넘긴 숫자를 criminalNumber 변수에 저장
				}
			}
		}
		System.out.println(criminalNumber + " ← 얘가 범인이예요! ");
		
		// 문제7 : print와 println의 차이 (줄바꿈이 있는가? 없는가?)
		System.out.println("---------- 문제 7 ----------");
		int hap = 0;					// 결과값을 저장할 변수
		for (int i=0; i<10; i++) {		// 0부터 9까지 반복
			hap += (i+1);				// i가 0부터 시작하므로, i+1 사용 : i+1 값을 hap 변수에 저장
		}
		System.out.print("1+2+3+4+5+6+7+8+9+10=");		// 줄바꿈이 없는 출력문
		System.out.println(hap);						// 줄바꿈이 있는 출력문
		
		// 문제8 : 피보나치 수열1
		System.out.println("---------- 문제 8 ----------");
		int fib = 1, fibPrevious = 0, fibSave = 0, fibSum = 0;	// 피보나치수열의 초기값
		for (int i=1; i<8; i++) {
			fibSave = fib + fibPrevious;	// 다음 수열, fib+fibPrevious의 값을 저장
			fibPrevious = fib;				// fibPrevious에 기존에 있던 fib의 값 저장
			fib = fibSave;					// fib에 다음으로 수열로 사용될 값 저장
			fibSum += fibPrevious;			// 반복문이 끝날 때까지 나온 피보나치수열의 총합
			// System.out.print(fibPrevious + " ");
		}
		System.out.println("1 + 1 + 2 + 3 + 5 + 8 + 13 = " + fibSum);
		
		// 문제9 : 피보나치 수열2
		System.out.println("---------- 문제 9 ----------");
		int prev = 0, save = 0;			// 이전 수열과 다음 수열을 저장할 변수
		for (int i=1; i<20;) {
			System.out.print(i + " ");
			save = i + prev;		// 다음 수열, i+prev의 값을 저장
			prev = i;				// 이전 수열이 될 현재 i값을 prev에 저장
			i = save;				// 다음 수열이 될 값을 i에 저장
		}
		System.out.print("\n");		// 반복문 내에서 줄바꿈이 없는 출력문을 사용하였으므로, 줄바꿈을 위한 sysout 사용
		
		// 문제10 : 변수 2개와 for문 1개로 987654321의 모든 자릿수의 총합 구하기 (9+8+7+6+5+4+3+2+1=)
		System.out.println("---------- 문제 10 ----------");
		int digit = 987654321, digitSum = 0;	// 초기값을 가지는 digit 변수와 자릿수 총합을 저장할 digitSum 변수
		for (int i=100000000; i>=1; i/=10) {	// i가 0이 될 때까지 반복시킬 반복문, i값을 10으로 나눠 다음 자릿수에 맞추도록 변경
			digitSum += (digit/i);				// 각 자릿수에 해당하는 값을 digitSum에 저장
			digit %= i;							// digit의 값에 i값을 나눈 나머지를 digit에 저장
		}
		System.out.println("9+8+7+6+5+4+3+2+1=" + digitSum);
		
		// 문제10+ : 배열
		System.out.println("---------- 문제 10+ ----------");
		int[] digitArray = {987654321, 0};		// digitArray 배열에 초기값(987654321)과 저장할값(0) 선언
		for (int i=100000000; i>=1; i/=10) {	// i가 0이 될 때까지 반복시킬 반복문, i값을 10으로 나눠 다음 자릿수에 맞추도록 변경
			digitArray[1] += (digitArray[0]/i);	// 각 자릿수에 해당하는 값을 digitArray[1]에 저장
			digitArray[0] %= i;					// digitArray[0]의 값에 i값을 나눈 나머지를 digitArray[0]에 저장
		}
		System.out.println("9+8+7+6+5+4+3+2+1=" + digitArray[1]);

		// 문제10++ : i를 제외한 변수2개 for문 1개
		System.out.println("---------- 문제 10++ ----------");
		int numberHap = 0;
		for (int i=100000000; i>=1; i/=10) {
			numberHap += (987654321 / i % 10);
		}
		System.out.println("9+8+7+6+5+4+3+2+1=" + numberHap);
		
		// 문제10+++ : 리팩토링
		int aNum = 987654321, aNumSum = 0;
		for (; aNum>0;) {
			aNumSum += (aNum % 10);
			aNum /= 10;
		}
	}

}
