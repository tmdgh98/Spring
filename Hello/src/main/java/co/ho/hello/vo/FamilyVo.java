package co.ho.hello.vo;

public class FamilyVo {
	private String papaName;
	private String mamyName;
	private String myName;
	private String brother;
	
	public String getPapaName() {
		return papaName;
	}
	public void setPapaName(String papaName) {
		this.papaName = papaName;
	}
	public String getMamyName() {
		return mamyName;
	}
	public void setMamyName(String mamyName) {
		this.mamyName = mamyName;
	}
	public String getMyName() {
		return myName;
	}
	public void setMyName(String myName) {
		this.myName = myName;
	}
	public String getBrother() {
		return brother;
	}
	public void setBrother(String brother) {
		this.brother = brother;
	}
	
	public String toString() {
		System.out.println("=========가족이름=========");
		System.out.println("==아빠 이름=="+papaName);
		System.out.println("==엄마 이름=="+mamyName);
		System.out.println("==나의 이름=="+myName);
		System.out.println("==동생 이름=="+brother);
		return null;
	}
}
