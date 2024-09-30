package _10_2_접근제어자;

public class CatDTO {
	// 멤버변수는 은닉화 시키는 것이 좋다.
	// 접근제어자로 은닉화 시킨다면 CatDTO클래스 외부에서 변수에 참조를 어떻게 해야할까?
	// 일단 은닉화를 한 뒤, 멤버변수에 저장 및 인출에 관련된 메서드를 만든다.
	// 저장하는 메서드를 setter, 인출하는 메서드를 getter라고 부른다.
	private String name = null;
	private int age = 1;
	
	// 이름을 인출(조회)하는 메서드
	public String getName() {
		return name;
	}
	// 이름을 저장하는 메서드
	public void setName(String name) {
		chkName(name);
		this.name = name;
	}
	// 이름 체크를 위한 메서드
	private void chkName(String name) {
		
	}
	// 나이를 인출(조회)하는 메서드
	public int getAge() {
		return age;
	}
	// 나이를 저장하는 메서드
	public void setAge(int age) {
		this.age = age;
	}
	
}
