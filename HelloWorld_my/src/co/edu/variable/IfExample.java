package co.edu.variable;

public class IfExample {

	public static void main(String[] args) {
		int myAge = 19;
		boolean over20; //의미있는 변수명 선언
		over20 = myAge > 20;
		if(over20) {
			System.out.println("over 20");
		} else {
			System.out.println("under 20");
		}

	}

}
