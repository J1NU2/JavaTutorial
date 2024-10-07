package _14_DB연동;

public class MemberDTO {
	private String id = null;
	private String name = null;
	private int age = 0;
	private String indete = null;
	
	// 아이디
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	// 이름
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	// 나이
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	// 날짜
	public String getIndete() {
		return indete;
	}
	public void setIndete(String indete) {
		this.indete = indete;
	}
	
	
}
