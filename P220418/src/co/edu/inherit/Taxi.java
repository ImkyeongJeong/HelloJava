package co.edu.inherit;

public class Taxi extends Car{
	
	// 필드
	String type; // 개인택시, 회사택시
	
	// 생성자
	public Taxi() {
		System.out.println("Taxti() 생성자 호출");
	}
	
	// 메소드
	public void metering() {
		System.out.println("요금 계기판");
	}
	
	// 부모클래스가 갖고 있는 메서드 자식이 재정의(오버라이딩)
	@Override //에러 검출
	public void drive() {
		System.out.println("택시가 운행을 합니다.");
	}

	@Override
	public String toString() {
		return "택시의 종류는 " + type;
	}

}
