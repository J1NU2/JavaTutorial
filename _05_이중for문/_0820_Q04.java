package _05_이중for문;

import java.util.Arrays;

public class _0820_Q04 {

	public static void main(String[] args) {
		// 문제4
		// 다음 조건에 따라 오름차순으로 정렬하시오.
		// 1. 가장 큰 값을 찾아서 맨 뒤 값과 교환한다.					결과 : {56,45,83,58,75,93}
		// 2. 두번째로 큰 값을 찾아서 맨 뒤에서 두번째 자리의 값과 교환한다.	결과 : {56,45,75,58,83,93}
		// 3. 세번째로 큰 값을 찾아서 맨 뒤에서 세번째 자리의 값과 교환한다.	결과 : {56,45,58,75,83,93}
		// ..오름차순으로 정렬이 될 때까지 반복한다.
		int[] b = {93,45,83,58,75,56};		// 초기값
		
		int max = 0, end = 0;
		int index = 1;
		for (int i=0; i<b.length; i++) {
			for (int j=0; j<b.length-i; j++) {
				if (max < b[j]) {
					max = b[j];
					System.out.println("max"+max);
				} else if (j == b.length-i-1){
					end = b[j];
					System.out.println("end"+end);
				}
			}
			for (int k=0; k<b.length; k++) {
				if(b[k] == max) {
					b[k] = end;
					b[b.length-index] = max;
					index++;
					max = 0;
					break;
				}
			}
			// Arrays 클래스의 toString() 메소드
			// 배열의 arr를 toString()의 파라미터로 넣어서 배열의 값들을 문자열 형태로 리턴해준다.
			// System.out.println(Arrays.toString(arr));
			System.out.println(Arrays.toString(b) + "\n");
		}
		
		
	}

}
