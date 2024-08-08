package _03_반복문;

public class _00_for {

	public static void main(String[] args) {
		int[] a = {30,40,50,55,65};
		// 순서대로 출력 : 30 40 50 55 65
		for (int i=0; i<5; i++) {
			System.out.println(a[i]);
		}
		System.out.println("----------");
		// 역순서대로 출력 : 65 55 50 40 30
		for (int i=4; i>=0; i--) {
			System.out.println(a[i]);
		}
		System.out.println("----------");
		// 40 50 55 65 30
		for (int i=1; i<=5; i++) {
			System.out.println(a[i%5]);
		}
		System.out.println("----------");
		// 초기값과 반복조건을 바꾸지 않고
		for (int i=0; i<5; i++) {
			System.out.println(a[(i+1)%5]);
		}
		System.out.println("----------");
		// for문+if문 : 50이상만 출력
		for (int i=0; i<5; i++) {
			if (a[i] >= 50) {
				System.out.println(a[i]);
			}
		}
		/*
		 * 1. 50이상 점수를 합하시오.
		 * 2. 50점이상인 점수들의 평균을 구하시오.
		 * 3. 평균을 구하시오. 단, 최저점수는 포함하지 마시오.
		 */
		
		// 문제1
		System.out.println("----- 문제 1 -----");
		int total = 0;
		// 50점 이상인 점수들의 합
		for (int i=0; i<5; i++) {
			if (a[i] >= 50) {
				total += a[i];
			}
		}
		System.out.println("50점 이상인 점수의 총합 : " + total);
		
		// 문제2
		System.out.println("----- 문제 2 -----");
		total = 0;
		double count = 0, avg = 0;
		// 50점 이상인 점수 총합의 평균
		for (int i=0; i<5; i++) {
			if (a[i] >= 50) {
				total += a[i];
				count++;
			}
		}
		avg = total / count;
		System.out.println("50점 이상인 점수의 총합 : " + total);
		System.out.println("50점 이상인 점수 총합의 평균 : " + avg);
		
		// 문제3
		System.out.println("----- 문제 3 -----");
		int sum = 0, cnt = 0, min = 10000;		// 값을 저장할 변수 선언
		// 최저값 찾기
		for (int i=0; i<5; i++) {
			if (min > a[i]) {
				min = a[i];
			}
		}
		// 최저값을 제외한 값의 총합과 갯수
		for (int i=0; i<5; i++) {
			if (min != a[i]) {
				sum += a[i];
				cnt++;
			}
		}
		System.out.println((double) sum / cnt);		// 평균 산출
	}

}
