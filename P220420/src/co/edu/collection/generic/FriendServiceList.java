package co.edu.collection.generic;

import java.util.ArrayList;
import java.util.Scanner;

import co.edu.friend.Friend;
import co.edu.friend.Gender;

//켈력선 ArrayList
public class FriendServiceList implements FriendService{

	Scanner sc = new Scanner(System.in);
	
	//Friend클래스의 인스턴스를 담겠다 지정
	ArrayList<Friend> friends = new ArrayList<Friend>();
	
	//추가
	@Override
	public void addFriend(Friend friend) {
			friends.add(friend);
	}

	//수정
	@Override
	public void modFriend(Friend friend) {
		for (int i = 0; i < friends.size(); i++) {
			//Friend클래스 인스턴스로 받으려면 캐스팅 필요 f2변수가 Friend클래스 메소드를 사용할 수 있다.
//			Friend f2 = (Friend) friends.get(i);
			
			if(friends.get(i).getName().equals(friend.getName())) {
				System.out.println("변경할 연락처 입력");
				String changePhon = sc.nextLine();
				friends.get(i).setPhon(changePhon);
				break;
			}
		}
	}

	//삭제
	@Override
	public void remFriend(String name) {
		for (int i = 0; i < friends.size(); i++) {
			if(friends.get(i).getName().equals(name)) {
				friends.remove(i);
				i--;
			}
		}
	}

	//조회
	@Override
	public Friend findFriend(String name) {
		for (int i = 0; i < friends.size(); i++) {
			
			if(friends.get(i).getName().equals(name)) {
				System.out.println(friends.get(i).toString());
			}
		}
		return null;
	}

	@Override
	public ArrayList<Friend> findGender(Gender gender) {
		
		//ArrayList컬렉션은 Friend타입 값만 받아 list에 대입
		ArrayList<Friend> list = new ArrayList<Friend>();
		
		//friends에서 값을 찾고 return은 list에 값 담아서 
		for (int i = 0; i < friends.size(); i++) {
			if(friends.get(i).getGender() == gender) { //열거형일 땐 비교 == 가능
				//열거형타입도 클래스타입과 같은 참조타입
				//기본타입: == 비교연산자
				//열거형 == 비교연산자로 비교
				list.add(friends.get(i));
			}
		}
		//남자면 남자만 담고 여자면 여자값만 담김
		return list;
	}

}
