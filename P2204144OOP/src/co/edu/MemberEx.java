package co.edu;

import java.util.Scanner;

public class MemberEx {

	public static void main(String[] args) {
		
//		Member m1 = new Member("user1", "사용자1", "010-2343-4534", 30);
//		m1.memberAge = 25; 필드를 private로 지정해서 접근 불가
//		m1.setMemberAge(25);
//		m1.setMemberId("user01");
//		System.out.println("나이 " + m1.getMemberAge());
//		System.out.println("아이디 " + m1.getMemberId());
//		m1.showInfo();
		
		
		Scanner sc = new Scanner(System.in);
		
		Member[] members = new Member[2];
		
		// 입력기능
		for (int i = 0; i < members.length; i++) {
			System.out.println("아이디 이름 연락처 나이 입력하세요");
			String id = sc.next(); //sc.next();: 스페이스 기준으로 앞의 값 가져옴
			String name = sc.next();
			String phone = sc.next();
			int age = Integer.parseInt(sc.next());
			Member newMember = new Member(id, name, phone, age);
			
			members[i] = newMember; 
		}
		
		// 1.조회(이름) 반복문, 2. 변경(id입력> 같은 아이디 찾아와서 그 아이디의 연락처 값 변경),
		// 3.조회(입력된 나이보다 큰 회원만) 4. 프로그램 종료  
		while(true) {
			System.out.println("1. 조회(이름), 2. 변경(아이디, 연락처), 3. 조회(나이 큰 회원), 4. 종료");
			System.out.println("선택> ");
			int menu = sc.nextInt(); //Integer.parseInt(sc.nextLine()); 27번줄 next때문에 문제가 됨
			sc.nextLine(); // 메뉴와 엔터키까지 처리하기 위함.
			
			if(menu==1) { 
				System.out.println("조회할 이릅을 입력하세요.");
				String searchName = sc.nextLine();
				
//				for (Member member : members){
//					if(member.getMemberName().equals(searchName))
//						member.showInfo();
//				}
				
				for (int i = 0; i < members.length; i++) {	
					if(members[i].equals(searchName)) {
						System.out.println("조회 됨");
					}
				}
				System.out.println("조회된 이름은: " + searchName);
				
			} else if(menu==2) {
				System.out.println("아이디를 입력하세요.");
				String id = sc.nextLine();
				System.out.println("변경할 연락처 입력하세요.");
				String phon = sc.nextLine();

				for (Member member : members){
				if(member.getMemberPhon().equals(phon))
					member.setMemberPhon(phon);
			}
				
//				for (int i = 0; i < members.length; i++) {
//					if(members[i].equals(id)) {
//
//						members[i].setMemberPhon(changeNumber);
//					}
//				}

			} else if(menu==3) {
				System.out.println("조회할 나이를 입력하세요.");
				int searchAge = sc.nextInt();
				
				for (int i = 0; i < members.length; i++) {
					if(members[i].getMemberAge() > searchAge) {
						String name = members[i].getMemberName();
						System.out.println("입력된 나이보다 큰 회원은: " + name);
					}
				}
			} else if (menu==4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				//members(배열)의 갯수만큼 반복, member라는 변수에 담겠다. 
				for(Member member : members) {
					member.showInfo();
				}
			}
		}
		System.out.println("end of prog.");
		
	}

}
