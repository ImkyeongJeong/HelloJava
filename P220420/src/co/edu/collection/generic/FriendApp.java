package co.edu.collection.generic;

import java.util.ArrayList;
import java.util.Scanner;

import co.edu.friend.Friend;
import co.edu.friend.Gender;

//친구목록 저장하기 위한 App
//추가, 수정, 삭제, 조회
//1)배열버전 2)컬렉션버전 <= 인터페이스 구현클래스로 생성
public class FriendApp {
	public static void main(String[] args) {
		
		//FriendService인터페이스이름
		FriendService service = new FriendServiceList();
		
		// 추가(이름,연락처), 수정(이름,연락처(연락처 업데이트), 삭제, 조회 => 컨트롤 역할
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1.추가 2.수정 3.삭제 4.조회 5.남자 6.여자");
			int menu = sc.nextInt();
			sc.nextLine();
			
			//상수로 선언해두면 1,2,3,4 보다 명확히 어떤 역할을 하는지 알 수 있다.
			if(menu == FriendService.ADD) {
				System.out.println("이름을 입력하세요.");
				String name = sc.nextLine();
				System.out.println("연락처를 입력하세요.");
				String phon = sc.nextLine();
				System.out.println("성별을 입력하세요. ex)남자/여자 ");
				String gender = sc.nextLine();
				
				Gender gen = Gender.MEN; //초기값 MEN으로 설정
				
				if(gender.startsWith("남")) { //남으로 시작하는 값이 있으면
					gen = Gender.MEN;
				} else if(gender.startsWith("여")) {
					gen = Gender.WOMEN;
				}
				Friend friend = new Friend(name, phon, gen);
				
				service.addFriend(friend);
				
			} else if(menu == FriendService.MOD) {
				System.out.println("이름을 입력하세요.");
				String name = sc.nextLine();

				Friend friend = new Friend(name,null); 
				
				service.modFriend(friend);
				
				
			} else if(menu == FriendService.DEL) {
				System.out.println("삭제할 이름 입력");
				String reName = sc.nextLine();
				service.remFriend(reName);
				
			} else if(menu == FriendService.SEARCH) {
				System.out.println("조회할 이름을 입력하세요.");
				String searchName = sc.nextLine();
				
				service.findFriend(searchName);
				
			} else if (menu == FriendService.FIND_MEN) {
				ArrayList<Friend> list = service.findGender(Gender.MEN);
				
				for(Friend friend : list) {
					System.out.println(friend.toString());
				}
			} else if (menu == FriendService.FIND_WOMEN) {
				ArrayList<Friend> list = service.findGender(Gender.WOMEN);
				
				for(Friend friend : list) {
					System.out.println(friend.toString());
				}
			} else {
				break;
			}
			
		}
	}
}
