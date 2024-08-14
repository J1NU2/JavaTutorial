package _04_객체;

// Ctrl + Shift + O : 필요한 클래스를 자동으로 import
import java.util.Random;

public class _00_Random {

	public static void main(String[] args) {
		// 6개의 랜덤한 로또번호를 추출
		
		int[] lotto = new int[6];
		// 자료형 : int 정수형 배열
		// 변수명 : lotto
		// 인덱스 : 0~5
		// 길이 : 1~6
		
		Random ran = new Random();		// 맨 처음 Random에 밑줄이 뜨는 이유 : import된 클래스가 없기 때문이다.
		// 클래스 : Random
		// 변수명 : r
		// 객체 : Random();
		
		// lotto배열의 0~5인덱스까지 순회하는 반복문
		for (int i=0; i<lotto.length; i++) {
			System.out.println((i+1) + "번째 번호를 뽑았습니다.");
			// r변수를 참조하여 nextInt()라는 기능을 호출한다.
			// 리턴받은 수(0~44)에 +1을 한다.
			int ranLotto = ran.nextInt(45) + 1;		// 1~45의 랜덤한 값을 저장할 변수 선언(ranLotto)
			lotto[i] = ranLotto;					// 랜덤한 값을 lotto배열의 i번째 인덱스에 저장한다.
		}
		
		System.out.print("자동 로또 번호 : ");
		
		// 입력받은 lotto배열의 값을 출력하는 반복문
		for (int i=0; i<lotto.length; i++) {
			if (i == (lotto.length - 1)) {
				System.out.println("+" + lotto[i]);
			} else {
				System.out.print(lotto[i] + " ");
			}
		}
	}

}
