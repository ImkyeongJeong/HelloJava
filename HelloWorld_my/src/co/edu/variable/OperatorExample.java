package co.edu.variable;

import java.util.Scanner;

public class OperatorExample {

	public static void main(String[] args) {
		// 나머지 : %
		// 6/4 => 몫: 1, 나머지: 2
//		int result = 6 / 4;
//		int result2 = 6 % 4;
//		int val = 5;
//		if(val % 2 == 0) {
//			System.out.println("짝수");
//		} else {
//			System.out.println("홀수");
//		}
		
		
		
		//75300원  - 5만원 1개, 1만원 2개, 5천원 1개, 1백원 3개가 필요합니다. 출력
		//5만원 => ?개, 1만원 => ?개, 5천원 => ?개, 1천원 => ?개, 500원 => ?개, 100원 => ?개
		
		Scanner sc = new Scanner(System.in);
		
		int charge;
		
		System.out.println("금액을 입력하시오.");
		charge = sc.nextInt();
		
		System.out.println("5만원 " + charge/50000 + "개");
		charge = charge%50000; //charge를 5000으로 나눈 나머지값을 charge에 대입
		System.out.println("1만원 " + charge/10000 + "개");
		charge = charge%10000;
		System.out.println("5천원 " + charge/5000 + "개");
		charge = charge%5000;
		System.out.println("1천원 " + charge/1000 + "개");
		charge = charge%1000;
		System.out.println("500원 " + charge/500 + "개");
		charge = charge%500;
		System.out.println("100원 " + charge/100 + "개가 필요합니다.");
		
	}

}
