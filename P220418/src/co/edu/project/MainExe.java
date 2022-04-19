package co.edu.project;

import java.util.Scanner;

public class MainExe {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//인터페이스 변수를 선언하고 구현 객체를 대입
//		DAO dao = new MySqlDAO();
		DAO dao = new OracleDAO();
		
		while(true) {
			System.out.println("1.입력 2.수정 3.삭제 4.목록");
			System.out.println("선택> ");
			int menu = sc.nextInt();
			
			if(menu == 1) {
				dao.insert();
			} else if(menu == 2) {
				dao.update();
			} else if(menu == 3) {
				dao.delete();
			} else if(menu == 4) {
				dao.list();
			} else {
				break;
			}
		}
	}

}
