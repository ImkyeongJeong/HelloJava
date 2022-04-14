package co.edu;

public class CalExample {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		
		c1.printPI();
		c1.getArea(2.4);
		
		int result = c1.sum(2, 4);
		System.out.println("두 수의 합: " + result);
		double result1 = c1.sum(23.4, 31);
		
		double result2 = c1.getTriangleArea(14, 15);
		System.out.println("삼각형의 너비는: " + result2 + "입니다.");
		
		int[] intAry = {10,20,30,40};
		int result3 = c1.sum(intAry);
		System.out.println("배열의 합: " + result3);
		
		double result4 = c1.average(10, 10, 10);
		System.out.println("평균: " + result4);
		
		double result5 = c1.average(10, 20, 30, 40, 50);
		System.out.println(result5);
	}

}
