package _02_조건문;

public class _02_Q2 {

	public static void main(String[] args) {
		/*
		 * 수강관리 프로젝트를 진행한다.
		 * 학생의 정보는 이름 학번 나이 성적이다.			// 자료형 : 문자열(이름,학번) 정수(나이,성적)
		 * 나이가 18세 미만은 수강신청을 할 수 없다.		// 조건 1		if문
		 * 성적이 60점 이상이면서 70점 미만인 학생은 수강 신청을 할 수 있지만,
		 * 이름 뒤에 별표를 추가한다.		// 조건*
		 * 학생의 성적을 기준으로
		 * 90점 이상이면 A				// 조건 1-1
		 * 80점 이상이면 B				// 조건 1-2
		 * 70점 이상이면 C				// 조건 1-3
		 * 60점 이상이면 D				// 조건 1-4		+ 조건* 해당 지점
		 * 60점 미만이면 F라고 출력한다.	// 조건 1-5		if-else문
		 */
		
		String name = "학생";
		String studentID = "24-0807";
		int age = 19;
		int score = 100;
		String credit = "";
		
		if (age > 18) {
			if (score >= 90) {
				credit = "A";
			} else if (score >= 80) {
				credit = "B";
			} else if (score >= 70) {
				credit = "C";
			} else if (score >= 60) {
				name += "★";
				credit = "D";
			} else {
				credit = "F";
			} 
			System.out.println("이름 : " + name + ", 학번 : " + studentID + ", 나이 : " + age);
			System.out.println("성적 : " + score + ", 받은 학점은 " + credit + "학점 입니다.");
		} else {
			System.out.println("18세 미만은 수강신청이 불가능합니다.");
		}
	}

}
