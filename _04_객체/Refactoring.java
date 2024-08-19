package _04_객체;

import java.util.Random;
import java.util.Scanner;

public class Refactoring {

	public static void main(String[] args) {
//		0. 키보드로 숫자 한 개를 입력 받아서 홀짝을 출력하는 프로그램을 작성하세요.
		System.out.println("---------- 문제0 ----------");
		Scanner in0 = new Scanner(System.in);
		System.out.println("한개의 숫자를 입력하세요.");
		int k0=in0.nextInt();
		if(k0%2==0) {
			System.out.println("짝수입니다.");
		}else {
			System.out.println("홀수입니다.");
		}
		in0.close();
		
		
//		1. 키보드로 두 개의 숫자를 입력받아서 합하는 프로그램을 작성하세요.
		System.out.println("---------- 문제1 ----------");
		Scanner in1 = new Scanner(System.in);
		System.out.println("숫자 두개를 입력하세요");
		int a1=in1.nextInt();
		in1.nextLine();
		int b1=in1.nextInt();
		System.out.println("두 숫자의 합은 "+(a1+b1)+"입니다.");
		in1.close();

		
//		2. 행운의 숫자 인지를 판별해 보자
//		   1부터 100까지 숫자 중 랜덤 수를 하나 뽑아서 출력한다.
//		   이 숫자가 7의 배수이면 행운의 숫자, 7의 배수가 아니면 조심해야하는 숫자 입니다.
		System.out.println("---------- 문제2 ----------");
		Random r2 = new Random();
		int k2=r2.nextInt(100)+1;
		if(k2%7==0) {
			System.out.println(k2+"는 행운의 숫자입니다.");
		}else {
			System.out.println(k2+"는 조심해야하는 숫자입니다.");
		}
		
		
//		3. 2번 업그레이드, 랜덤 수를 하나 뽑아서 출력한다
//		   7의 배수이면 행운의 숫자, 7의 배수가 아니면 행운의 숫자가 나올 때 까지 계속 뽑는다.
		System.out.println("---------- 문제3 ----------");
		Random r3 = new Random();
		for(int a3=r3.nextInt(100)+1;;) {
			if(a3%7==0) {
				System.out.println(a3+"는 행운의 숫자입니다.");
				break;
			}else {
				a3=r3.nextInt(100)+1;
				continue;
			}
		}
		
		
//		4. 숫자 10개를 저장할수 있는 배열을 만들고
//		   0부터 99숫자중 랜덤으로 10개를 뽑습니다.
//		   이중 짝수만 저장하고 홀수는 무시합니다.(다시 뽑지 않습니다.)
//		   0번째 번호 98이라면   0번 인덱스에 저장
//		   1번째 번호 97이라면   무시  1번 인덱스는 선언시 초기값
//		   2번째 번호 88이라면   2번  인덱스에 저장
		System.out.println("---------- 문제4 ----------");
		Random r4 = new Random();
		int [] a4 = new int[10];
		int k4=0;
		for (int i = 0; i < a4.length; i++) {
			k4=r4.nextInt(100);
			if(k4%2==0) {
				a4[i]=k4;
			}
			System.out.print(a4[i]+" ");
		}
		System.out.println("");
		
//		Random r = new Random();   	// 변수이름은 r이며 랜덤한 숫자를 추출하는 기능인 Random이라는 자료형을 선언함
//		int num = r.nextInt(45)+1;  // 변수 r을 참조하여 nextInt 메서드를 호출함. 매개변수는 랜덤한 숫자의 범위를 지정함
//									// 즉 0 - 44까지 중 랜덤한 숫자 하나를 선택하여 리턴함.
//		                            // 로또 번호는 1-45까지 이므로 리턴값이 +1로 보정함
//		                            // 리턴값을 보정하여  num변수의 값에 대입
//		위 코드를 이용하여
//		5. 로또번호를 자동으로 생성하는 게임을 작성하시오.
//		   중복허용 가능, 로또 번호 6개를 배열에 저장하고, 출력하시오.
		System.out.println("---------- 문제5 ----------");
		Random r5 = new Random();
		int [] lotto5 = new int[6];
		for (int i = 0; i < lotto5.length; i++) {
			lotto5[i]=r5.nextInt(45)+1;
			System.out.print(lotto5[i]+" ");
		}
		System.out.println("");
		
		
//		6.컴퓨터는 랜덤으로 로또 번호를 10000번 뽑는다.
//		  가장 많이 뽑힌 로또 번호가 오늘의 추천 로또 번호이다.
//		  오늘의 추천 로또 번호 하나를 출력하시오.  
//		  만약 로또 번호가 같은 횟수로 나왔을 경우에는 큰 숫자가 우선한다. 
		System.out.println("---------- 문제6 ----------");
		Random r6 = new Random();
		int [] lotto6 = new int[45];
		int k6=0;
		int maxLotto=0;
		int maxNum=0;
		for(int i=0;i<10000;i++) {
			k6=r6.nextInt(45)+1;
			lotto6[k6-1]++;
			if(lotto6[k6-1]>=maxLotto) {
				maxLotto=lotto6[k6-1];
				maxNum=k6;
			}
			if(i==9999) {
				k6=r6.nextInt(45)+1;
				if((k6>maxNum) && (k6==maxLotto-1)) {
					maxNum=k6;
				}
			}
		}
		System.out.println("오늘의 추천번호는 "+maxNum);
		
		
//		7.int jobTime ={40,32,4,16,5,8};
//		  위 배열에서 인덱스를 사람의 번호로 가정한다.
//		  jobTime[2] 의 의미는 2번 사람이 업무를 마치기 위한 시간이다.
//		  작업장을 사용할 수 있는 시간은 최대  4시간이다.
//		  작업장은 한 사람만 사용할 수 있고. 사용이 끝나면 작업장을 나와야 하고
//		  다음 사람이 작업장을 사용한다. (만약,다음 사람의 업무가 종료 되었다면, 그 다음 사람이 사용이 가능하다)
//		  0번 부터 1 2 3 4 5번 순으로 작업장을 사용한다면
//		  실제 작업장을 사용한 사람의 기록을 순서대로 출력하시오.
		System.out.println("---------- 문제7 ----------");
		int[] jobTime = {40,32,4,16,5,8};
		
		for (int i=0; i<jobTime.length; i++) {
			if ((jobTime[0]+jobTime[1]+jobTime[2]+jobTime[3]+jobTime[4]+jobTime[5]) == 0) {
				break;
			} else if (jobTime[i] == 0) {
				if (i == (jobTime.length - 1)) {
					i = -1;
				}
			} else {
				if (jobTime[i] <= 3 && jobTime[i] > 0) {
					jobTime[i] = 4;
				}
				jobTime[i] -= 4;
				System.out.print(i + " ");
				if (i == (jobTime.length - 1)) {
					i = -1;
				}
			}
		}
		System.out.println("");
		
		
//		8.배열 저장 변수
//		  int[] lotto = new int[6];				// 키보드로 부터 입력받기 위한 객체 만들기.
//		  Scanner in = new Scanner(System.in); 	// ctrl shift o
		  // 0번째 번호부터 로또 번호 입력받기
//		  for (int i = 0; i < lotto.length; i++) {
//		  		System.out.println((i + 1) + "번 입력하세요");
//				int k = in.nextInt();  // nextInt는 키보드로 숫자만 가져온다.
//				in.nextLine();  // 버퍼 지우기
//				lotto[i] = k;
//		  }
//		  // 로또 번호를 출력하는 반복문
//		  for (int i = 0; i < lotto.length; i++) {
//				if (i == lotto.length - 1) { // 마지막 번호
//					System.out.println("보너스 : " + lotto[i]);
//				} else {
//					System.out.println(lotto[i]);
//				}
//		  }
//		  위 코드에 1-45숫자를 벗어난 숫자를 입력하면
//		  범위 오류라고 출력하고 다시 번호를 입력할 수 있도록 수정하세요.
		System.out.println("---------- 문제8 ----------");
		int[] lotto = new int[6];
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < lotto.length; i++) {
			System.out.println((i + 1) + "번 입력하세요");
			int k = in.nextInt();
//			수정 지점
			if(k<1 || k>45) {
				System.out.println("범위오류입니다. 다시 입력하세요");
				i--;
			}else {
				in.nextLine();
				lotto[i] = k;
			}
//			수정 지점
		}
		for (int i = 0; i < lotto.length; i++) {
			if (i == lotto.length - 1) {
				System.out.println("보너스 : " + lotto[i]);
			} else {
				System.out.println(lotto[i]);
			}
		}
		in.close();
	}

}
