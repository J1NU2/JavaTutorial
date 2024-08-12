package _03_반복문;

public class _0812_Q03 {

	public static void main(String[] args) {
		// 문제3
		// letter 배열은 word 문자열 알파벳의 위치이다.
		// letter 배열의 암호를 풀어서 편지의 내용을 출력하시오.
		String word ="gehoudfkimjnlvy";			// 초기값
		int[] letter = {8,12,3,13,1,14,3,4};	// 초기값
		
		String secret = "";						// 암호를 저장할 변수
		for (int i=0; i<letter.length; i++) {	// 0부터 letter 배열의 최대 길이까지 반복
			secret += word.charAt(letter[i]);	// word 문자열의 인덱스가 letter[i]번째에 해당하는 문자를 secret 변수에 저장
		}
		System.out.println(secret);
		
		// 리팩토링
		for (int i=0; i<letter.length; i++) {
			System.out.print(word.charAt(letter[i]));
		}
	}

}
