package _03_반복문;

public class _0809_Q14 {

	public static void main(String[] args) {
		// 문제14 : 심화문제
		// 해당 문자열을 압축하시오.
		// 압축 방법 : a2b3c3a4d2b3a5	// 2334235
		String ttt ="aabbbcccaaaaddbbbaaaaa";
		char prevT = '0';
		int cnt = 0;
		for (int i=0; i<ttt.length(); i++) {
			char presT = ttt.charAt(i);	// 현재 글자에 문자열 ttt의 i번째 글자 저장
			if (presT != prevT) {
				prevT = presT;
				cnt = 1;
			} else {
				cnt++;
			}
			System.out.print(presT + "" + cnt);
		}
	}

}
