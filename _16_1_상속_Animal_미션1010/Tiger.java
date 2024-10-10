package _16_1_상속_Animal_미션1010;

// 자식 클래스, Sub Class
public class Tiger extends Animal {		// 부모 클래스로 Animal 클래스를 상속 받는다.
	// 메서드 오버라이드를 통한 재정의
	@Override
	public void prey() {	// 먹는 기능
		System.out.println(super.animalName + "(이)가 닭 한마리 냠냠");
	}
}
