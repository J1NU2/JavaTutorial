package _07_클래스와객체_미션0920;

public class T_Main_Ex {

	public static void main(String[] args) {
		// T_Center를 의존하기 때문에 변수가 필요하다.
		// T_Center tCenter = null;
		// 하지만 위 형태로는 참조가 불가능하다.
		// 왜 불가능한가?
		// 객체에 대한 주소가 없기 때문이다.
		// 객체를 만드려면 직접 new연산자를 만들거나, 다른 변수의 주소값을 가져오면 된다.
		
		T_Center_Ex tCenter = new T_Center_Ex();
		// 1. 의존관계
		// 2. 주소값을 저장하는 상황
		// 직접 객체를 만들어서 주소를 참조하고 있다.
		
		
	}

}
