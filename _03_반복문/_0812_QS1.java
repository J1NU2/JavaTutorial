package _03_반복문;

public class _0812_QS1 {

	public static void main(String[] args) {
		// 특별1
		// 문자열 a는 한자릿수의 숫자를 수집한 문자열이다.
		// 숫자별로 수집된 수만큼 카운팅하세요.
		// 카운팅 배열은 int[] a = new int[10];
		// 위 선언문은 길이 10의 배열을 생성한 선언문이다. 초기값은 0이다.
		// 인덱스 0~9까지를 숫자로 정의한다.
		// 조건 : 형변환은 사용하지 않는다. 메서드는 charAt()만 사용한다.
		String aStr = "6/4/3/2/5/1/4/5/6/7/8/9/1/2/3/4/5/6";	// 초기값
		int[] aArr = new int[10];								// 초기값
		
		// 1. for문 반복 : 자료형이 String인 aStr의 0번~마지막 인덱스 까지 반복
		// 2. if문 조건 : 자료형이 aStr인 문자열에서 charAt메소드로 떼어낸 문자가 '0'~'9'에 해당될 경우의 조건
		// > '0' 이라면 배열 aArr의 0번 인덱스의 값을 +1 (aArr[-]++)
		for (int i=0; i<aStr.length(); i++) {	// ASCII Code 10진수
			if (aStr.charAt(i) == '0') {		// 48
				aArr[0]++;
			} else if (aStr.charAt(i) == '1') {	// 49
				aArr[1]++;
			} else if (aStr.charAt(i) == '2') {	// 50
				aArr[2]++;
			} else if (aStr.charAt(i) == '3') {	// 51
				aArr[3]++;
			} else if (aStr.charAt(i) == '4') {	// 52
				aArr[4]++;
			} else if (aStr.charAt(i) == '5') {	// 53
				aArr[5]++;
			} else if (aStr.charAt(i) == '6') {	// 54
				aArr[6]++;
			} else if (aStr.charAt(i) == '7') {	// 55
				aArr[7]++;
			} else if (aStr.charAt(i) == '8') {	// 56
				aArr[8]++;
			} else if (aStr.charAt(i) == '9') {	// 57
				aArr[9]++;
			}
		}
		System.out.println("0~9의 갯수 : " + aArr[0] + "/" + aArr[1] + "/" + aArr[2] + "/" + 
							aArr[3] + "/" + aArr[4] + "/" + aArr[5] + "/" + aArr[6] + "/" + 
							aArr[7] + "/" + aArr[8] + "/" + aArr[9]);
		
		// +
		// 이중for문, 형변환 사용
		String bStr = "1/2/3/4/5/6/7/8/9/0/1/1/1/2/2/4/7/6";	// 초기값
		int[] bArr = new int[10];								// 초기값
		for (int i=0; i<bStr.length(); i++) {	// 자료형이 String인 bStr의 0번~마지막 인덱스 까지 반복
			for (int j=0; j<=9; j++) {			// 0~9까지 반복
				// 자료형이 String인 bStr의 문자열을 charAt메소드로 떼어난 문자가 '0'~'9'가 나오게 되는데,
				// 문자 '0'~'9'는 10진수로 48~57의 값을 갖게 된다.
				// 이때 정수인 j(0~9)와 문자 '0'을 더한다면 j+48의 값이 나오게 되므로 j가 0~9를 반복할 때 48~57의 값이 나온다.
				// 나온 값인 48~57을 형변환을 통해 char로 바꿔준다면 '0'~'9'의 문자가 나오게 된다.
				if (bStr.charAt(i) == (char)(j + '0')) {
					bArr[j]++;					// bArr배열의 0~9번째 인덱스의 값을 +1 해준다. (bArr[j]++)
				}
			}
		}
		System.out.println("0~9의 갯수 : " + bArr[0] + "/" + bArr[1] + "/" + bArr[2] + "/" + 
				bArr[3] + "/" + bArr[4] + "/" + bArr[5] + "/" + bArr[6] + "/" + 
				bArr[7] + "/" + bArr[8] + "/" + bArr[9]);
	}

}
