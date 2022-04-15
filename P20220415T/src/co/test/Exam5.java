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
			System.out.println("1.추가 2.수정(이름,연락처) 3.삭제(이름) 4.조회(이름) 5.종료");
			menu = Integer.parseInt(sc.nextLine());
			
		}
			if(menu == 1) {
				System.out.println("친구 이름을 입력하세요.");
				String name = sc.nextLine();
				System.out.println("친구 생일을 입력하세요.");
				String birthD = sc.nextLine();
				System.out.println("친구 연락처를 입력하세요.");
				String phon = sc.nextLine();
				
				Exam4 member = new Exam4(name,birthD,phon);
				
				for (int i = 0; i < members.length; i++) {
					members[i] = member;
				}
				
				
			} else if(menu == 2) {
				
			}  else if(menu == 3) {
				
			}  else if(menu == 4) {
				
			}  else if(menu == 5) {
				break;
			}
		}
		System.out.println("end of prog.");
		
		public void addInfo() {
			
		}
	
}

	

