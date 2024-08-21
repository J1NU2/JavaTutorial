package _0_Project_;

import java.util.Random;
import java.util.Scanner;

public class _0821_miniProject {

	public static void main(String[] args) {
		String[] level1 = {"ㄱ", "ㄴ", "ㄷ", "ㄹ", "ㅁ", 
							"ㅂ", "ㅅ", "ㅇ", "ㅈ", "ㅊ", 
							"ㅋ", "ㅌ", "ㅍ", "ㅎ"};
		int jumsu = 0;
		
		Scanner scan = new Scanner(System.in);
		
		Random ran = new Random();
		
		while (true) {
			System.out.print("▶ 시작 [1] / 종료 [0] ◀ : ");
			String startEnd = scan.nextLine();
			System.out.println(startEnd);
			System.out.println(startEnd.length());
			System.out.println(startEnd.getClass().getName());
			
			if (startEnd == "1") {
				for (int i=1; i<=10; i++) {
					String levelText = level1[ran.nextInt(13)]; 	// 0~13
					System.out.println("단어 : " + levelText);
					System.out.print("입력 : ");
					String text = scan.nextLine();
					
					System.out.println(levelText);
					System.out.println(text);
					
					if (levelText == text) {
						System.out.println("점수 +10\n");
						jumsu += 10;
					} else {
						System.out.println("틀렸습니다!\n");
					}
					
					if (jumsu == 100) {
						System.out.println(jumsu);
						break;
					}
				}
			} else if (startEnd == "0") {
				System.out.println("게임을 종료했습니다.");
				break;
			} else {
				System.out.println("1 또는 0 만 입력해주세요. \n");
			}
		}
		scan.close();
	}

}
