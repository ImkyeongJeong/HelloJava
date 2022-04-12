package co.edu;

public class OperatorExample3 {

	public static void main(String[] args) {
		//비교연산자, 논리연산자
		int num1 = 10;
		int num2 = 20;
		
		if(num1 == num2) {
			System.out.println("두수는 같습니다.");
		}
		
		if(num1 != num2) {
			System.out.println("두수는 같지 않습니다.");
		}
		
		if(num1 >= num2) {
			System.out.println(num1 + "이 " + num2 + "보다 큽니다.");
		}
		
		
		
		//&& 두개면 앞의 조건이 false면 확인하지 않는다. / & 한개면 앞의 조건과 상관없이 모든 조건을 다 확인한다.
		if((num1 %2 == 0) && (num2 %2 == 0)) {
			System.out.println("두수는 짝수입니다.");
		} else {
			System.out.println("두수가 짝수는 아닙니다.");
		}
		
		if((num1 %2 == 0) || (num2 %2 == 0)) {
			System.out.println("두수중에 하나 짝수입니다.");
		} else {
			System.out.println("두수가 다 홀수입니다.");
		}
		
		System.out.println("end of prog");
	}

}
