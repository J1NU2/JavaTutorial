package _10_2_접근제어자;

public class MemberOne {
	// 접근제어자 default 생략 가능
	// default String name = null;
	String name = null;
	
	public void prt() {
		System.out.println("이름" + name);
	}
	
	public void setName(String n) {
		if (chkName(n)) {
			this.name = n;
		} else {
			this.name = "ERROR";
		}
		System.out.println(this.name);
	}
	
	// chkName은 내부적으로 호출하는 메서드로 정의하였으므로 private가 적당하다.
	private boolean chkName(String n) {
		if (n.charAt(0) == '4') {
			return false;
		}
		return true;
	}
	
}
