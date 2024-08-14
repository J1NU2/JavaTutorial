package _04_객체;

import java.util.Random;

public class _0814_Q05 {

	public static void main(String[] args) {
		// 문제5
		// 아래 코드를 이용하여 로또 번호를 자동으로 생성하는 게임을 작성하시오.
		// 중복허용 가능, 로또 번호 6개를 배열에 저장하고 출력하시오.
		/* 
		 * Random r = new Random();   	// 변수이름은 r이며 랜덤한 숫자를 추출하는 기능인 Random이라는 자료형을 선언함
		 * int num = r.nextInt(45)+1;   // 변수 r을 참조하여 nextInt 메서드를 호출함. 매개변수는 랜덤한 숫자의 범위를 지정함
		 * // 즉 0 - 44까지 중 랜덤한 숫자 하나를 선택하여 리턴함.
		 * // 로또 번호는 1-45까지 이므로 리턴값이 +1로 보정함
		 * // 리턴값을 보정하여  num변수의 값에 대입
		 */
		Random r = new Random();	// Random 객체 생성
		
		int[] arr = new int[6];		// 로또 번호를 저장할 배열
		
		System.out.print("자동 로또 번호 : ");
		for (int i=0; i<arr.length; i++) {		// 0부터 arr배열의 길이-1까지 순회하는 반복문
			int num = r.nextInt(45) + 1;		// 초기값
			arr[i] = num;						// 랜덤한 값이 담긴 num의 값을 arr배열의 i번째에 저장
			System.out.print(arr[i] + " ");
		}
	}

}
