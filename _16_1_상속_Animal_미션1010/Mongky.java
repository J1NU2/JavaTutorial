package _16_1_상속_Animal_미션1010;

// 자식 클래스, Sub Class
public class Mongky extends Animal {	// 부모 클래스로 Animal 클래스를 상속 받는다.
	// 부모 클래스, Super Class
	// 상속받는 클래스에서 추상 메서드 선언이 된 메서드는 자식 클래스(Sub Class)에서 반드시 오버라이드 해야 한다.
	@Override
	public void prt() {
		
	}
	
	// 메서드 오버라이드를 통한 재정의
	@Override
	public void prey() {	// 먹는 기능
		System.out.println(super.animalName + "(이)가 바나나 10개 냠냠");
	}
}
