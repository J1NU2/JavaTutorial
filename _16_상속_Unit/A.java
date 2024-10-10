package _16_상속_Unit;

// Sub Class
public class A extends Unit {
	// 재정의
	@Override
	public void attack() {
		System.out.println("A가 공격했습니다.");
	}
}
