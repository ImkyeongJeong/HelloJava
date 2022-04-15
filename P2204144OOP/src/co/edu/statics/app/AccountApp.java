package co.edu.statics.app;

import java.util.Scanner;

public class AccountApp {
	Scanner sc = new Scanner(System.in);
	
	//계좌정보를 저장하기 위한 배열
	Account[] accounts = new Account[100]; 
	
	public void execute() {
		
		while(true) {
			System.out.println("1.계좌생성 2.계좌목록 3.입금 4.출금 5.종료");
			System.out.println("선택> ");

			int menu = 0;
			
			menu = Integer.parseInt(sc.nextLine());
			
			if(menu == 1) {
				creatAccount();
			} else if (menu == 2) {
				accountList();
			} else if (menu == 3) {
				deposit();
			} else if (menu == 4) {
				withdraw();
			} else if (menu == 5) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
		System.out.println("end of prog.");
	}
	
	
	//계좌생성 시 실행 메소드
	public void creatAccount() {
		System.out.println("=============");
		System.out.println("계좌생성");
		System.out.println("=============");
		System.out.print("계좌번호 입력: ");
		String acno = sc.nextLine();
		System.out.println("계좌주 입력: ");
		String owner = sc.nextLine();
		System.out.println("초기입금액: ");
		int money = Integer.parseInt(sc.nextLine());
		
		//newAc 임시저장 ㅋ 
		Account newAc = new Account(acno, owner, money);

		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i] == null) { //값이 비어있을 때
				accounts[i] = newAc;
				break;
			}
		}
	}
	
	//전체목록조회시 실행 메소드
	public void accountList() {
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i] != null) {
				accounts[i].getInfo();
			}
		}
	}
	
	//입금시 실행 메소드
	public void deposit() {
		System.out.print("입금 계좌번호 입력> ");
		String dAc = sc.nextLine();
		
		for (int i = 0; i < accounts.length; i++) {
			
			if(accounts[i] != null && accounts[i].getAno().equals(dAc)) {
				System.out.println("입금 금액 입력> ");
				int dMoney = Integer.parseInt(sc.nextLine());
			
				int balance = accounts[i].getBalance();
				balance += dMoney;
				accounts[i].setBalance(balance);
				break;
			}
		}
	}
	
	//출금시 실행 메소드
	public void withdraw() {
		System.out.print("출금 계좌번호 입력> ");
		String dAc = sc.nextLine();
		
		for (int i = 0; i < accounts.length; i++) {
			
			if(accounts[i] != null && accounts[i].getAno().equals(dAc)) {
				System.out.println("출금 금액 입력> ");
				int wMoney = Integer.parseInt(sc.nextLine());
			
				int balance = accounts[i].getBalance();
				balance -= wMoney;
				accounts[i].setBalance(balance);
				break;
			}
		}
	}
	
}
