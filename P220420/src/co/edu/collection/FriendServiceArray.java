package co.edu.collection;

import co.edu.friend.Friend;

//배열의 기능 활용
public class FriendServiceArray implements FriendService {

	Friend[] friends = new Friend[10];
	
	//추가
	@Override
	public void addFriend(Friend friend) {
		for (int i = 0; i < friends.length; i++) {
			if(friends[i] == null) {
			friends[i] = friend; 
			System.out.println("추가 완료");
			break;
			}
		}
	}

	//수정
	@Override
	public void modFriend(Friend friend) {
		for (int i = 0; i < friends.length; i++) {
			if(friends[i] != null && friends[i].getName().equals(friend.getName())) {
				friends[i].setPhon(friend.getPhon());
			}
		}
	}

	//삭제
	@Override
	public void remFriend(String name) {
		for (int i = 0; i < friends.length; i++) {
			if(friends[i] != null && friends[i].getName().equals(name)) {
				friends[i] = null;
			}
		}
	}

	//조회
	@Override
	public Friend findFriend(String name) {
		for (int i = 0; i < friends.length; i++) {
			if(friends[i] != null && friends[i].getName().equals(name)) {
				return friends[i];
			}
		}
		return null;
	}

}
