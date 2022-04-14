package co.edu;

public class Student {
	// 필드
	String name;
	String studNo;
	int age;
	double height;
	
	
	
	
	
	// 생성자: 인스턴스를 만들어줄 때 처리할 기능정의 (메소드처럼 생겼지만 반환값이 없다) 
	// 매개값이 없는 생성자: 기본 생성자 (따로 정의하지 않으면 자바 컴파일러가 자동생성)
	public Student() {
		System.out.println("Student() 생성자가 호출되었습니다.");
	}

	// 생성자: 필드의 값을 지정할 때 사용, 여러번 필요한 만큼 정의해서 사용가능
	public Student(String nm, String sn) {
		//name필드에 첫번째 매개값 넣어주는 기능
		name = nm;
		studNo = sn;
	}
	
	//생성자 사용하면 인스턴스 생성 후 변수를 통해 필드에 값을 안 넣어주고 매개변수로 바로 값을 담을 수 있음
	public Student(String name, String studNo, int age, double height) {
		//this: 자신 객체 참조, 매개변수명과 구분하기 위함
		this.name = name;
		this.studNo = studNo;
		this.age = age;
		this.height = height;
	}

	// 이름, 학번, 나이 채워주는 생성자 만들기 (매개변수 이름 다르게 선언, 
	public Student(String nm, String sn, int ag) {
		name = nm;
		studNo = sn;
		age = ag;
	}
	
	
	
	
	
	
	
	// 메소드
	void study() {
		System.out.println(name + "가 공부를 합니다.");
	}
	
	void eat() {
		System.out.println(name + "가 식사를 합니다.");
	}
	
	void showInfo() {
		System.out.println("이름은 " + name + "이고 학생번호는 " + studNo + "이고 나이는 " + age + "이고 키는 " + height + "입니다.");
	}
}
