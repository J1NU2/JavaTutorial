package _07_클래스와객체_미션0920;

public class Rail_Time {
	Rail_List railList = new Rail_List();
	
	int railNumber = 0;
	String railTime = "";
	
	public void railTimeList() {
		if ((railNumber % 2) == 1) {
			System.out.println("기차번호 : " + railNumber + " / 기차종류 : " + railList.railType[0] + " / 도착시간 : " + railTime);
		} else {
			System.out.println("기차번호 : " + railNumber + " / 기차종류 : " + railList.railType[1] + "* / 도착시간 : " + railTime);
		}
	}
}
