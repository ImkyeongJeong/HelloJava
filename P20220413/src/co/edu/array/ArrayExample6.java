package co.edu.array;

import java.util.Scanner;

public class ArrayExample6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] names = new String[3]; //학생이름
		int[] scores = new int[3];		//학생점수
		
		for (int i = 0; i < names.length; i++) {
			System.out.println("학생의 이름을 입력하세요.");
			names[i] = sc.nextLine();
			
			System.out.println("학생의 점수를 입력하세요.");
			scores[i] = sc.nextInt();
			sc.nextLine(); //?
		}

		System.out.println("조회할 학생의 이름을 입력하세요.");
		String searchName = sc.nextLine();  //names배열에서 입력한 값을 찾아오는 용도
		
		for (int i = 0; i < names.length; i++) {
			//names배열의 값과 검색한 값과 비교
			if(names[i].equals(searchName)) {
				System.out.println(searchName + "의 점수는 " + scores[i] + "점");
			}
		}
		System.out.println("end of prog.");
	}

}
