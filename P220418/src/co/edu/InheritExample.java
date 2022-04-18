package co.edu;

public class InheritExample {

	public static void main(String[] args) {

		Child1 c1 = new Child1();
		c1.field1 = "";	// 부모(Parent) 필드
		c1.field2 = ""; // 자식(Child1) 필드
		
		c1.method1();
		c1.method2();
		
		Child2 c2 = new Child2();
		c2.field1 = ""; // 부모(Parent) 필드
		c2.field3 = ""; // 자식(Child2) 필드
		
		c2.method1();
		c2.method3();
		
		
		
		// 부모의 참조변수에 자식인스턴스 할당 가능
		Parent p1 = new Parent(); 	// 자기 자신이라 가능
		p1 = new Child1(); 			// 자식 인스턴스를 부모 클래스 참조변수에 할당 가능(자동형변환)
		p1 = new Child2();			
		
		//p1.field3 = ""; 			// 부모가 갖고 있는 필드, 메소드만 사용 가능
		p1.field1 = "";
		p1.method1();				//부모가 가진 필드, 메소드
		
		
		
		c2 = (Child2)p1; 			// 큰 범위를 작은 범위에 담을 때 캐스팅 해야됨(강제형변환)
		c2.field1 = "";
		c2.field3 = "";
		
		c2.method1();
		c2.method3();
				
		
		// 부모 : 자식 인스턴스를 부모의 참조변수 할당할 수 있지만 부모가 가진 필드 메소드만 사용 가능
		// 자식 : 부모 인스턴스를 자식의 참조변수 할당은 모든 필드 메소드 사용 가능
		
	}

}
