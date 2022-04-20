package co.edu.nested;

//중첩클래스 (호출되는 방법이 다름)
public class Outer {
	
	private String f1;
	
	//인스턴스 멤버클래스(인스턴스를 생성해야 만들어짐)
	class Inner1 {
		String f2;
		
		void method2() {
			System.out.println("method2() call");
		}
	}
	
	//정적 멤버클래스 (
	static class Inner2 {
		String f4;
		static String f5;
		
		void method4() {
			System.out.println("method4() call");
		}
		
		static void method5() {
			System.out.println("method5() call");
		}
	}
	
	public void method1() {
		System.out.println("method2() call");
		
		//로컬클래스
		class Local {
			String f3;
			
			void method3() {
				System.out.println("method3() call");
			}
		}
		
		Local local = new Local();
		local.method3();
	}
}
