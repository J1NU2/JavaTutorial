package _05_이중for문;

import java.util.Arrays;

public class _0820_Q05 {

	public static void main(String[] args) {
		// 문제5
		// carnum배열의 인덱스가 0인 값부터 주차장에 들어온다 (=carnum배열은 자동차 번호를 의미한다.)
		// parking의 인덱스 번호가 주차번호이다.
		// 자동차 번호의 마지막 번호는 해당 차량이 주차할 주차번호이다.
		// 만약 주차번호에 다른 차량이 주차되어 있으면 다음 주차번호에 주차를 한다.
		// 이때, 다음 주차번호에도 차량이 있으면 주차불가이다.
		// 주차가 끝난 후 주차번호와 주차장 차량 번호를 출력하시오.
		/* 결과값
		 * 1 ?
		 * 차량번호 [1221,1232,1252,1234,1235,4536,3457,3238,3229,2599]
		 * 주차번호 [1,0,3,4,2,5,6,7,8,9]
		 * 2 ?
		 * 차량번호 [0,1221,1232,1252,1234,1235,4536,3457,3238,3229]
		 * 주차번호 [0,1,0,3,4,2,5,6,7,8]
		 */
		int[] carnum = {1232,1221,1235,1252,1234,4536,3457,3238,3229,2599};		// 초기값
		int[] parking = new int[10];											// 초기값
		
		int[] parkingNum = new int[10];
		int car = 0;
		int carIndex = 0;
		int carNumber = 0;
		
		for (int i=0; i<carnum.length; i++) {
			car = carnum[i];
			carIndex = i;
			carNumber = car%10;
//			System.out.println(car);
//			System.out.println(carIndex);
//			System.out.println(carNumber);
			for (int j=0; j<parking.length; j++) {
				if (parking[j] > 1) {
//					if (j == parking.length-1) {
//						continue;
//					}
//					parking[j+1] = car;
//					parkingNum[j+1] = carIndex;
				} else if (j == carNumber) {
					parking[j] = car;
					parkingNum[j] = carIndex;
				}
			}
		}
		
		/*
		for (int i=0; i<parking.length; i++) {
			for (int j=0; j<carnum.length; j++) {
				car = carnum[j];
				carIndex = j;
				carNumber = car%10;
				
				if (parking[carNumber] > 100) {
					continue;
				}
				parking[carNumber] = car;
				parkingNum[carNumber] = carIndex;
			}
		}
		*/
		// Arrays 클래스의 toString() 메소드
		// 배열의 arr를 toString()의 파라미터로 넣어서 배열의 값들을 문자열 형태로 리턴해준다.
		// System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(parking) + "\n");
		System.out.println(Arrays.toString(parkingNum) + "\n");
		
	}

}
