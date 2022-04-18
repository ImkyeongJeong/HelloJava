package co.edu.abstracts;

//추상클래스
public abstract class Animal {
	//Animal() 생성자로 인스턴스 생성 X
	
	// 기본 생성자
	public Animal() {
		
	}
	
	// 상속받아 하위 클래스에서 강제로 eat() 구현하도록
	public abstract void eat();
	public abstract void run();
	
	public void sleep() {
		System.out.println("동물이 잠을 잡니다.");
	}
}
