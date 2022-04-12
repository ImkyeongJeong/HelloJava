package co.edu.variable;

public class VarExample {

	public static void main(String[] args) {
		// 변수의 선언
		int age = 20;
		double height = 163.6;
		String myName = "정임경";
		
		age = 23;
		
		System.out.println("이름은 " + myName);
		System.out.println("나이는 " + age + "살입니다.");
		System.out.println("키는 " + height + "입니다.");
		
		// 영어점수 : 85; engScore 할당
		int engScore = 85;
		int mathScore = 90;
		
		int result = engScore + mathScore;
		
		//선언은 한 번만 가능하다.
		engScore = 80;
		mathScore = 70;
		result = engScore + mathScore;
		
		System.out.println("영어점수 " + engScore + "점과 수학점수 " + mathScore + "점의 합은 " + result + "입니다.");
	}

}
