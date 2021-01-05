package co.ho.ex3.member.vo;

public class MemberVo {
	private String memberId;
	private String memberName;
	private String password;
	private String memberAuth;
	private int memberPoint;
	
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMemberAuth() {
		return memberAuth;
	}
	public void setMemberAuth(String memberAuth) {
		this.memberAuth = memberAuth;
	}
	public int getMemberPoint() {
		return memberPoint;
	}
	public void setMemberPoint(int memberPoint) {
		this.memberPoint = memberPoint;
	}
	
	public String toString() {
		System.out.print("사용자 ID : " + memberId);
		System.out.print(", 사용자 이름 : " + memberName);
		System.out.print(", 사용자 권한 : " + memberAuth);
		System.out.println(", 사용자 포인트 : " + memberPoint);
		return null;
	}
}
