package co.edu.inherit;
// Taxi, Bus, Truck
// 공통적인 건 부모에 정의
public class Car {
	
	// 필드
	String model;
	
	// 기본 생성자
	public Car() {
		System.out.println("Car() 생성자 호출");
	}
	
	// 메소드
	public void drive() {
		System.out.println("운행을 합니다.");
	}
}
