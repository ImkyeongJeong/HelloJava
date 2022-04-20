package co.edu.except;

public class NullPointerEx {

	public static void main(String[] args) {
		String str = "Hello";
		str = null;
		
		try { //오류 발생시 예외처리
		System.out.println(str.toString());
		}catch(NullPointerException e) {
			
			System.out.println("Null값을 참조");
		}
		System.out.println("end of prog.");
	}

}
