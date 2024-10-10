package _16_상속_Main;

import java.util.ArrayList;

import _16_상속_Unit.A;
import _16_상속_Unit.B;
import _16_상속_Unit.Unit;

public class Main {

	public static void main(String[] args) {
		ArrayList<Unit> uList = new ArrayList<>();
		
		// 다형성
		Unit a = new A();
		a.name = "A";
		a.hp = 200;
		a.damage = 15;
		uList.add(a);
		
		// 다형성
		Unit b = new B();
		b.name = "B";
		b.hp = 20;
		b.damage = 40;
		uList.add(b);
		
		for (Unit u : uList) {
			System.out.println(u.toString());
			u.attack();
		}
	}

}
