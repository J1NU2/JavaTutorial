package _06_2차원배열;

import java.util.Scanner;

public class _0911_Q01 {

	public static void main(String[] args) {
		// 문제1
		/* 다음 형태로 출력하기
		 * 17  13  9   5   1
		 * 18  14  10  6   2
		 * 19  15  11  7   3
		 * 20  16  12  8   4 
		 */
		// 문제 초기 형태
		int[][] a = new int[4][5];
		int num = 1;
		
		// 배열 값 입력부
		Scanner in = new Scanner(System.in);
		int checkNum = 0;
		while (true) {
			System.out.println("번호를 입력해주세요.");
			checkNum = in.nextInt();
			in.nextLine();
			if (checkNum > 0 && checkNum <= 20) {
				break;
			}
		}
		
		// 여기에다가 문제 풀기
		int row = a.length;			// 4
		int col = a[0].length;		// 5
		
		for (int i=0; i<col; i++) {
			for (int j=0; j<row; j++) {
				if (num > checkNum) {
					break;
				}
				a[j][row-i] = num;
				num++;
			}
		}
		
		// 배열 값 출력부
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a[0].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		in.close();
	}
}
