package co.edu.friend;

public class ComFriend extends Friend{

	private String company;
	private String department;
	
	public ComFriend(String name, String phon, String company, String department) {
		super(name, phon);
		this.company = company;
		this.department = department;
	}

	
	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}

	@Override //this.getName(), super.getPhon() 부모클래스 상속 받아 필드정보 가져올 수 있음 두개 다 가능
	public String toString() {
		return "ComFriend [name=" + this.getName() + ", phon=" + super.getPhon() + ", company=" + company + ", department=" + department + "]";
	}

}
