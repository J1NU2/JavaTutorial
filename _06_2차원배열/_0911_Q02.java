package _06_2차원배열;

import java.util.Scanner;

public class _0911_Q02 {

	public static void main(String[] args) {
		// 문제2
		/* 다음 형태로 출력하기
		 * 20  19  18  17  16
		 * 15  14  13  12  11
		 * 10  9   8   7   6
		 * 5   4   3   2   1
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
		
		for (int i=0; i<row; i++) {
			for (int j=0; j<col; j++) {
				if (num > checkNum) {
					break;
				}
				a[(row-1)-i][row-j] = num;
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
