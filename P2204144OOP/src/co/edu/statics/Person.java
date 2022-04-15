package co.edu.statics;

public class Person {
	//final: 값을 한번 할당하면 변경불가
	final String nation = "Korea";
	final String ssn; 				//생성자를 통해 값 할당
	static final double PI = 3.14;	//클래스소속, 변경불가
	String name;
	
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
