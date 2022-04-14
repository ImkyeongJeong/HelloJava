package co.edu;

public class Member {
	// 필드 => 회원아이디, 회원이름, 회원연락처, 회원나이
	//private (잘못된 접근 못하도록) 메소드를 통해서만 접근 가능하도록
	private String memberId;
	private String memberName;
	private String memberPhon;
	private int memberAge;
	
	
	
	// 생성자
	public Member(String memberId, String memberName, String memberPhon, int memberAge) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
		this.memberPhon = memberPhon;
		this.memberAge = memberAge;
	}
	
	
	

	// 메소드
	//잘못된 값이 들어오면 메소드에서 걸러서 값 삽입되도록
	//리턴타입이 있다면 반환타입 동일해야 함
	
	void setMemberId(String memberId) {
		//this.memberId:필드 , memberId: 매개변수 값 (둘 구분하기 위해 this사용)
		this.memberId = memberId;
	}
	
	String getMemberId() {
		return memberId;
	}
	
	
	void setMemberAge(int age) {
		if(age < 0 ) {
			memberAge = 10;
		} else {
		memberAge = age;
		}
	}
	
	int getMemberAge() {
		return memberAge; 
	}
	
	void showInfo() {
		System.out.printf("회원이름 %4s \n 연락처 %13s\n 나이 %2d", memberName, memberPhon, memberAge);
	}

	
	
	
	//우클릭 source get,set
	public String getMemberName() {
		return memberName;
	}


	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}


	public String getMemberPhon() {
		return memberPhon;
	}


	public void setMemberPhon(String memberPhon) {
		this.memberPhon = memberPhon;
	}
	
	
	
}
