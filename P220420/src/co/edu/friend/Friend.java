package co.edu.friend;
// 친구 주소록: 이름, 연락처 (공통부분) 
// 학교친구: 학교이름, 전공과목 추가로 담음
// 회사친구: 회사이름, 부서 추가로 담음
public class Friend {
	
	//필드
	private String name;
	private String phon;
	private Gender gender; // Gender타입 -> 올 수 있는 값 MEN, WOMEN
	
	// 생성자 : 다른패키지에서 접근 가능하려면 public선언
	// protected
	protected Friend() {
		
	}
	
	//생성자(name, phon필드값 채움)
	public Friend(String name, String phon) {
		super();
		this.name = name;
		this.phon = phon;
	}

	public Friend(String name, String phon, Gender gender) {
		super();
		this.name = name;
		this.phon = phon;
		this.gender = gender;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhon() {
		return phon;
	}

	public void setPhon(String phon) {
		this.phon = phon;
	}

	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	@Override //Friend클래스 호출시 이름과 연락처가 무엇인지 출력
	public String toString() {
		return "Friend [name=" + name + ", phon=" + phon + ", gen= " + gender + "]";
	}
	
}
