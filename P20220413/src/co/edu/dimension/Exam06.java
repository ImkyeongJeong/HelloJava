package co.edu.dimension;

import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("--------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------------");
			System.out.println("선택> ");
			
			// 정수로 변환하지 않으면 equals로 비교해야 됨.
			int selectNo = Integer.parseInt(sc.nextLine());
			
			// 잘못된 순서를 처리하려는 경우에 대해 메시지 출력
			if(selectNo != 1 && scores==null) {
				System.out.println("학생수를 지정하세요.");
				continue; //아래코드 실행하지 않음
			}
			
			
			if(selectNo == 1) {
				System.out.println("학생 수> ");
				//sc.nextInt()는 30엔터 입력하면 30만 처리하고 엔터는 한 바퀴 돌고 20번 줄에서 나머지 엔터를 처리해줘서 에러가 발생 (빈 값을 파싱하려면 에러가 발생)
				studentNum = Integer.parseInt(sc.nextLine());  
				scores = new int[studentNum];
			} else if(selectNo == 2) { //점수입력
				System.out.println("점수입력> ");
				for(int i=0; i<scores.length; i++) {
					scores[i] = Integer.parseInt(sc.nextLine());
				}
			} else if(selectNo == 3) { //점수리스트
				for(int i=0; i<scores.length; i++) {
					System.out.println("scores[" + i + "] > " + scores[i]);
				}
			} else if(selectNo == 4) { //분석(최고점수, 평균)
				int maxVal, sum;
				maxVal = sum = 0; //변수 초기화
				for (int i = 0; i < scores.length; i++) {
					sum += scores[i];
					// 최고점수
					if(scores[i] > maxVal) {
						maxVal = scores[i];
					}
				}
				System.out.println("최고 점수: " + maxVal);
				System.out.printf("평균 점수: %.2f", (double) sum / scores.length);
				System.out.println();
			} else if(selectNo == 5) { //종료
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

}
