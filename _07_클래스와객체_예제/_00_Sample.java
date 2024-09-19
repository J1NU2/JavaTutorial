package _07_클래스와객체_예제;

import java.util.Random;		// Random클래스

public class _00_Sample {		// 클래스

	public static void main(String[] args) {	// 메소드
//		int a = 10;					// 원시변수
		// 참조변수
		Random r = new Random();	// 객체 생성(new)
		Random r1 = r;				// 생성된 객체의 주소를 저장
//		Random r2 = null;
		Random r3 = new Random();	// 객체 생성(new)
		System.out.println(r.nextInt(4));
		System.out.println(r1.nextInt(4));
//		System.out.println(r2.nextInt(4));		// 참조할 객체의 주소가 존재하지 않아서 에러가 발생한다.
		System.out.println(r3.nextInt(4));
	}
}
