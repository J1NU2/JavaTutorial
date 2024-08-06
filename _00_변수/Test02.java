package _00_변수;

public class Test02 {

	public static void main(String[] args) {
		int a = 10;				// 정수
		char b = 'b';			// 문자
		double c = 20;			// 실수 (=float : 사용 시 값 뒤에 f 추가)
		String d = "apple";		// 문자열
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(d);
		System.out.println(c);
		
		// 자료형에 따른 연산자의 의미가 달라진다.
		System.out.println(a + 10);
		System.out.println(d + 10);
		
		c = a + 10 / 2;
		System.out.println(c);
		System.out.println(a + 10);
		
		int k = a + a / 4;
		System.out.println(k);
		
		int cc = a;
		a = a / 3 + 2;
		cc = cc + a;
		System.out.println(cc);
		
		// 형 변환(casting)
		a = 10;
		double p = 4;
		System.out.println(a / p);
		
		// 비교 연산자
		System.out.println(a == 10);
		System.out.println(a != 10);
		
		System.out.println(a = a + 1);
		System.out.println(a == 10);
		// 코드 단축
		System.out.println((a = a + 1) == 10);
	}

}
