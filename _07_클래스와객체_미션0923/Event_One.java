package _07_클래스와객체_미션0923;

public class Event_One {
	// 이벤트의 정보 : 제목, 내용
	String eTitle = null;
	String eDetail = null;
	
	// 이벤트의 정보를 출력해줄 메서드
	public void eventList() {
		System.out.println("제목 : " + eTitle);
		System.out.println("내용 : " + eDetail + "\n");
	}
}
