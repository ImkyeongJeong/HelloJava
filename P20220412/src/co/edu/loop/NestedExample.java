package co.edu.loop;

public class NestedExample {

	public static void main(String[] args) {
		//중첩 반복문 문제
		
		//구구단 (2단 ~ 9단) ex) 2 * 1 = 2

		for(int i=2; i<=9; i++) {
			System.out.println("================");
			System.out.println(i + "단");
			System.out.println("================");
			for(int j=1; j<=9; j++) {
				System.out.println(i + "*" + j + "=" + i*j);
			}
		}
		
		

		//i : 세로(열) / j:가로(행)
		// *
		// **
		// ***
		// ****
		// *****
		for(int i=0; i<=5; i++) {
			for(int j=1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		// *****
		// ****
		// ***
		// **
		// *
		
		for(int i=0; i<=5; i++) {
			for(int j=5; j>i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		//     *
		//    **
		//   ***
		//  ****
		// *****
		
		for(int i=0; i<=5; i++) {
			for(int j=5; j>i; j--) {
				System.out.print(" ");
			}
			
			for(int k=0; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
