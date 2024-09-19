package _07_클래스와객체_예제;

// 고양이 한마리에 대한 단일 책임을 정의한 클래스
public class Cat_Object {
	String name = null;
	int age = 0;
	
	public void catInfo() {
		System.out.println("--- Cat Info ---");
		System.out.println("이름 : " + name + " / 나이 : " + age);
	}
}
