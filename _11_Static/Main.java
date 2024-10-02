package _11_Static;

public class Main {
	// 접근제어자 공용변수 리턴타입 메서드명 매개변수정의
	public static void main(String[] args) {
		// 스레드가 코드를 실행한다.
		// 현재 코드를 실행하는 스레드의 여러 정보 중 스레드의 이름을 name변수에 저장한다.
		String name = Thread.currentThread().getName();
		System.out.println(name + "스레드가 1초 뒤에 시작합니다.");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// static변수는 공용변수, 위치는 Method Area
		// 모든 스레드가 공용하여 사용이 가능하다.
		// 즉, 변수값에 접근이 가능한 것이다.
		// 객체를 만들지 않고 클래스명과 변수, 메서드명으로 접근한다.
		String a = MemberADM.companyName;
		System.out.println(a);
		System.out.println(MemberADM.companyName);
		MemberADM.prt();
		// 누군가 변수값을 변경할 수 있어, 보안에 취약하다는 단점이 있다.
		MemberADM.companyName = "HOman";
		System.out.println(MemberADM.companyName);
		// final : 초기값이 결정되면 이후 값을 변경할 수 없다. (상수)
//		MemberADM.teamName = "변경";	// 에러발생 : final을 사용해 상수로 만들어줬으므로 다른 클래스에서 변경이 불가능하다.
		
		
		new MemberADM();
		/* 새로운 스레드를 하나 만들어서 멀티스레드로 운용이 가능하다.
		 * Thread t1 = new Thread();
		 * t1.setName("test1_thread");
		 * String tname = t1.getName();
		 * System.out.println("새로만든 스레드 이름은 '" + tname + "'이다.");
		 */
		
	}

}
