package co.edu.dimension;

import java.util.Scanner;

public class StudentExample2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student s1 = new Student();
		
//		System.out.println("학생이름 점수 나이"); // 홍길동 80 20
		//sc.next():스페이스 기준으로 하나씩 갖고 온다(문자열로)
//		s1.studName = sc.next();
//		s1.score = Integer.parseInt(sc.next());
//		s1.age = Integer.parseInt(sc.next());
		
		

		//참조타입의 기본값은 null; (빈 공간 3개 생성) 
		Student[] students = {new Student(), new Student(), new Student()};
		
		//배열 접근 방법
//		students[0].studName = sc.next();
//		students[0].score = Integer.parseInt(sc.next());
//		students[0].age = Integer.parseInt(sc.next());
		
		// 배열에 값 입력 (이름, 점수, 나이)
		System.out.println("학생이름 점수 나이");
		for(int i=0; i<students.length; i++) {
			System.out.println();
			students[i].studName = sc.next();
			students[i].score = Integer.parseInt(sc.next());
			students[i].age = Integer.parseInt(sc.next());
		}
		
		// 조회
		System.out.println("조회할 이름을 입력하세요.");
		String searchName = sc.next();
		
		
		// 출력
		for (int i = 0; i < students.length; i++) {
			if(students[i].studName.equals(searchName)) {
				System.out.println(searchName + "은 " + students[i].age + "살이고 " + students[i].score + "점 입니다.");
			}
		}
	}
}
