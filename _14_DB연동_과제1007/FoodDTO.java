package _14_DB연동_과제1007;

public class FoodDTO {
	// 멤버변수
	String name = null;		// 음식이름
	String type = null;		// 음식종류
	String maker = null;	// 만든 사람
	String shop = null;		// 음식점
	
	// 음식이름
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	// 음식종류
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	// 만든 사람
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	// 음식점
	public String getShop() {
		return shop;
	}
	public void setShop(String shop) {
		this.shop = shop;
	}
}
