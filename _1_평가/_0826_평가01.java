package _1_평가;

public class _0826_평가01 {

	public static void main(String[] args) {
		// 네트워크 통신 문자열 분석 알고리즘의 기능을 구현하시오.
		// a문자를 통신 문자이다.
		// a문자 중 가장 긴 길이를 출력하시오.
		String a ="aabbccddeeeaaaa";
		int count = 0, maxCount = 0;
		for (int i=0; i<a.length(); i++) {
			count = 0;
			char temp = a.charAt(i);
			if (temp == 'a') {
				for (int j=i; j<a.length(); j++) {
					if (a.charAt(j) != 'a') {
						break;
					} else {
						count++;
					}
				}
				if (maxCount < count) {
					maxCount = count;
				}
				i = i + count - 1;
			}
		}
		System.out.println(maxCount);
	}
}
