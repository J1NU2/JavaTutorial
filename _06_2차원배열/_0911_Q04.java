package _06_2차원배열;

import java.util.Scanner;

public class _0911_Q04 {

	public static void main(String[] args) {
		// 문제4
		/* 다음 형태로 출력하기
		 * 1   2   4   7   11
		 * 3   5   8   12  15
		 * 6   9   13  16  18
		 * 10  14  17  19  20
		 */
		// 문제 초기 형태
		int[][] a = new int[4][5];
		int num = 1;
		
		// 배열 값 입력부
		Scanner in = new Scanner(System.in);
		int checkNum = 0;
//		while (true) {
//			System.out.println("번호를 입력해주세요.");
//			checkNum = in.nextInt();
//			in.nextLine();
//			if (checkNum > 0 && checkNum <= 20) {
//				break;
//			}
//		}
		
		// 여기에다가 문제 풀기
		int row = a.length;			// 4
		int col = a[0].length;		// 5
		
		int rowNum = 1;
		int colNum = 0;
		int bifurcation = 0;
		
		for (int allLoop=0; allLoop<((row+col)-1); allLoop++) {
			if (allLoop < 4) {
				bifurcation++;
			} else if (allLoop > 4) {
				bifurcation--;
			}
			System.out.print(bifurcation + " :");
			for (int loop=0; loop<bifurcation; loop++) {
				System.out.print(" " + loop);
				
				/*
				 * allLoop가 0~3일 때 0 01 012 0123
				 * allLoop가 4~7일 때 0123 012 01 0
				 */
				
				for (int i=0; i<rowNum; i++) {
					for (int j=colNum; j>=0; j--) {
						if (num > checkNum) {
							break;
						}
						a[i][j] = num;
						num++;
					}
				}
			}
			System.out.println();
		}
		

//		// 배열 값 출력부
//		for (int i=0; i<a.length; i++) {
//			for (int j=0; j<a[0].length; j++) {
//				System.out.print(a[i][j] + " ");
//			}
//			System.out.println();
//		}

		in.close();
	}
}
