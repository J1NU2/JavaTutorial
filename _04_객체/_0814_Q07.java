package _04_객체;

public class _0814_Q07 {

	public static void main(String[] args) {
		// 문제7
		// 해당 배열에서 인덱스를 사람의 번호로 가정한다.
		// jobTime[2]의 의미는 2번 사람이 업무를 마치기 위한 시간(32시간)이다.
		// 작업장을 사용할 수 있는 시간은 최대 4시간이다.
		// 작업장은 한 사람만 사용할 수 있으며 사용이 끝나면 작업장을 나와야한다.
		// 사용이 끝난 후에 다음 사람이 작업장을 사용한다. (다음 사람의 업무가 종료되었다면, 그 다음 사람이 사용이 가능하다.)
		// 0번부터 1 2 3 4 5번 순서로 작업장을 사용한다면 실제 작업장을 사용한 사람의 기록을 순서대로 출력하시오.
		int[] job = {40,32,4,16,5,8};		// 초기값
		
		// 0 0 0 0 0 0 0 0 0 0 	10번
		// 1 1 1 1 1 1 1 1		8번
		// 2					1번
		// 3 3 3 3				4번
		// 4 4					2번
		// 5 5					2번
		
		double useCnt = 0;		// 사용 횟수를 저장할 변수
		
		for (int i=0; i<job.length; i++) {	// 0부터 jobTime배열의 길이-1까지 순회하는 반복문
			useCnt = job[i] / 4.0;			// useCnt변수에 jobTime배열의 i번째 값에 4를 나눈 값을 저장
			if ((useCnt % 1) != 0) {		// useCnt변수의 값을 1로 나눴을 때 0이 아닌 경우의 조건(소수일 경우의 조건)
				useCnt += 1;				// useCnt변수의 값에 1을 증가한 뒤 저장
			}
			System.out.println(i + "번째 사람의 사용 횟수 : " + (int)useCnt + "회");
		}
		
		System.out.println();
		
		// 0 1 2 3 4 5	1회
		// 0 1 3 4 5	2회
		// 0 1 3		3회/4회
		// 0 1			5회/6회/7회/8회
		// 0			9회/10회
		// 0 1 2 3 4 5 0 1 3 4 5 0 1 3 0 1 3 0 1 0 1 0 1 0 1 0 0
		
		int[] jobTime = {40,32,4,16,5,8};		// 초기값
		
		for (int i=0; i<jobTime.length; i++) {	// 0부터 jobTime배열의 길이-1까지 순회하는 반복문
			// jobTime배열의 모든 값이 0일 경우의 조건
			if ((jobTime[0]+jobTime[1]+jobTime[2]+jobTime[3]+jobTime[4]+jobTime[5]) == 0) {
				break;		// 반복문 종료
			} else if (jobTime[i] == 0) {		// jobTime배열의 i번째 값이 0일 경우의 조건
				if (i == (jobTime.length - 1)) {	// i가 jobTime배열의 마지막 인덱스일 경우의 조건
					i = -1;						// 반복문이 끝날 때 i값이 증가되므로 0부터 시작하기 위해 -1로 설정
				}
			} else {
				if (jobTime[i] <= 3 && jobTime[i] > 0) {	// jobTime배열의 i번째 값이 1~3일 경우의 조건
					jobTime[i] = 4;				// jobTime배열의 i번째 값을 4로 저장
				}
				jobTime[i] -= 4;				// jobTime배열의 i번째 값에 4를 뺀 뒤 저장
				System.out.print(i + " ");
				if (i == (jobTime.length - 1)) {	// i가 jobTime배열의 마지막 인덱스일 경우의 조건
					i = -1;						// 반복문이 끝날 때 i값이 증가되므로 0부터 시작하기 위해 -1로 설정
				}
			}
			
		}
		
	}

}
