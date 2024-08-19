package _04_객체;

import java.util.Scanner;

public class _0814_Q01 {

	public static void main(String[] args) {
		// 문제1
		// 키보드로 두 개의 숫자를 입력받아서 합하는 프로그램을 작성하시오.
		
		// 반복문 없이 사용
		Scanner scan = new Scanner(System.in);		// Scanner 객체 생성
		
		int sum = 0;		// 입력받은 두 숫자의 합을 저장할 변수
		
		System.out.print("첫번째 숫자 : ");
		sum += scan.nextInt();			// 첫번째로 입력받은 값을 sum변수에 저장		
		System.out.print("두번째 숫자 : ");
		sum += scan.nextInt();			// 두번째로 입력받은 값을 sum변수에 저장
		
		System.out.println("두 숫자의 합 : " + sum);
		
		System.out.println("\n");
		scan.close();
		
		// 반복문 사용
		Scanner forScan = new Scanner(System.in);		// Scanner 객체 생성
		int hap = 0;		// 입력받은 숫자의 합을 저장할 변수
		for (int i=0; i<=1; i++) {
			System.out.print((i+1) + "번째 숫자 : ");
			hap += forScan.nextInt();	// 입력받은 값을 hap변수에 저장
			forScan.nextLine();			// 버퍼 지우기
		}
		System.out.println("두 숫자의 합 : " + hap);
		forScan.close();
	}

}
