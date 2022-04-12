package co.edu.variable;

import java.util.Scanner;

public class GetAverage {

	public static void main(String[] args) {
		//입력값을 num1, num2, num3 선언
		Scanner sc = new Scanner(System.in);
		
		// 정수연산 => 결과값 정수 / 소수점까지 출력하려면 /3.0 으로 해라
		double avg;
		int num1, num2, num3;
		int age = 10;
		String myName = "홍길동";
		
		System.out.println("첫 번째 값을 입력하시오.");
		num1 = sc.nextInt();
		System.out.println("두 번째 값을 입력하시오.");
		num2 = sc.nextInt();
		System.out.println("세 번째 값을 입력하시오.");
		num3 = sc.nextInt();
		
		avg = (num1 + num2 + num3) / 3.0;
		
		// 결과값 : 입력한 세 정수는 10, 15, 15이고 평균은 13.33333 입니다. 
//		System.out.println("입력한 세 정수는 " + num1 + ", " + num2 + ", " + num3 + " 이고 평균은 " + avg + "입니다.");
//		System.out.printf("이름은 %3s이고 평균은 %.2f이고 나이는 %2d", myName, avg, age);
		System.out.printf("입력한 세 정수는 %2d, %2d, %2d 이고 평균은 %.2f 입니다.", num1, num2, num3, avg);
		
	}

}
