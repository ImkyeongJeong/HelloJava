package co.edu.friend;

import java.util.Scanner;

public class FriendList {

	public static void main(String[] args) {
		
		Friend[] friends = new Friend[10];
		
//		friends[0] = new UnivFriend("홍길동", "010-1111-2222","대구대", "컴정");
//		friends[1] = new ComFriend("홍길동", "010-3456-2345","네이버","개발");
//		friends[2] = new Friend("박길동", "010-3232-4532");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1.친구등록 2.리스트 3.조회(이름) 4.종료");
			int menu = sc.nextInt();
			sc.nextLine();
			
			if(menu == 1) {
				//학교친구, 회사친구, 그외친구 if로 조건 > friends배열에 값 삽입
				System.out.println("1.학교친구 2.회사친구 3.기타");
				int selNum = sc.nextInt();
				sc.nextLine();
				
				//공통된 부분
				System.out.println("이름을 입력하세요.");
				String name = sc.nextLine();
				System.out.println("연락처를 입력하세요.");
				String phon = sc.nextLine();
				
//				Friend friend = null;
				
				if(selNum == 1) {
					System.out.println("학교를 입력하세요.");
					String univName = sc.nextLine();
					System.out.println("전공을 입력하세요.");
					String major = sc.nextLine();
					
					// 생성자 호출 필드값 삽입, univFrd 참조변수에 대입
					UnivFriend univFrd = new UnivFriend(name, phon, univName, major);
					
					// friends에 정보 담기
					for (int i = 0; i < friends.length; i++) {
						if(friends[i]==null) {
							friends[i] = univFrd;
							System.out.println("등록완료");
							break;
						}
					}
					
					
				} else if(selNum == 2) {
					System.out.println("회사를 입력하세요.");
					String comName = sc.nextLine();
					System.out.println("부서를 입력하세요.");
					String dpmName = sc.nextLine();
					
					ComFriend comFrd = new ComFriend(name, phon, comName, dpmName);
					
					for (int i = 0; i < friends.length; i++) {
						if(friends[i]==null) {
							friends[i] = comFrd;
							System.out.println("등록완료");
							break;
						}
					}
					
				} else if(selNum == 3) {
					
					Friend friend = new Friend(name, phon);
					
					for (int i = 0; i < friends.length; i++) {
						if(friends[i]==null) {
							friends[i] = friend;
							System.out.println("등록완료");
							break;
						}
					}
				}
				
				// 비어있는 위치배열 저장(공통된 부분)
//				for (int i = 0; i < friends.length; i++) {
//					if(friends[i] == null){
//						friends[i] = friend;
//					}
//				}
				
			} else if(menu == 2) {
				// 배열의 크기만큼 반복
				for (Friend friend : friends) {
					if(friend != null) {
						System.out.println("친구정보: " + friend.toString());
					}
				}
			} else if(menu == 3) {
				System.out.println("조회할 이름을 입력하세요.");
				String sName = sc.nextLine();
				
				for (int i = 0; i < friends.length; i++) {
					if(friends[i] != null && friends[i].getName().equals(sName)) {
						System.out.println("친구정보: " +  friends[i].toString());
					}
				}
				
			} else if(menu == 4) {
				System.out.println("프로그램 종료");
				break;
			}

		}
		
	}

}
