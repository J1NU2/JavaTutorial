package _0_JavaWord;

// 영어단어에 대한 정보를 저장할 클래스
public class Word {
	String english = null;
	String korean = null;
	
	public void wordList() {
		System.out.println("◇ 영어단어 : " + english + " / 한글 뜻 : " + korean);
	}
	
	// 생성자, 생략해도 상관없다.
	Word() {}
}
