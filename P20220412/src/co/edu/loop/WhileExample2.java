package co.edu.loop;

import java.util.Scanner;

public class WhileExample2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean isTrue = true;
		int sum = 0;
		
		// 값을 계속 입력 받아 합이 200이 넘게 되면 반복문 빠져나오도록 하기
		while(isTrue) {
			System.out.println("값을 입력하시오.");
			int temp = sc.nextInt();
			sum += temp;
			if(sum==200) {
				isTrue=false;
				continue;
			}
			System.out.println("결과: " + sum);
		}
	}

}
