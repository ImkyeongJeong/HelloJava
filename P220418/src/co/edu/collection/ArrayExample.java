package co.edu.collection;

import java.util.ArrayList;

import co.edu.friend.Friend;

//배열 vs 컬렉션
//배열활용한 프로그램, 컬렉션을 활용한 프로그램
//인터페이스 선언 => 구현하는 클래스
public class ArrayExample {
	public static void main(String[] args) {
		//배열 크기 변경 불가 vs 배열 크기 변경 가능
		Friend[] friendAry = new Friend[10];
		friendAry[0] = new Friend("홍길동", "010-1111");
		friendAry[1] = new Friend("김길동", "010-2222");
//		friendAry[10] = null; 범위를 벗어나면 에러
		for (int i = 0; i < friendAry.length; i++) {
			if(friendAry[i] != null) {
			System.out.println(friendAry[i].toString());
			}
		}
	

		// 컬렉션 활용 / 컬렉션:인터페이스 => List:컬렉션 => ArrayList
		ArrayList friendList = new ArrayList();
		friendList.add(new Friend("박길동", "010-3333")); //add: 값추가
		friendList.add(new Friend("최길동", "010-4444")); 
		friendList.remove(0); 							//remove(인덱스): 삭제 (빈 공간 없도록 값을 앞으로 당겨옴)
		
		for (int i = 0; i < friendList.size(); i++) {
			System.out.println(friendList.get(i));      //get(인덱스): 값 가져옴
		}
		
		Friend f2 = (Friend) friendList.get(0); 		//get의 리턴타입: object 값을 답으려면 캐스팅 필요
	}
}
