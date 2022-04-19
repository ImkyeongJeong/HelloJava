package co.edu.interfaces;

public interface RemoteControl {

	//상수필드만 선언 가능 static final 생략가능
	public int MAX_VOLUME = 10;	
	
	public void turnOn();		//추상메소드
	public void turnOff();		//상속받으면 반드시 구현해야 됨
	public void volumeUp();	
	public void volumeDown();
	
	//TV에서만 메소드 사용하고 싶을 때 - default 메소드 / 오버라이딩해서 사용해도 됨
	public default void adjustScreen() {
		System.out.println("화면을 조정합니다.");
	}
	
	//
	public static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
