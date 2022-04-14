package co.edu;

//   객체 => 도면 => 텔레비전(삼성, 엘지)
// Object > Class > Instance
// 추상화(TV의 모든 속성을 정의하는 것이 아닌 필요한 부분만 정의해서 사용하는 것)
public class Television {
	// 속성(필드)
	String company;
	String model;
	int price;
	String color;
	
	// 기능(메소드): 반환유형, 메소드명, 매개변수 3개의 정보 필요
	//void: 반환유형이 없다는 뜻 / 매개변수: 있어도 되고 없어도 됨
	void turnOn() {
		System.out.println("텔레비젼을 켭니다.");
	}
	
	void turnOff() {
		System.out.println("텔레비젼을 끕니다.");
	}
	
	void changeChanel(int chanel){
		System.out.println(chanel + "번 채널로 변경합니다.");
	}
}
