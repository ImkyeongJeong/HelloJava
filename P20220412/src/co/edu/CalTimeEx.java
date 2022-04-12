package co.edu;

import java.util.Scanner;

public class CalTimeEx {

	public static void main(String[] args) {
		
		int hours, minutes, secs;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("초를 입력하세요.");
		int time = sc.nextInt();
		// 시, 분, 초 값을 나타내라 > 5000초 5000(60*60)시간
		// 남은 시간 : 5000%(60*60) > 1400/60 분
		// 남은 시간 : 5000
		
		//1시간으로 나누기 연산한 값 time에 대입
		hours = time/(60*60);
		time = time%(60*60);
		
		//1분으로 나누기 연산
		minutes = time/60;
		time = time%60;
		
		//나머지 값 초
		secs = time;
		
		System.out.printf("%2d시 %2d분 %2d초", hours, minutes, secs);
		
	}

}