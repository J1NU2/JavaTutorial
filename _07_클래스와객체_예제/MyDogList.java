package _07_클래스와객체_예제;

public class MyDogList {
	// 배열 생성
	/* Dog 배열
	 * 	 index  :  	 0		 1		 2		 3		 4
	 * dogList  =	null	null	null	null	null
	 */
	Dog[] dogList = new Dog[5];
	
	// 생성자
	// 생성자는 작성하지 않아도 숨겨져있다.
	MyDogList() {
		System.out.println("★ 내 강아지 관리 ★");
		// 생성된 배열 dogList의 0번째 인덱스의 값이 뭔지 확인
		// 인덱스의 값을 객체의 주소를 가진다.
		System.out.println(dogList[0]);
		
		// NullPointerException 에러 발생
		// 왜? 참조하는 객체의 주소가 null값이기 때문에 에러가 발생한다.
//		System.out.println(dogList[0].name);
		// 아래와 같이 코드를 바꿔줘야한다.
		if (dogList[0] != null) {
			System.out.println(dogList[0].name);
		}
		
		dogList[1] = new Dog();
		System.out.println(dogList[1]);		// 객체의 주소 2c13da15
		dogList[2] = dogList[1];
		System.out.println(dogList[2]);		// 객체의 주소 2c13da15
		dogList[3] = new Dog();
		System.out.println(dogList[3]);		// 객체의 주소 77556fd
		Dog dList = new Dog();
		dogList[4] = dList;
		System.out.println(dList);			// 객체의 주소 368239c8
		System.out.println(dogList[4]);		// 객체의 주소 368239c8
		
		dogList[1].name = "멍멍이";
		System.out.println(dogList[1].name);	// 멍멍이
		System.out.println(dogList[2].name);	// 멍멍이
		System.out.println(dogList[3].name);	// null
		
		for (int i=0; i<dogList.length; i++) {
			if (dogList[i] != null) {
				System.out.println(dogList[i].name);
			}
		}
		
		// 특정 강아지 찾기
		String check = "멍멍이";
		for (int i=0; i<dogList.length; i++) {
			if (dogList[i] != null) {
				if (dogList[i].name.equals(check)) {
					System.out.println("강아지 찾았다!");
					System.out.println("어디 있었는데?");
					System.out.println(i + "에 있었어!");
					break;
				}
			}
		}
	}
}
