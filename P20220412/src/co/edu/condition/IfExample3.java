package co.edu.condition;

public class IfExample3 {

	public static void main(String[] args) {
		//중첩 구문
		//90점이상 A, 80점이상 B, 70점이상 C
		//95점이상 A+, 85점이상 B+, 75점이상 C+
		
		int score=78;
		
		if(score>=90) {
			if(score>=95) {
				System.out.println("A+");
			} else {
				System.out.println("A");
			}
		} else if(score>=80) {
			if(score>=85) {
				System.out.println("B+");
			} else {
				System.out.println("B");
			}
		} else if(score>=70) {
			if(score>=75) {
				System.out.println("C+");
			} else {
				System.out.println("C");
			}
		} else {
			System.out.println("F");
		}
	}
}

