package _06_2차원배열;

import java.util.Scanner;

public class _0912_Q04 {

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
		
		int rowLeng = a.length;			// 4
		int colLeng = a[0].length;		// 5
		
		// 배열 값 입력부
		Scanner in = new Scanner(System.in);
		int checkNum = 0;
		while (true) {
			System.out.println("번호를 입력해주세요.");
			checkNum = in.nextInt();
			in.nextLine();
			if (checkNum > 0 && checkNum <= (rowLeng*colLeng)) {
				break;
			}
		}
		
		/*
		 *  0,0(1)
		 *  0,1(2)	1,0(3)
		 *  0,2(4)	1,1(5)	2,0(6)
		 *  0,3(7)	1,2(8)	2,1(9)	3,0(10)
		 *  0,4(11)	1,3(12)	2,2(13)	3,1(14)
		 *  1,4(15)	2,3(16)	3,2(17)
		 *  2,4(18)	3,3(19)
		 *  3,4(20)
		 */
		
		// 여기에다가 문제 풀기
		int rowStart = 0, rowEnd = 0;
		int col = 0;
		
		for (int loop=0; loop<((rowLeng+colLeng)-1); loop++) {
			if (loop < rowLeng) {
				rowEnd++;
			} else if (loop > rowLeng) {
				rowStart++;
			}
			// System.out.print(loop + " : ");
			// System.out.print(rowEnd + " :");
			int colDown = 0;
			for (int row=rowStart; row<rowEnd; row++) {
				if (num > checkNum) {
					break;
				}
				// System.out.print(" row(" + row + ")");
				/*
				 * loop가 0~3일 때 0 01 012 0123
				 * loop가 4~7일 때 0123 123 23 3
				 */
				// System.out.print(row);
				// System.out.print(" col(" + col + ")");
				/*
				 * 0~4일 때 col는 0 10 210 3210 4321
				 * 5~7일 때 col는 432 43 4
				 */
				if (loop > rowLeng) {
					// System.out.print(" col(" + (col-colDown) + ")");
					a[row][col-colDown] = num;
					num++;
					colDown++;
				} else {
					// System.out.print(" col(" + (col-row) + ")");
					a[row][col-row] = num;
					num++;
				}
			}
			// col가 0 1 2 3 일 때 증가 초기0 1 2 3 4
			if (col < rowLeng) {
				col++;
			}
			// System.out.println();
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
