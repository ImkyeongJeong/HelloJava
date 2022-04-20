package co.edu.except;

import java.util.InputMismatchException;
import java.util.Scanner;

//java.util.InputMismatchException 예외처리
public class MismatchEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1.추가 2.종료");
			System.out.println("선택> ");
			int menu = 0;
			
			//forName: 예외처리 안 되어있으면 컴파일에러 발생 
			try {
				Class.forName("java.lang.String");	// Exception상속
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			}
			
			
			//실행을 해봐야 알 수 있는 예외
			try { 									//예외 발생시
				menu = Integer.parseInt(sc.next());	// RuntimeException상속

			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("배열의 범위를 넘어서 처리하려고 합니다.");
			} catch(InputMismatchException | NumberFormatException e2) {		//처리할 코드 입력
				System.out.println("숫자선택");
				sc.nextLine();
			} catch(Exception e3) {	//최상위는 제일 마지막에
				System.out.println("알수 없는 예외 발생");
			} finally {	//반드시 한번은 실행하는 코드
				System.out.println("예외처리에서 반드시 한번은 실행");
			}
			
			if (menu == 1) {
				System.out.println("추가작업");
			} else if(menu == 2) {
				break;
			}
		}
		System.out.println("end of prog.");
	}

}
