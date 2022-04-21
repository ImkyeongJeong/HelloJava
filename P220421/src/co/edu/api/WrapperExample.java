package co.edu.api;
//P.498

public class WrapperExample {

	public static void main(String[] args) {

		//랩퍼클래스
		//기본데이터 -> 참조데이터
		//int, long, byte, float -> Integer, Long, Byte
		int n1 = 100;				//기본타입
		Integer n2 = 200;			//박싱: 기본타입 값을 포장 객체로 만드는 과정
		n1 = n2;					//언박싱: 포장 객체에서 기본 타입의 값을 얻어내는 과정
		byte b1 = n2.byteValue();
		System.out.println(b1);
		
		Integer.parseInt("100");
		
	}

}
