package co.edu.collection.generic;

import java.util.ArrayList;

import co.edu.friend.Friend;
import co.edu.friend.Gender;

public interface FriendService {
	public int ADD = 1;
	public int MOD = 2;
	public int DEL = 3;
	public int SEARCH = 4;
	public int FIND_MEN = 5;
	public int FIND_WOMEN = 6;
	
	// 추가, 수정, 삭제, 조회
	public void addFriend(Friend friend);	//Friend클래스 매개값으로 받음
	public void modFriend(Friend friend);
	public void remFriend(String name);
	public Friend findFriend(String name);
	public ArrayList<Friend> findGender(Gender gender);
}
