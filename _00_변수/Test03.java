package _00_변수;

public class Test03 {

	public static void main(String[] args) {
		// 메인 시나리오
		System.out.println("메모장 프로그램");
		System.out.println("--------------------");
		String title = "나의 점심";
		String body = "오늘은 자장면";
		System.out.println(title + "\n" + body);
		
		title = "점심메뉴";
		System.out.println(title + "\n" + body);
		
		int views = 0;
		body = "짬뽕도 먹음";
		views = 10;
		
		System.out.println(title + "\n" + body + "\n" + views + "회");
		
		System.out.println("--------------------");
		// level up1
		body += " 탕수육도 먹음";
		System.out.println(title + "\n" + body + "\n" + views + "회");
		
		System.out.println("--------------------");
		// level up2
		// p1
		int point = 80;
		System.out.println(point);
		
		// p2
		double firstNumber = 10, secondNumber = 4;
		System.out.println(firstNumber / secondNumber);
		
		int firstNum = 10, secondNum = 4;
		System.out.println((double)firstNum / secondNum);
		System.out.println((double)(firstNum / secondNum));
		
		// p3
		String name = null;
		name = "홍길동";
		System.out.println(name + "님");
		
		// p4
		int eng = 90, math = 87, computer = 100;
		double avg = (eng + math + computer) / 3.0;
		System.out.println(avg);
		
		System.out.println("--------------------");
		// level up3
		int a = 10;
		System.out.println((a % 3) == 0);
	}

}
