package _03_반복문;

public class _0812_Q08 {

	public static void main(String[] args) {
		// 문제8
		// 최대값을 구하는 문제에서 변수를 사용하지 않고 배열만 이용하여 푸는 방법을 생각해보자.
		// 배열의 0번 인덱스에 가장 큰 값을 저장할 것이라고 가장해보자.
		// 0번 인덱스가 가장 큰 값이라고 정의하고 1번부터 마지막까지 순회하면서 가장 큰 값이 나오면 가장 큰 값을 갱신한다.
		// 위 방식으로 가장 큰 수를 구하시오.
		int[] a = {34,2,35,8,31,45};	// 초기값
		
		for (int i=0; i<a.length; i++) {	// 0부터 a배열의 최대길이까지 반복
			if (a[0] < a[i]) {				// a[0]의 값이 a배열의 i번째 값보다 작을 경우의 조건
				a[0] = a[i];				// a[0]의 값을 a배열의 i번째 값으로 저장
			}	// a배열의 0번째 인덱스에 큰 수를 배치
		}
		System.out.println(a[0]);			// a배열에서 가장 큰 수가 저장된 a배열의 0번째 인덱스를 출력
		
		// + 문제수정 : 변수 사용 가능
		int[] b = {34,2,35,8,31,45};	// 초기값
		int saveNum = 0;				// 큰 값을 저장하는 변수
		for (int i=b.length - 1; i>0; i--) {	// b배열의 마지막 인덱스부터 0까지 반복
			if (b[i] > b[i-1]) {				// b배열의 i번째 인덱스의 값이 이전 인덱스의 값보다 클 경우의 조건
				saveNum = b[i];					// saveNum 변수에 b배열의 i번째 값을 저장
				b[i] = b[i-1];					// b배열의 i번째 값에 i-1번째 값을 저장
				b[i-1] = saveNum;				// b배열의 i-1번째 saveNum 변수의 값을 저장
				// 배열의 마지막 인덱스부터 다시 비교하기 위해 i값을 b.length으로 초기화 (i=b.length)
				i = b.length;
			}
		}
		System.out.println(b[0] + "," + b[1] + "," + b[2] + "," + b[3] + "," + b[4] + "," + b[5]);
		System.out.println(b[0]);	// b배열에서 가장 큰 수가 저장된 b배열의 0번째 인덱스를 출력
	}

}
