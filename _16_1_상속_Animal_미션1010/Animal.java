package _16_1_상속_Animal_미션1010;

// 부모 클래스, Super Class
// 추상 클래스, 추상 메서드가 있다면 객체를 만들 수 없다.
public abstract class Animal {
	// 동물에 대한 변수
	public String zooName = "휴먼동물원";	// 동물원 이름
	public String animalName = null;	// 동물 이름
	public int age = 0;					// 나이
	public int weight = 0;				// 몸무게
	
	// 추상 메서드, 구현되지 않은 상태
	// 상속받으면 반드시 오버라이드(Override)를 해야 한다.
	public abstract void prt();
	
	// 먹는 기능
	public void prey() {
		System.out.println("냠냠");
	}
	
	// 동물에 대한 정보
	@Override
	public String toString() {
		return "Animal [동물원 이름=" + zooName + ", 동물 이름=" + animalName + ", 나이=" + age + "살, 몸무게=" + weight
				+ "kg]";
	}
	
}
