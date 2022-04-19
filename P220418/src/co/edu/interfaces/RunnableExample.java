package co.edu.interfaces;


interface Runnable {
	public void run();
}

//구현클래스 클래스명
class RunClass implements Runnable {

	@Override
	public void run() {
		System.out.println("움직입니다.");
	}
	
}

public class RunnableExample {
	public static void main(String[] args) {
		//Runnable runnable = new 구현객체();
		Runnable runnable = new RunClass();
		runnable.run();
		
		
		
		//익명 구현객체 선언 (클래스 생성할 필요 없이)
		runnable = new Runnable() {

			@Override
			public void run() {
				System.out.println("멍멍이가 달립니다.");
			}
		};
		runnable.run();
		
		
		//익명구현객체 람다표현식 () 매개변수 받아 실행
		runnable = () -> {
			System.out.println("고양이가 달립니다.");
		};
		runnable.run();
	}
}
