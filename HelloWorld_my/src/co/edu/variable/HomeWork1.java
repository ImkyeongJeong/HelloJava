package co.edu.variable;

import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {

		//오렌지 127개 10개씩 담을 수 있는 상자. 5개씩 담을 수 있는 상자. 몇개 필요한지 출력 2개가 남을 경우 5개짜리 상자로

		int orange;
		int box10;
		int box5;
		int result;

		Scanner sc = new Scanner(System.in);

		System.out.println("오렌지 개수를 입력하시오.");
		orange = sc.nextInt();

		box10 = orange/10;
		result = orange%10;
		box5 = result/5;
		result = orange%5;

		if(result>1) {
			box5 ++;
		}

		System.out.printf("오렌지 %d개는 10개씩 담을 수 있는 상자 %d개, 5개씩 담을 수 있는 상자 %d개가 필요합니다.", orange, box10, box5);
	}

} 