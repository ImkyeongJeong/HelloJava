package co.edu.variable;

public class VarExample2 {

	public static void main(String[] args) {
		// 국어 80, 영어 70, 수학 63
		// 평균 변수 선언
		
		int korScore = 80;
		int engScore = 70;
		int mathScore = 63;
		
		int result = korScore + engScore + mathScore;
		
		korScore = 85;
		engScore = 77;
		mathScore = 60;
		
		double avg = (85 + 75 + 60) /3.0;
		
		System.out.println(korScore + "점," + engScore + "점," + mathScore + "점이 평균 : " + result + "점입니다" + avg );
		
	}

}
