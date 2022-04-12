package co.edu.variable;

import java.util.Scanner;

public class ChangeCToF {

	public static void main(String[] args) {
		//섭씨온도 <-> 화씨온도
		int f;
		double c;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("화씨온도 입력");
		f = sc.nextInt();
		c = 5/9.0*(f-32);

		System.out.printf("섭씨온도는 %.1f", c);
		
		
//		double f;
//		double c;
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("화씨온도 입력");
//		f = sc.nextInt();
//
//		c = (double)5/9*(f-32);
//
//		System.out.printf("섭씨온도는 %.1f", c);
	}

}
