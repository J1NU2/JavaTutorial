package _11_Static;

public class MemberADM {
	public final String name = null;
	public static String companyName = "Human";
	public static final String teamName = "NewTeam";
	
	MemberADM() {
//		this.name = "asdf";		// 에러발생 : 상수는 초기값이 결정된 후 변경이 불가능하다.
		String name = Thread.currentThread().getName();
		System.out.println(name + "스레드가 MemberADM 생성자 실행");
	}
	
	public static void prt() {
		System.out.println(companyName);
	}
}
