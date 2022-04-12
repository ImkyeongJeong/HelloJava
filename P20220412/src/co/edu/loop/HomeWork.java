package co.edu.loop;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		//주사위 맞추기 게임
		//임의의 값 범위 ( 1 ~ 6 : 주사위 면의 개수)
		
		Scanner sc = new Scanner(System.in);

		int dice = (int)(Math.random()*6)+1;
		
		while(true) {
			System.out.println("숫자를 입력하세요.");
			int num = sc.nextInt();
			
			if(num > 6) {
				System.out.println("입력 가능한 범위를 초과하였습니다. (범위:1 ~ 6)");
			} else {
				if(num == dice) {
					System.out.println("정답입니다.");
					break;
				} else {
					System.out.println("틀렸습니다.");
				}
			}
		}
		System.out.println("주사위 값은: " + dice);
	}

}
