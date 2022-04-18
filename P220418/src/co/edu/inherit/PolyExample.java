package co.edu.inherit;

class Driver {
	//Car클래스 인스턴스 매개로 받음
	public void drive(Car car) {
		car.drive();
	}
}

public class PolyExample {
	public static void main(String[] args) {
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		Driver driver = new Driver();
		driver.drive(bus);	//매개변수의 다형성
		driver.drive(taxi);	//매개변수의 타입이 어떤 인스턴스인지에 따라 결과는 다름(상속이기에 가능)
	}
}
