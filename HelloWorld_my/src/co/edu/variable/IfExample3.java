package co.edu.variable;

import java.util.Scanner;

public class IfExample3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		
		System.out.println("첫 번째 정수를 입력하세요.");
		num1 = sc.nextInt(); //사용자 입력값을 읽고 int형으로 반환
		System.out.println("두 번째 정수를 입력하세요.");
		num2 = sc.nextInt();
			
		// 큰 수에서 작은 수를 뺀 결과값을 result에 저장
		//result 출력

		
		if(num1 > num2) {
			int result = num1 - num2;
			System.out.println(num1 + " - " + num2 + " = " + result);
		} else {
			int result = num2 - num1;
			System.out.println(num2 + " - " + num1 + " = " + result);
		}
	}
}
