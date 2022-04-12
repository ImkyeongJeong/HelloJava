package co.edu.variable;

public class VarExample5 {
	public static void main(String[] args) {
		int val = 2147483647; // 4 * 1byte => 8 * bit; 값이 on/off
		
		System.out.println(Integer.MAX_VALUE);
		
		long val2 = 2147483648L;
		long val3 = 10; // 10 -> long 변환(promotion:자동형변환)
		
		int val4 = (int)2147483648L; //큰 값에서 작은 값으로는 담을 수 없다. long -> int (casting:강제형변환) (큰 값을 작은 곳에 담길 때 값 손실을 생각해야 한다.) 
		
		int result = (int)100L / 5; //연산하는 값과 타입이 일치해야 한다.  
		
		
		long val5 = 10000000000L;
		long val6 = 10L;
		
		result = (int)(val5 - val6);
		System.out.println(result);
		
		char charLit = 97;	// 0 ~ 65535까지의 정수값에 문자가 맵핑 되어 있음
		charLit = 44032;
		System.out.println(charLit++);
		System.out.println(charLit++);
		System.out.println(charLit++);
		System.out.println(charLit++);
		System.out.println(charLit++);
		System.out.println(charLit++);
		System.out.println(charLit++);
		System.out.println(charLit++);
		System.out.println(charLit++);
		System.out.println(charLit++);

	}
}
