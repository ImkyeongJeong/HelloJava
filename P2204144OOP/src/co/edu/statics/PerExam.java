package co.edu.statics;

public class PerExam {
	public static void main(String[] args) {
		Person p1 = new Person("1234-12324", "홍길동");
		
		p1.name = "김길동";
		//final로 선언되어있어 변경불가
//		ps.ssn = "123-123";
		
		Person p2 = new Person("1234-1234", "김길동");
	}
}
