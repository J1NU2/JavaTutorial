package _07_클래스와객체_예제;

public class Dog {
	// 멤버변수
	String name = null;
	String type = null;
	
	// 생성자
	// 생성자는 작성하지 않아도 숨겨져있다.
	Dog() { }
	
	// 메서드
	public void eat() {
		System.out.println(name + "(이)가 밥을 먹는다.");
	}
}
