package _01_배열;

public class _01_submit {

	public static void main(String[] args) {
		// 문제1
		System.out.println("---------- 문제 1 ----------");
		int[] number = {30,40,50,60,55};
		System.out.println(number[0] + "/" + number[1] + "/" + number[2] + "/" + number[3] + "/" + number[4]);
		
		// 문제2
		System.out.println("---------- 문제 2 ----------");
		String[] name = {"kim","lee","park"};
		System.out.println(name[0] + "/" + name[1] + "/" + name[2]);
		
		int[] lotto = {6,12,33,4,5,26};
		
		// 문제3
		System.out.println("---------- 문제 3 ----------");
		lotto[2] += 2;
		System.out.println(lotto[2]);
		
		// 문제4
		System.out.println("---------- 문제 4 ----------");
		lotto[2] = 33;
		
		int total = lotto[0] + lotto[2] + lotto[4];
		System.out.println(total);
		
		// 문제5
		System.out.println("---------- 문제 5 ----------");
		lotto[1] += lotto[0];
		lotto[2] += lotto[1];
		lotto[3] += lotto[2];
		lotto[4] += lotto[3];
		lotto[5] += lotto[4];
		System.out.println(lotto[0] + "/" + lotto[1] + "/" + lotto[2] + "/" + lotto[3] + "/" + lotto[4] + "/" + lotto[5]);

		// 문제6
		System.out.println("---------- 문제 6 ----------");
		lotto[1] = 12;
		lotto[2] = 33;
		lotto[3] = 4;
		lotto[4] = 5;
		lotto[5] = 26;
		
		System.out.println((lotto[3] % 2) != 0);
		
		// 문제7
		System.out.println("---------- 문제 7 ----------");
		int money = 2750;
		int pay = 10000;
		
		int change = pay - money;		// 7250원

		int[] unit = {change/1000, (change%1000)/100, (change%100)/10};
		System.out.println("천원 " + unit[0] + "개, 백원 " + unit[1] + "개, 십원 " + unit[2] + "개");

		// 문제8
		System.out.println("---------- 문제 8 ----------");
		int xA = 700, yA = 500, xB = 900, yB = 300;
		
		int xC = 650, yC = 150;
		int Ball = 3;
		
		System.out.println("볼이 벙커에 빠졌는가? : " + (((xA <= xC) && (xB >= (xC+Ball)))
				&& ((yA >= yC) && (yB <= (yC-Ball)))));
	}

}
