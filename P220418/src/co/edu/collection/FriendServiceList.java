package co.edu.collection;

import java.util.ArrayList;
import java.util.Scanner;

import co.edu.friend.Friend;

//켈력선 ArrayList
public class FriendServiceList implements FriendService{

	Scanner sc = new Scanner(System.in);
	
	//컬렉션에 담도록
	ArrayList friends = new ArrayList();
	
	//추가
	@Override
	public void addFriend(Friend friend) {
			friends.add(friend);
	}

	//수정
	@Override
	public void modFriend(Friend friend) {
		for (int i = 0; i < friends.size(); i++) {
			Friend f2 = (Friend) friends.get(i);
			
			if(f2.getName().equals(friend.getName())) {
				System.out.println("변경할 연락처 입력");
				String changePhon = sc.nextLine();
				f2.setPhon(changePhon);
			}
		}
	}

	//삭제
	@Override
	public void remFriend(String name) {
		for (int i = 0; i < friends.size(); i++) {
			Friend f2 = (Friend) friends.get(i);
			
			if(f2.getName().equals(name)) {
			friends.remove(f2);
			} else {
				System.out.println("존재하지 않음");
			}
		}
		
	}

	//조회
	@Override
	public Friend findFriend(String name) {
		for (int i = 0; i < friends.size(); i++) {
			//값을 f2에 대입(for문 돌릴 때 get(i)값 넣어줌 
			Friend f2 = (Friend) friends.get(i);
			
			if(f2.getName().equals(name)) {
				System.out.println(f2);
			} else {
				System.out.println("조회결과 없음");
			}
		}
		// 아무것도 포함 안되면
		return null;
	}

}
