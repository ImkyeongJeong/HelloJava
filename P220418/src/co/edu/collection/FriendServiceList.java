package co.edu.collection;

import java.util.ArrayList;

import co.edu.friend.Friend;

//켈력선 ArrayList
public class FriendServiceList implements FriendService{

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
		
	}

	//삭제
	@Override
	public void remFriend(String name) {
		
	}

	//조회
	@Override
	public Friend findFriend(String name) {
		for (int i = 0; i < friends.size(); i++) {

			if(friends.get(i).equals(name)) {
				Friend f2 = (Friend) friends.get(i);
				return f2;
			}
		}
		return null;
	}

}
