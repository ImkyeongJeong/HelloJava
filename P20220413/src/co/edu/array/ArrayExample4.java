package co.edu.array;

import java.util.Iterator;

public class ArrayExample4 {

	public static void main(String[] args) {
		
		// 정수1~30 범위의 임의값 생성 
		// 반복문 활용하여 배열에 임의값 5개 저장
		// 15보다 큰 값만 합하고 평균 구하기
		
		int[] intAry = new int[5];
		
		int sum = 0;
		int cnt = 0;
		double avg;
	
		for (int i = 0; i < intAry.length; i++) {
			
			int num = (int)(Math.random()*30) + 1;
			
			intAry[i] = num;
			
			if(intAry[i] > 15) {
				sum += intAry[i];
				cnt ++;
			}
			System.out.print(intAry[i] + " ");
		}
		
		avg = 1.0 * sum/cnt;
		System.out.println();
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
	}

}
