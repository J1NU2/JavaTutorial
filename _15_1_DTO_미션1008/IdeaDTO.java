package _15_1_DTO_미션1008;

public class IdeaDTO {
	// 멤버변수
	private int no = 0;				// 아이디어 번호(시퀀스로 처리)
	private String title = null;	// 아이디어 제목
	private String content = null;	// 아이디어 내용
	private String author = null;	// 작성자
	
	// 아이디어 번호 Getter/Setter
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	// 아이디어 제목 Getter/Setter
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	// 아이디어 내용 Getter/Setter
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	// 아이디어 작성자 Getter/Setter
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	// DTO 모든 정보 디버깅용 메서드
	@Override
	public String toString() {
		// 예시) ◇ [ No.0 : 제목=제목, 내용=내용, 작성자=작성자 ]
		return "◇ [ No." + no + " : 제목=" + title + ", 내용=" + content + ", 작성자=" + author + " ]";
	}
	// DTO 번호 및 제목 정보 디버깅용 메서드
	public String toNumberTitle() {
		// 예시) ◇ [ No.0 : 제목=제목, 내용=내용, 작성자=작성자 ]
		return "◇ [ No." + no + " : 제목=" + title + " ]";
	}
}
