package _16_상속_Unit;

// Super Class
public class Unit {
	public int hp = 100;
	public int damage = 10;
	public String name = null;
	
	public void attack() {
		System.out.println("공격 성공, 데미지 " + damage);
	}

	@Override
	public String toString() {
		return "Unit [hp=" + hp + ", damage=" + damage + ", name=" + name + "]";
	}
}
