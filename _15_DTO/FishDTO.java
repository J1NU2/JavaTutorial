package _15_DTO;

public class FishDTO {
	// 멤버변수
	private String id = null;
	private String pwd = null;
	private String indate = null;
	
	// 아이디
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	// 패스워드
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	// 생성날짜
	public String getIndate() {
		return indate;
	}
	public void setIndate(String indate) {
		this.indate = indate;
	}
	
	// DTO 정보 디버깅용 메서드
	@Override
	public String toString() {
		return "FishDTO [id=" + id + ", pwd=" + pwd + ", indate=" + indate + "]";
	}
	
}
