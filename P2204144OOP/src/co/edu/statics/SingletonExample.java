package co.edu.statics;

public class SingletonExample {

	public static void main(String[] args) {
		//외부 접근을 막아둬서 인스턴스 생성할 수 없음 Singleton s1 = new Singleton();
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		if(s1 == s2) {
			System.out.println("same");
		} else {
			System.out.println("diff");
		}
	}

}
