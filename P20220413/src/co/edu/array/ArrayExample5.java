package co.edu.array;

import java.util.Scanner;

public class ArrayExample5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] scores = new int[5];
		
		int max = 0;
		int min = 10000;
		//max = min = scores[0] / min값 0으로 지정할 경우 계산 안됨
		
		for(int i=0; i<scores.length; i++) {
			System.out.println("점수를 입력하세요.");
			scores[i] = sc.nextInt();
			
			if(max < scores[i]) {
				max = scores[i];
			}
			
			if(min > scores[i]) {
				min = scores[i];
			}
		}
		
		//학생 중 최고점, 최저점 구하기
		System.out.println("최고점 : " + max);
		System.out.println("최저점 : " + min);
		
		
		// 학생이름, 점수
		// 배열, 배열 0 > 학생, 90

	}

}
