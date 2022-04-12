package co.edu.loop;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		// 가위, 바위, 보 게임
		// 임의값 범위 ( 1:가위, 2:바위, 3:보)
		// 사용자 입력값 : 가위(1), 바위(2), 보(3)
		// 이기는 경우 : 1=2, 2=3, 3=1의 경우, 이 외의 경우는 짐
		// 가위(1) => You Win. / You lose.
		
		int player;
		int com;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("숫자를 입력하세요. (1:가위, 2:바위, 3:보)");
			player = sc.nextInt();
			
			com = (int)(Math.random()*3)+1;
			
			//1,2,3 외 다른 입력값이 들어오면 다시 선택하도록
			if(player > 3) 
			{
				System.out.println("다시 선택해주세요.");
			} 
			
			//정상적인 범위값이 들어왔을 때 게임시작
			else 
			{
				if(player==1) 
				{
					System.out.println("사용자: 가위");
					if(com==2) {
						System.out.println("컴퓨터: 바위");
						System.out.println("You lose.");
					} else if(com==3) {
						System.out.println("컴퓨터: 보");
						System.out.println("You Win.");
					} else {
						System.out.println("컴퓨터: 가위");
						System.out.println("비겼습니다.");
						continue;
					}
					break;
				} 
				
				else if(player==2) 
				{
					System.out.println("사용자: 바위");
					if(com==1) {
						System.out.println("컴퓨터: 가위");
						System.out.println("You Win.");
					} else if (com==3) {
						System.out.println("컴퓨터: 보");
						System.out.println("You lose.");
					} else {
						System.out.println("컴퓨터: 바위");
						System.out.println("비겼습니다.");
						continue;
					}
					break;
				}
				
				else {
					System.out.println("사용자: 보");
					if(com==1) {
						System.out.println("컴퓨터: 가위");
						System.out.println("You lose.");
					} else if(com==2) {
						System.out.println("컴퓨터: 바위");
						System.out.println("You Win.");
					} else {
						System.out.println("컴퓨터: 보");
						System.out.println("비겼습니다.");
						continue;
					}
					break;
				}
			}
		}		
	}
}
