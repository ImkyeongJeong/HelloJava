package co.edu.variable;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		//점수 세개 입력 / 합, 평균, 고득점 => 합은 230이고 평균은 76.67이고 최고점은 90점입니다. 
		
		Scanner sc = new Scanner(System.in);
		
		int score1, score2, score3;
		int sum;
		int maxValue;
		double avg;
		
		System.out.println("첫 번째 점수 입력");
		score1 = sc.nextInt();
		System.out.println("두 번째 점수 입력");
		score2 = sc.nextInt();
		System.out.println("세 번째 점수 입력");
		score3 = sc.nextInt();
		
		sum = score1 + score2 + score3;
		avg = sum / 3.0;
		
		maxValue = score1;
		if(maxValue > score2) {
			maxValue = score2;
		}
		if(maxValue < score3) {
			maxValue = score3;
		}
		
		System.out.printf("세 점수의 합은 %d이고 평균은 %.2f이고 최고점은 %d점입니다.", sum, avg, maxValue);
		
	}

}
