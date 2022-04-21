package co.edu.api;

import java.util.HashSet;

class Member{
	String name;
	int age;
	Member(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	//객체마다 가지는 유니크한 값 /50만개의 데이터를 100,200,300으로 나눠서 그룹핑을 지어줘 그룹내에서 비교하는 것이 빠름
	@Override
	public int hashCode() { 
//		return super.hashCode();
		return this.age; //모든 멤버클래스의 나이 구분으로 그룹(같은 그룹내 eqauls 비교)
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Member) {					//obj(매개)값이 Member클래스 타입인지 확인 
			Member member = (Member) obj;			//(Member) obj : Member타입으로 강제타입 변환
			return this.name.equals(member.name);
		}
//		return super.equals(obj);
		return false;								//매개값이 Member타입이 아니거나 age필드값이 다른 경우 false리턴
	}

	@Override
	public String toString() {
		return "이름은 " + name + ", 나이는" + age;
	}

}

public class ObjectExample {

	public static void main(String[] args) {
		
		// ArrayList : 인덱스를 기준으로 요소를 구분(중복O)
		// Set (집합) : 들어있는 요소들의 값으로 구분(중복X) 
		
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(100);
		set.add(200);
		set.add(300);
		set.add(200);
		
		System.out.println(set.size()); //중복값 제외 > 3
		
		HashSet<Member> members = new HashSet<Member>();
		members.add(new Member("홍길동", 20)); 
		members.add(new Member("김길동", 23));
		members.add(new Member("홍길동", 20));
		
		System.out.println(members.size()); //논리적으로 같다고 간주할 수 있다. hashCode와 equals가 같으면
		
		System.out.println(new Member("홍길동",20).toString());
		//둘의 해쉬코드는 값이 같음
		System.out.println("홍길동".hashCode());
		System.out.println("홍길동".hashCode());
		
	}

}
