package co.edu;

public class ReferenceExam {

	public static void main(String[] args) {
		
		// 기본타입 
		int num1 = 100;
		int num2 = 100;
		
		if(num1 == num2) {
			System.out.println("같은 값.");
		} else {
			System.out.println("다른 값.");
		}
		
		// 참조타입 
		String str1 = new String("홍길동"); //클래스는 new라는 키워드로 인스턴스 생성
		String str2 = new String("홍길동"); //인스턴스는 각 주소값이 다르다.
		str1 = null; //null은 참조가 끊어짐(호출 시 예외 발생)
		str1 = "김길동";
 
//equlas : 인스턴스 안의 값을 비교하여 같은 값 나옴 / == : 주소가 다르기 때문에 다른 값 나옴
//		if(str1 == str2) {
		if(str1.equals(str2)) { 
			System.out.println("같은 값.");
		} else {
			System.out.println("다른 값.");
		}
		
	}

}
