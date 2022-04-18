package co.edu.inherit;

public class CarExample {
	public static void main(String[] args) {
		
		Bus bus = new Bus();
		//부모에게 상속받은 필드, 메소드
		bus.model = "45인승버스";
		bus.drive();
		
		//자식에서 새로 생성된 필드, 메소드
		bus.busNo = "240";
		bus.fee();
		System.out.println(bus.toString());
		
		
		Taxi taxi = new Taxi(); 	//부모를 만들고 자식을 만들기 때문에 Car()생성자도 같이 호출 된다.
		//부모에게 상속받은 필드, 메소드
		taxi.model = "SonataTaxi";
		taxi.drive();

		//자식에서 새로 생성된 필드, 메소드
		taxi.type = "개인택시";
		taxi.metering();
		System.out.println(taxi.toString());


		// 자식 클래스의 인스턴스 => 부모 참조변수에 할당가능
		Bus[] buses = new Bus[10]; // 버스클래스 인스턴스 담을 배열
		Taxi[] taxied = new Taxi[10];
		
		
		// 배열 굳이 2개 생성 안해도 됨
		Car[] cars = new Car[10];
		cars[0] = bus; //bus라는 변수 인스턴스 담음 promotion
		cars[1] = taxi;//taxi라는 변수 인스턴스 담음 promotion
	}
}
