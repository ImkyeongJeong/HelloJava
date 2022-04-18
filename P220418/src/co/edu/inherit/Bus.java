package co.edu.inherit;

public class Bus extends Car{

	// 필드
	String busNo;
	
	// 생성자
	public Bus() {
		super();	//super():부모가 갖고 있는 기본 생성자를 호출
		System.out.println("Bus() 생성자 호출");
	}
	
	// 메소드
	public void fee() {
		System.out.println("요금을 받습니다.");
	}
	
	// 부모클래스가 갖고 있는 메서드 자식이 재정의(오버라이딩)
	@Override //에러 검출
	public void drive() {
		System.out.println("버스가 운행을 합니다.");
	}

	@Override
	public String toString() {
		return "Bus [busNo=" + busNo + ", model = " + super.model + "]";
//		return super.toString(); //부모가 갖고 있는 것 호출
	}
	
}
