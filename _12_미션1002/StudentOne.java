package _12_미션1002;

public class StudentOne {
	// 학생의 정보
	String stId = null;		// 아이디
	String stName = null;	// 이름
	String stPhone = null;	// 핸드폰 번호
	String stGrade = null;	// 학년
	
	// 생성자, 생략가능
	StudentOne() {}
	
	// 학생의 정보를 출력하는 메서드
	public void stuOne() {
		System.out.println("▶ 아이디 : " + stId + 
							" / 이름 : " + stName + 
							" / 학년 : " + stGrade + 
							" / 핸드폰 번호 : " + stPhone);
	}
	// 학생의 정보를 저장하는 메서드
	public void setStudent(String id, String name, String phone, String grade) {
		this.stId = id;
		this.stName = name;
		this.stPhone = phone;
		this.stGrade = grade;
	}
	// 학생의 아이디를 조회하는 메서드
	public String getID() {
		return stId;
	}
	// 학생의 이름을 조회하는 메서드
	public String getName() {
		return stName;
	}
}
