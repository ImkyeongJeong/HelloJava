package co.edu.collection.generic;

import java.util.ArrayList;

import co.edu.friend.Friend;

public class BoxExample {
	public static void main(String[] args) {
		
		//사용하는 시점에 타입을 정하는 것이 제네릭
		//클래스 내부에서 지정하는 것이 아닌 외부에서 사용자에 의해 지정되는 것을 의미
		Box<String> box = new Box<String>();
		box.setField("Orange");
		String result = box.getField();
		
//		String result = (String) box.getField();	//제네릭 안하면 Object > String형변환 필요
		
		//Integer타입으로 set,get한다.
		Box<Integer> box2 = new Box<Integer>();
		box2.setField(null);
		Integer result2 = box2.getField();
		
		//String참조값만 받는 List생성하겠다
		ArrayList<String> list = new ArrayList<String>();
		list.add("홍길동");
		list.add("김길동");
//		list.add(10);	//String타입이 아니라 에러 발생
		
		//Friend클래스의 인스턴스를 담겠다 지정
		ArrayList<Friend> friends = new ArrayList<Friend>();
		friends.add(new Friend("박길동", "010-2222"));
		
		System.out.println("end of prog.");
	}
}
