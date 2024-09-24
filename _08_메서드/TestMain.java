package _08_메서드;

public class TestMain {

	public static void main(String[] args) {
		TestMethod t = new TestMethod();
		System.out.println(t.name);
		// 메서드 호출
		t.setName("Hong");
		System.out.println(t.name);
		// 메서드 호출
		System.out.println(t.getName0());
		
		String resultName = t.getName1("1100");
		if (resultName != null) {
			System.out.println(resultName);
		} else {
			System.out.println("비번이 틀렸습니다.");
		}
		
		System.out.println(t.maskName("@"));
	}

}
