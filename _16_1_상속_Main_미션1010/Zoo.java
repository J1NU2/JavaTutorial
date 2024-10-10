package _16_1_상속_Main_미션1010;

import java.util.ArrayList;

import _16_1_상속_Animal_미션1010.Animal;
import _16_1_상속_Animal_미션1010.Mongky;
import _16_1_상속_Animal_미션1010.Tiger;

// 프로그램 시작
public class Zoo {

	public static void main(String[] args) {
		// 동물들을 저장할 리스트
		ArrayList<Animal> animal = new ArrayList<>();
		
		Animal tiger = new Tiger();		// 다형성
		tiger.animalName = "호돌이";
		tiger.age = 1;
		tiger.weight = 40;
		animal.add(tiger);
		
		tiger = new Tiger();			// 다형성
		tiger.animalName = "호순이";
		tiger.age = 2;
		tiger.weight = 60;
		animal.add(tiger);
		
		Animal mongky = new Mongky();	// 다형성
		mongky.animalName = "숭이";
		mongky.age = 3;
		mongky.weight = 30;
		animal.add(mongky);
		
		// 정보 출력
		for (Animal a : animal) {
			System.out.println(a.toString());	// 동물 정보
			// 먹는 기능, 각 자식 클래스(Sub Class)에서 메서드 오버라이드(재정의)한 내용이 출력된다.
			a.prey();
			System.out.println();
		}
	}

}
