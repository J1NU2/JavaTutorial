package _01_배열;

public class _01_Problem {

	public static void main(String[] args) {
		// 문제1
		int[] number = {30,40,50,60,55};
		System.out.println(number[0] + "/" + number[1] + "/" + number[2] + "/" + number[3] + "/" + number[4]);
		
		System.out.println("-------------------------");
		
		// 문제2
		String[] name = {"kim","lee","park"};
		System.out.println(name[0] + "/" + name[1] + "/" + name[2]);
		
		int[] lotto = {6,12,33,4,5,26};
		
		System.out.println("-------------------------");
		
		// 문제3
		lotto[2] += 2;

		// 문제4
		lotto[2] = 33;
		
		int total = lotto[0] + lotto[2] + lotto[4];
		System.out.println(total);
		
		System.out.println("-------------------------");

		// 문제5
		lotto[1] += lotto[0];
		lotto[2] += lotto[1];
		lotto[3] += lotto[2];
		lotto[4] += lotto[3];
		lotto[5] += lotto[4];
		// System.out.println(lotto[0] + "/" + lotto[1] + "/" + lotto[2] + "/" + lotto[3] + "/" + lotto[4] + "/" + lotto[5]);

		// 문제6
		lotto[1] = 12;
		lotto[2] = 33;
		lotto[3] = 4;
		lotto[4] = 5;
		lotto[5] = 26;
		
		System.out.println((lotto[3] % 2) != 0);
		
		System.out.println("-------------------------");
		
		// 문제7
		int money = 2750;
		int pay = 10000;
		
		int change = pay - money;		// 7250원
		
		/*
		int[] unit = new int[3];
		unit[0] = change / 1000;
		unit[1] = (change - 7000) / 100;
		unit[2] = (change - 7200) / 10;
		*/
		int[] unit = {change/1000, (change%1000)/100, (change%100)/10};
		System.out.println("천원 " + unit[0] + "개, 백원 " + unit[1] + "개, 십원 " + unit[2] + "개");
		
		// 번외 : toCharArray() 사용 : 문자열을 한글자씩 char형 배열로 변환
		String changeStr = change + "";
		char[] changeChar = changeStr.toCharArray();
		System.out.println("번외 : 천원 " + changeChar[0] + "개, 백원 " + changeChar[1] + "개, 십원 " + changeChar[2] + "개");
		
		System.out.println("-------------------------");
		
		// 문제8
		int xA = 700, yA = 500, xB = 900, yB = 300;
		
		int xC = 650, yC = 150;
		double Ball = 3;
		double xMinusBall = xC - (Ball / 2);
		double yMinusBall = yC - (Ball / 2);
		double xPlusBall = xC + (Ball / 2);
		double yPlusBall = yC + (Ball / 2);
		
		System.out.println("볼이 벙커에 빠졌는가? : " + ((xA <= xMinusBall && xB >= xMinusBall) && (yA >= yMinusBall && yB <= yMinusBall) 
				&& (xA <= xPlusBall && xB >= xPlusBall) && (yA >= yPlusBall && yB <= yPlusBall)));
		
		// 번외 : Math.random() 사용 : 수학 랜덤 함수, 0~1.0 의 랜덤한 숫자 발생
		double xRandom = Math.random();
		double yRandom = Math.random();
		double xRanC = (xRandom * 1000) + 1;
		double yRanC = (yRandom * 1000) + 1;
		xMinusBall = xRanC - (Ball / 2);
		yMinusBall = yRanC - (Ball / 2);
		xPlusBall = xRanC + (Ball / 2);
		yPlusBall = yRanC + (Ball / 2);
		
		System.out.println("---------- 번외 ----------");
		System.out.println("xBall : " + xRanC + ", yBall : " + yRanC);
		System.out.println("볼이 벙커에 빠졌는가? : " + ((xA <= xMinusBall && xB >= xMinusBall) && (yA >= yMinusBall && yB <= yMinusBall) 
				&& (xA <= xPlusBall && xB >= xPlusBall) && (yA >= yPlusBall && yB <= yPlusBall)));
	}

}
