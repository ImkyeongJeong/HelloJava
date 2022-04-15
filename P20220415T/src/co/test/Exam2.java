package co.test;

// 조건문과 반복문.
// 
// Math.random()을 사용해서 1  ~ 10사이의 임의의 수를 추출.(10번 반복작업 수행하여 합계) 
// 2의 배수와 3의 배수의 합계를 각각 구하도록 하세요.
// 6의 경우에는 2와 3의 배수이므로 2의 배수와 3의 배수의 합계에 각각 더해지도록 하세요. (2배수 담는 변수, 3배수 담는 변수 선언해서 담아줌)
// 결과 > 2의 배수의 합: 26, 3의 배수의 합: 27 
public class Exam2 {
	public static void main(String[] args) {
		int num2=0;
		int num3=0;
		
		for (int i = 0; i <10; i++) {
			int randomVal = (int)(Math.random()*10) +1;
			System.out.print(randomVal + " ");
			if(randomVal%2 == 0) {
				num2 += randomVal;
			} else if(randomVal%3 == 0) {
				num3 += randomVal;
			}
		}
		System.out.println();
		System.out.println("2의 배수의 합: " + num2);
		System.out.println("3의 배수의 합: " + num3);

		
	}
}
