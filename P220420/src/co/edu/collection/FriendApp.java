package co.edu.collection;

import java.util.Scanner;

import co.edu.friend.Friend;

//친구목록 저장하기 위한 App
//추가, 수정, 삭제, 조회
//1)배열버전 2)컬렉션버전 <= 인터페이스 구현클래스로 생성
public class FriendApp {
	public static void main(String[] args) {
		//FriendService인터페이스이름
//		FriendService service = new FriendServiceArray();	//배열
		FriendService service = new FriendServiceList();	//컬렉션
		// 추가(이름,연락처), 수정(이름,연락처(연락처 업데이트), 삭제, 조회 => 컨트롤 역할
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1.추가 2.수정 3.삭제 4. 조회");
			int menu = sc.nextInt();
			sc.nextLine();
			
			if(menu == 1) {
				System.out.println("이름을 입력하세요.");
				String name = sc.nextLine();
				System.out.println("연락처를 입력하세요.");
				String phon = sc.nextLine();
				
				Friend friend = new Friend(name, phon);
				
				service.addFriend(friend);
				
			} else if(menu == 2) {
				System.out.println("이름을 입력하세요.");
				String name = sc.nextLine();

				Friend friend = new Friend(name,null); 
				
				service.modFriend(friend);
				
				
			} else if(menu == 3) {
				System.out.println("삭제할 이름 입력");
				String reName = sc.nextLine();
				service.remFriend(reName);
				
			} else if(menu == 4) {
				System.out.println("조회할 이름을 입력하세요.");
				String searchName = sc.nextLine();
				
				service.findFriend(searchName);
				
			} else {
				break;
			}
			
		}
	}
}
