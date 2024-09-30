package _10_1_접근제어자;

// 다른 패키지
import _10_2_접근제어자.MemberOne;

public class Main {

	public static void main(String[] args) {
		MemberOne m = new MemberOne();
		
//		m.name = "HongGilDong";	// ERROR : name변수의 접근제어자는 defalut
		m.prt();				// OK : prt메서드의 접근제어자는 public
		
		// 만약 setName메서드의 접근제어자가 defalut라면?
//		m.setName();			// ERROR : setName메서드의 접근제어자는 defalut
		
		m.setName("1234");
		m.setName("4321");
	}

}
