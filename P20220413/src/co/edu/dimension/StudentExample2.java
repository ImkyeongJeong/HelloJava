package co.edu.dimension;

import java.util.Scanner;

public class StudentExample2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student s1 = new Student();
		
		System.out.println("학생이름 점수 나이"); // 홍길동 80 20
		//sc.next():스페이스 기준으로 하나씩 갖고 온다(문자열로)
		s1.studName = sc.next();
		s1.score = Integer.parseInt(sc.next());
		s1.age = Integer.parseInt(sc.next());
		
		//참조타입의 기본값은 null; (빈 공간 3개 생성) 
		Student[] students = {new Student(), new Student(), new Student()};
		
		students[0].studName = sc.next();
		students[0].score = Integer.parseInt(sc.next());
		students[0].age = Integer.parseInt(sc.next());
		
		
		// 배열에 값 입력 (이름, 점수, 나이)
		// 조회하고 싶은 이름 입력
		// 해당이름 홍길동은 20살이고 80점입니다. (출력)
	}
}
