package co.edu;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
//		두뇌 사용하는 프로그램
//		[0] ~ [4] > 1~ 5까지 임의 값 생성
//		[#],[#],[5],[#],[#] 5가 들어있는 위치를 찾는 게임
//		1 1 2 3 중복되지 않도록 값 넣기
//		1번 입력 > 틀렸습니다.
//		3번 입력 > 맞췄습니다. 
		
		Scanner sc = new Scanner(System.in);
		
		int[] intAry = new int[5];
		
		//생성
		for (int i = 0; i < 5; i++) {
			intAry[i] = (int)(Math.random()*5) +1;
			
			//비교(i인덱스에 들어갈 숫자를 반복문을 통해 같은 숫자가 있는지 확인)
			for (int j = 0; j < i ; j++) {
				
				//중복이 있으면 반복문을 빠져나가고 전 단계로 이동
				if(intAry[i] == intAry[j]) {
					i--;
					break;
				}
			}
		}
		//랜덤 숫자 확인
		for(int num : intAry) {
		System.out.print(num);
		}
	}
}

