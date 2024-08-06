package _01_배열;

public class _00_BasicArray {

	public static void main(String[] args) {
		// 내용:	자바의 배열
		/* 특징:	변수 하나로 여러개의 값을 저장
				고정 길이를 지니며, 같은 자료형을 연속적으로 저장
				사용하지 않은 index가 존재하거나, 고정된 길이로 인해 길이에 벗어난 값은 저장하지 못할 수도 있음
				배열은 길이(length), 인덱스(index), 값(value) 형태로 존재
				ex) a = [10,20,30] 이라면
				1. 길이 : 배열의 총 길이 : 3
				2. 인덱스 : 배열 내 값을 저장하는 공간 : 0~2 ▶ 시작0, 끝(length - 1)
				3. 값 : 인덱스 내 존재하는 값 : 10,20,30
		*/
		
		// 배열 선언문
		int[] lotto = new int[3];		// 길이(length) 3, 인덱스(index) 0~2, 값(value) type : int
		lotto[1] = 30;
		lotto[0] = 20;
		lotto[2] = 40;
		System.out.println(lotto[0] + "/" + lotto[1] + "/" + lotto[2]);
		lotto[0] = lotto[1] + lotto[2];
		System.out.println(lotto[0] + "/" + lotto[1] + "/" + lotto[2]);
		System.out.println(lotto[0] + 20);
		System.out.println(lotto[0] + "/" + lotto[1] + "/" + lotto[2]);
		
		// 예외 발생 : java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
		// 3번 인덱스가 존재하지 않음
		// lotto[3] = 50;		// 에러 발생
		
		lotto[0] += lotto[2];
		System.out.println(lotto[0]);
	}

}
