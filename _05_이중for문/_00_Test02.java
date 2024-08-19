package _05_이중for문;

public class _00_Test02 {

	public static void main(String[] args) {
		// 시나리오1
		// 한 줄에 별(*)을 3개씩 출력하시오.
		
		// for문
		System.out.println("----- 시나리오1 for문 -----");
		for (int i=0; i<4; i++) {
			System.out.println("***");
		}
		
		// 2중 for문 1
		System.out.println("----- 시나리오2 2중 for문 -----");
		for (int i=0; i<4; i++) {
			for (int j=0; j<3; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 시나리오2
		// 한 줄에 별(*)을 하나씩 추가하면서 출력하시오.
		// 2중 for문 2
		System.out.println("----- 시나리오2 -----");
		for (int i=0; i<4; i++) {
			for (int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 시나리오3
		// id에 특수문자가 있는지 확인하시오.
		System.out.println("----- 시나리오3 -----");
		String id = "abc*";
		String sign = "*^$";
		int cnt = 0;
		for (int i=0; i<id.length(); i++) {
			for (int j=0; j<sign.length(); j++) {
				if (id.charAt(i) == sign.charAt(j)) {
					System.out.println("특수문자 '" + id.charAt(i) + "'가 존재합니다.");
					cnt++;
				}
			}
		}
		if (cnt > 0) {
			System.out.println("id에 특수문자가 " + cnt + "개 있습니다.");
		} else {
			System.out.println("id에 특수문자가 없습니다.");
		}
	}

}
