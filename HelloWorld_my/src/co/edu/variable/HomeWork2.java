package co.edu.variable;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {

		// 영수증) 물건의 가격과 현금 입력받음
		// 현금 10000원
		// 물건가격 7500원 (부가세까지 포함된 가격)
		// 부가세 750원
		// 잔돈 2500원

		int cash;
		int price;
		int vat;
		int result;

		Scanner sc = new Scanner(System.in);

		System.out.println("현금 입력");
		cash = sc.nextInt();
		System.out.println("물건가격 입력");
		price = sc.nextInt();

		//부가세 구하는 공식
		vat = price - (int)(price/1.1);

		System.out.println("[현금] " + cash + "원");
		System.out.println("[물건가격] " + price + "원");
		System.out.println("[부가세]" + vat + "원");
		System.out.println("[잔돈]" + (cash - price) + "원");
	}

}