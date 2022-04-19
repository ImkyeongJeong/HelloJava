package co.edu.collection;

import co.edu.friend.Friend;

public interface FriendService {
	// 추가, 수정, 삭제, 조회
	public void addFriend(Friend friend);	//Friend클래스 매개값으로 받음
	public void modFriend(Friend friend);
	public void remFriend(String name);
	public Friend findFriend(String name);
}
