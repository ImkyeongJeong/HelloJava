package co.edu.nested;

//instance(new를 사용하여 생성해야 메모리 사용가능) vs static(클래스를 읽어드릴 시점에 메모리 사용준비완료)
public class Main {

	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.method1();
		
		// instance 멤버클래스
		Outer.Inner1 inner = outer.new Inner1();
		inner.method2();
		
		// static 멤버클래스
		Outer.Inner2.method5();
		
		// static 클래스의 인스턴스 메소드 호출
		Outer.Inner2 inner2 = new Outer.Inner2();
		inner2.method4(); //인스턴스 메소드
		inner2.method5(); //정적 메소드
	}
}
