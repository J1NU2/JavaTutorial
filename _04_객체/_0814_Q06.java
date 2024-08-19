package _04_객체;

//import java.util.Arrays;
import java.util.Random;

public class _0814_Q06 {

	public static void main(String[] args) {
		// 문제6
		// 컴퓨터는 랜덤으로 로또 번호를 10000번 뽑는다.
		// 가장 많이 뽑힌 로또 번호가 오늘의 추천 로또 번호이다.
		// 오늘의 추천 로또 번호 하나를 출력하시오.
		// 만약 로또 번호가 같은 횟수로 나왔을 경우에는 큰 숫자를 우선한다.
		Random ran = new Random();	// Random 객체 생성
		
		int[] arr = new int[45];	// 로또 번호에 맞는 카운트를 저장할 배열, arr[0]=1, arr[1]=2 ... arr[44]=45
		int maxCount = 0;			// 가장 많이 뽑힌 횟수를 저장할 변수
		int sugNum = 0;				// 추천 로또 번호를 저장할 변수
		
		for (int i=1; i<=10000; i++) {			// 1부터 10000까지 순회하는 반복문
			int lottoNum = ran.nextInt(45) + 1; // lottoNum변수에 1~45의 랜덤한 값 저장
			arr[lottoNum-1]++;					// arr배열에 0~44의 인덱스의 값에서 +1씩 증가
		}
		
		// Arrays 클래스의 toString() 메소드
		// 배열의 arr를 toString()의 파라미터로 넣어서 배열의 값들을 문자열 형태로 리턴해준다.
		// System.out.println(Arrays.toString(arr));
		
		for (int i=0; i<arr.length-1; i++) {	// 0부터 arr배열의 길이-1까지 반복 (0~44)
			// 가장 많이 뽑힌 횟수가 초기값일 경우의 조건
			if (maxCount == 0) {
				maxCount = arr[i];		// arr[0]의 값을 저장
				sugNum = i+1;			// arr[0]번의 로또 번호는 1이므로, i(0)+1을 sugNum변수에 저장
			}
			// 뽑힌 횟수가 더 높을 경우의 조건
			if (maxCount <= arr[i+1]) {
				maxCount = arr[i+1];	// 횟수가 더 높은 arr[i+1]의 값을 저장
				sugNum = i+2;			// 현재의 로또 번호에 +1을 해줘야하는데, i는 0이므로 i+2를 sugNum변수에 저장
			}
		}
//		System.out.println("");
		System.out.println("추천 로또 넘버 : " + sugNum);
		System.out.println("뽑은 횟수 : " + maxCount);
	}

}
