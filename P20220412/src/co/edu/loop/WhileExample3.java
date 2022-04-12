package co.edu.loop;

import java.util.Scanner;

public class WhileExample3 {

	public static void main(String[] args) {
		//랜덤값 맞추기
		//Math.random()의 생성범위 1 ~ 10까지가 되도록 => randomVal
		//사용자의 입력값을 담는 변수 userVal
		
		//While구문을 사용해서 임의의 값이랑 입력값이 같으면 종료
		//입력값, 랜덤값 비교하여 랜덤값 보다 큰지 작은지 메시지 출력

		
		Scanner sc = new Scanner(System.in);
		
		int randomVal = (int)(Math.random()*10) + 1;
		
		while(true) {
			System.out.println("값을 입력하세요");
			int userVal = sc.nextInt();
		
			if(randomVal == userVal) {
				System.out.println("정답입니다.");
				break;
			}
			if(randomVal > userVal) {
				System.out.println("입력값보다 큽니다.");
			} else {
				System.out.println("입력값보다 작습니다.");
			}
		}
		System.out.println("정답은 : " + randomVal);
	}
}
