package co.test;

import java.util.Scanner;

// 변수 선언과 제어문 활용.
// 정수값을 받는 변수를 3개 선언하고 num1, num2, num3 의 변수에 저장.
// 제일 큰 값을 구하도록 기능을 구현하세요. (if)
// 결과 => 3 수 중에서 가장 큰값은 100 입니다.
public class Exam1 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		// 코드 작성.
		int num1, num2, num3;
		int maxVal;
		
		System.out.println("첫 번째 값을 입력하세요.");
		num1 = scn.nextInt();
		System.out.println("두 번째 값을 입력하세요.");
		num2 = scn.nextInt();
		System.out.println("세 번째 값을 입력하세요.");
		num3 = scn.nextInt();
//		
		
		
		if(num1 > num2 && num1 > num3) {
			maxVal = num1;
			System.out.println("세가지 수 중에서 가장 큰값은 " + maxVal + "입니다.");
		} else if(num2 > num1 && num2 > num3) {
			maxVal = num2;
			System.out.println("세가지 수 중에서 가장 큰값은 " + maxVal + "입니다.");
		} else if(num3 > num1 && num3 > num2) {
			maxVal = num3;
			System.out.println("세가지 수 중에서 가장 큰값은 " + maxVal + "입니다.");
		}
		
		
	
		
	}
}
