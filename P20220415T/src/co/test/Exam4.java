package co.test;

//클래스의 생성과 필드, 메소드, 생성자.
public class Exam4 {
	// 친구의 이름, 생일, 연락처(중복값이 없는 키의 역할)
	private String name;
	private String birthD;
	private String phon;
	
	
	public Exam4(String name, String birthD, String phon) {
		super();
		this.name = name;
		this.birthD = birthD;
		this.phon = phon;
	}


	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getBirthD() {
		return birthD;
	}


	public void setBirthD(String birthD) {
		this.birthD = birthD;
	}


	public String getPhon() {
		return phon;
	}


	public void setPhon(String phon) {
		this.phon = phon;
	}
	
	
}
