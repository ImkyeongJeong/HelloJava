package co.test;

import java.util.Scanner;

// 종합.
// 클래스의 인스턴스와 배열의 활용.
// 친구의 소중한 정보를 관리하는 앱을 구현하세요.
// Exam4(친구정보) 클래스의 인스턴스를 저장, 수정, 삭제, 조회 처리.
public class Exam5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Exam4[] members = new Exam4[10];
		int menu = 0;
	
		while (true) {

			//수정 이름, 연락처값 받아 - 이름에 해당되는 연락처를 변경
			//삭제 null 넣으면 삭제
			//조회 동일 이름있으면 모두 가져오기 / 삭제와 수정은 하나만
			System.out.println("1.추가 2.수정(이름,연락처) 3.삭제(이름) 4.전체조회 5.친구찾기(이름) 6.종료");
			menu = Integer.parseInt(sc.nextLine());
			
		
			if(menu == 1) {
				System.out.println("친구 이름을 입력하세요.");
				String name = sc.nextLine();
				System.out.println("친구 생일을 입력하세요.");
				String birthD = sc.nextLine();
				System.out.println("친구 연락처를 입력하세요.");
				String phon = sc.nextLine();
				
				Exam4 member = new Exam4(name,birthD,phon);
				
				for (int i = 0; i < members.length; i++) {
				
					// 공간이 비어있을 시 값삽입
					if(members[i] == null) {
						members[i] = member;
						System.out.println("등록 완료");
						break;
					}
					
					// 해당 공간에 입력된 연락처와 같은 값 존재 시
					if(members[i].getPhon().equals(phon)) {
						System.out.println("이미 존재하는 연락처입니다.");
						break;
					}
				}
				
			} else if(menu == 2) {
				System.out.println("이름을 입력하세요.");
				String searchName = sc.nextLine();
				System.out.println("연락처를 입력하세요.");
				String searchPhon = sc.nextLine();
				System.out.println("변경할 연락처를 입력하세요.");
				String rePhon = sc.nextLine();
				
				for (int i = 0; i < members.length; i++) {
					// 변경할 데이터가 존재하지 않다면
					if(members[i] == null) {
						System.out.println("등록 정보 없음");
						break;
					}
					
					// 빈 값이 아니면서 입력받은 이름과 연락처가 배열에 담긴 값과 동일하다면
					if(members[i] != null && members[i].getName().equals(searchName) && members[i].getPhon().equals(searchPhon)) {
						members[i].setPhon(rePhon);
						System.out.println("변경 완료");
						break;
					}
					
					// 해당 공간의 연락처와 변경할 연락처가 동일하다면
					if(members[i].getPhon().equals(rePhon)) {
						System.out.println("이미 존재하는 연락처입니다.");
						break;
					}
					
				}
				
			} else if(menu == 3) {
				System.out.println("삭제할 이름을 입력하세요.");
				String delName = sc.nextLine();
				
				for (int i = 0; i < members.length; i++) {
					// 빈 값이 아니면서 입력받은 이름과 배열에 담긴 값과 동일하다면
					if(members[i] != null && members[i].getName().equals(delName)) {
						members[i]=null;
						System.out.println("삭제 완료");
						break;
					} else {
						System.out.println("등록된 정보 없음");
						break;
					}
					
				}
				
			} else if(menu == 4) {
				for (int i = 0; i < members.length; i++) {

					if(members[i] != null) {
						members[i].getInfo();
					}
				}
				
			} else if(menu == 5) {
				System.out.println("조회할 친구 이름을 입력하세요.");
				String scName = sc.nextLine();
				for (int i = 0; i < members.length; i++) {

					if(members[i] != null && members[i].getName().equals(scName)) {
						members[i].getInfo();
					}
				}
			} else if(menu == 6) {
				break;
			}
		}
		System.out.println("end of prog.");
	}
	
}
	

