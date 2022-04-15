package co.edu.statics;


public class Singleton {

	private static Singleton singleton = new Singleton();
	
	//생성자(외부에서 호출할 수 없도록 private: 클래스에선 접근 가능)
	private  Singleton() {}
	
	//정적메소드 (외부에서 getInstance 메소드로만 객체를 생성가능)
	public static Singleton getInstance() {
		return singleton;
	}
	

	//public  모든 패키지 가능
	//protected 같은 패키지내 다른 패키지의 자손 클래스
	//default 동일 패키지 가능
	//private 동일 클래스 가능
}
