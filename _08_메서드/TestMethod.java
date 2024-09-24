package _08_메서드;

public class TestMethod {
	// 생성자는 안보이지만 생략이 되어있다.
	
	// 멤버변수 name
	String name = null;
	
	// 메서드 정의
	// 접근제어자 : public : 공개
	// 리턴타입 : void : 반환값이 없다.
	// 메서드명 : setName : 메서드의 이름
	// 매개변수 정의 : (String n) : 자료형이 String인 매개변수 n
	public void setName(String n) {
		name = n;
	}
	// 메서드 정의
	public String getName0() {
		return name;
	}
	// 메서드 정의
	public String getName1(String pwd) {
		if (pwd.equals("1111")) {
			return name;
		} else {
			return null;
		}
	}
	// 1. 이름 뒤에 마스킹을 해주는 메서드 만들기
	//	  호출할 때 문자열로 마스킹 문자를 지정하면, 이름 뒤에 마스킹 문자를 연결하여 리턴한다.
	//	  메서드명 maskName
	public String maskName(String masking) {
		return name+masking;
	}
}
