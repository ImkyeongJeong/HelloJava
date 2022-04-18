package co.edu.abstracts;

public class Main {

	public static void main(String[] args) {
		
		// 추상클래스는 생성자 호출 못함
		//Animal animal = new Animal();
		
		Animal animal = null; //new Animal();
		animal = new Bird();
		animal.eat();
		animal.run();
		animal.sleep();
		
		animal = new Fish();
		animal.eat();
		animal.run();
		//담겨진 인스턴스 따라 결과가 다름(다형성)
		
	}

}
