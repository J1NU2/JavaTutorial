package _06_2차원배열;

import java.util.Scanner;

public class _0913_Q05 {

	public static void main(String[] args) {
		// 문제5
		/* 다음 형태로 출력하기
		 * 1   2   3   4   5
		 * 14  15  16  17  6
		 * 13  20  19  18  7
		 * 12  11  10  9   8
		 */
		// 문제 초기 형태
		int[][] a = new int[4][5];
		int num = 1;
		
		int rowLeng = a.length;			// 4
		int colLeng = a[0].length;		// 5
		
		// 배열 값 입력부
		Scanner in = new Scanner(System.in);
		int checkNum = (rowLeng*colLeng);
		while (true) {
			System.out.println("번호를 입력해주세요.");
			checkNum = in.nextInt();
			in.nextLine();
			if (checkNum > 0 && checkNum <= (rowLeng*colLeng)) {
				break;
			}
		}
		
		/*
		 * [ 5번 ]									반복(행)	반복(열)
		 * 0,0(1)	0,1(2)	0,2(3)	0,3(4)	0,4(5)	5				행 　　	열 증가
		 * 1,4(6)	2,4(7)	3,4(8)							3		행 증가	열 　　
		 * 3,3(9)	3,2(10)	3,1(11)	3,0(12)			4				행 　　	열 감소
		 * 2,0(13)	1,0(14)									2		행 감소	열 　　
		 * 1,1(15)	1,2(16)	1,3(17)					3				행 　　	열 증가
		 * 2,3(18)											1		행 증가	열 　　
		 * 2,2(19)	2,1(20)							2				행 　　	열 감소
		 */
		
		// 여기에다가 문제 풀기
		int row = rowLeng;		// 4
		int col = colLeng;		// 5

		int rowStart = 0, rowEnd = (row-1), colStart = 0, colEnd = (col-1);
		boolean loop = true;
		
		while (loop) {	// 반복
			/* 											 	반복(행)	반복(열)
			 * 1회) 0,0(1)  0,1(2)  0,2(3)  0,3(4)  0,4(5)			0~4		행 고정　　	열 증가
			 * 2회) 1,4(6)  2,4(7)  3,4(8)				 	1~3				행 증가	열 고정
			 * 3회) 3,3(9)  3,2(10) 3,1(11) 3,0(12)					3~0		행 고정	열 감소
			 * 4회) 2,0(13) 1,0(14)						 	2~1				행 감소	열 고정
			 * 5회) 1,1(15) 1,2(16) 1,3(17)							1~3		행 고정	열 증가
			 * 6회) 2,3(18)								 	3				행 증가	열 고정
			 * 7회) 2,2(19) 2,1(20)									2~1		행 고정	열 감소
			 * 1회.열증가 / 2회.행증가 / 3회.열감소 / 4회.행감소 ~ 반복
			 * 행이 증감할 때는 열이 고정되고, 열이 증감할 때는 행이 고정된다.
			 */
			for (int i=colStart; i<=colEnd; i++) {	// 1번
				if (num > checkNum) {
					loop = false; 
					break;
				}
				a[rowStart][i] = num;		// 1회 : 행 고정, 열 증가(0 1 2 3 4)
				num++;						// 5회 : 행 고정, 열 증가(1 2 3)
			}
			rowStart++;		// 1회:0+1=1		// 5회:1+1=2
			for (int i=rowStart; i<=rowEnd; i++) {	// 2번
				if (num > checkNum) {
					loop = false; 
					break;
				}
				a[i][colEnd] = num;			// 2회 : 열 고정, 행 증가(1 2 4)
				num++;						// 6회 : 열 고정, 행 증가(2)
			}
			colEnd--;		// 2회:4-1=3		// 6회:3-1=2
			for (int i=colEnd; i>=colStart; i--) {	// 3번
				if (num > checkNum) {
					loop = false; 
					break;
				}
				a[rowEnd][i] = num;			// 3회 : 행 고정, 열 감소(3 2 1 0)
				num++;						// 7회 : 행 고정, 열 감소(2 1)
			}
			rowEnd--;		// 3회:3-1=2		// 7회:2-1=1
			for (int i=rowEnd; i>=rowStart; i--) {	// 4번
				if (num > checkNum) {
					loop = false; 
					break;
				}
				a[i][colStart] = num;		// 4회 : 열 고정, 행 감소(2 1)
				num++;						// 8회? : rowEnd=1, rowStart=2이기 때문에 8회부터는 반복문이 실행되지 않는다.
			}
			colStart++;		// 4회:0+1=1		// 8회:1+1=2
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
