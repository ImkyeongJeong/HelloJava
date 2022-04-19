package co.edu.interfaces;

public class RemoteExample {

	public static void main(String[] args) {
		//인터페이스 메서드만 호출하면 객체에 종속되지 않고 객체에따라 실행 내용과 리턴값이 다를 수 있다. 
		
		//인터페이스는 인스턴스 생성 불가
		//RemoteControl rc = new RemoteControl();
		
		//RemoteControl 인터페이스를 구현하는 Television구현클래스를 통해 인스턴스 생성
		//상속관계에서는 부모클래스의 참조변수 자식클래스의 인스턴스가 할당가능
		RemoteControl rc = null; 
		rc = new Television();
//		rc = new Audio();
		
		rc.turnOn();
		rc.volumeUp();
		rc.volumeDown();
		rc.turnOff();
		
		RemoteControl.changeBattery();

	}

}
