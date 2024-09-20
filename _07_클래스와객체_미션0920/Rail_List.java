package _07_클래스와객체_미션0920;

public class Rail_List {
	int[] railNumber = {1111, 2222, 3333, 4444};
	String[] railType = {"무궁화", "새마을"};
	boolean[] railRepair = {false, false, false, false};
	
	public void railRepairList() {
		for (int i=0; i<railNumber.length; i++) {
			if (railRepair[i] == true) {
				if ((railNumber[i] % 2) == 1) {
					System.out.println("기차번호 : " + railNumber[i] + " / 기차종류 : " + railType[0] + " / 수리중");
				} else {
					System.out.println("기차번호 : " + railNumber[i] + " / 기차종류 : " + railType[1] + "* / 수리중");
				}
			}
		}
	}
}
