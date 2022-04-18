package co.edu.friend;

public class UnivFriend extends Friend{
	
	private String univ;
	private String major;
	
	//생성자를 생성 안하면 기본 생성자를 생성하려 한다. / String name, String phone 부모클래스 매개 받음
	public UnivFriend(String name, String phone, String univ, String major) {
		super(name, phone); //부모클래스가 갖고 있는 생성자를 활용해 호출
		this.univ = univ;
		this.major = major;
	}

	
	public String getUniv() {
		return univ;
	}

	public void setUniv(String univ) {
		this.univ = univ;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	
	@Override
	public String toString() {
		return "UnivFriend [name=" + this.getName() + ", phon=" + super.getPhon() + ", univ=" + univ + ", major=" + major + "]";
	}

}
