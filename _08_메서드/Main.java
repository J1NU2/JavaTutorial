package _08_메서드;

public class Main {

	public static void main(String[] args) {
		// TestMethod r = new TestMethod();
		
		// Method Study
		//  index = 012345
		String a = "981117";
		System.out.println(a);
		System.out.println(a.substring(0, 2));
		
		String year = a.substring(0, 2);
		System.out.println("19" + year);
		
		// 다음 에러의 원인을 서술하시오.
		// int month = a.substring(2, 4);	// 리턴타입이 String이기때문에 에러가 발생한다.
		// 원시타입 자료형인 int에 해당 리턴값을 저장하고 싶다면 다음과 같이 사용하면 된다.
		int month = Integer.parseInt(a.substring(2, 4));
		System.out.println(month);
		
		System.out.println(a.contains("1"));	// true
		System.out.println(a.contains("2"));	// false
		
		String check = "개나리";
		String title = "이런 개나리야 하지마";
		System.out.println(title.contains(check));	// true
		if (title.contains(check)) {
			System.out.println("욕하지마세요!!");
		} else {
			System.out.println("올바른 제목입니다.");
		}
		System.out.println(title.indexOf(check));
		
		// 1. 제목에서 개나리 부분을 ***으로 바꾸시오.
		System.out.println(title.replace(check, "***"));
		// 2. 제목에서 개나리라는 단어가 포함된 부분을 가져오세요.
		//	  단어가 포함된 기준은 개나리 단어의 시작부터 스페이스까지..
		//	  위 샘플에서는 "개나리야"를 가져온다.
		System.out.println(title.indexOf(check));
		System.out.println(title.indexOf(" ", title.indexOf(check)));
		System.out.println(title.substring(title.indexOf(check), title.indexOf(" ", title.indexOf(check))));
	}

}
