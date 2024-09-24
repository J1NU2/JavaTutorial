package _07_클래스와객체_미션0923;

public class Member_One {
	// 고객의 정보 : 아이디, 이름
	String mId = null;
	String mName = null;
	
	// 고객의 정보를 출력해줄 메서드
	public void memberList() {
		System.out.println("아이디 : " + mId + " / 이름 : " + mName);
	}
	// 고객의 정보를 가져오고, 가져온 고객의 정보를 반환해줄 메서드
	public String[] getMember() {
		String[] member = new String[2];
		
		member[0] = mId;
		member[1] = mName;
		
		return member;
	}
	// 메서드 호출 시 입력받은 매개변수 값을 이름에 저장하여 반환해줄 메서드
	// 매개변수 값 : setmName메서드 호출 시 주어지는 매개변수 값이 넘어온다.
	// 매개변수 정의 : String n
	public void setmName(String n) {
		mName = n;
	}
}
