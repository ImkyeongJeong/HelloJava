package co.edu;

import co.edu.friend.Friend;


class Friend2 extends Friend {
	public Friend2() {
		super(); //부모 생성자 호출
		this.getName(); //protected
	}
}

public class ModifierExample {

	public static void main(String[] args) {
		Friend friend = new Friend(); //protected로 선언할 경우 접근 불가 / 상속하면 가능
	}

}
