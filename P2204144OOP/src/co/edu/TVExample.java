package co.edu;

public class TVExample {

	public static void main(String[] args) {
		int num = 10;
		String str = "Hello";
		
		//Television은 내가 생성한 새로운 타입(인스턴스 생성 후 tv라는 변수 생성 후 필드에 데이터를 담아준다.)
		//new : 객체 생성 후 객체 주소 리턴
		Television tv = new Television();
		 
		tv.company = "삼성";
		tv.color = "검은색";
		tv.price = 30000;
		tv.model = "30Inch";
		tv.turnOn();
		tv.changeChanel(10);
		tv.turnOff();
		
		//tv != tv1; 서로 다른 실체
		Television tv1 = new Television();
		tv.company = "삼성";
		tv.color = "검은색";
		tv.price = 30000;
		tv.model = "30Inch";
		
		//동일한 내용이 들어 있어도 주소값이 다르기 때문에 false
		System.out.println(tv == tv1);
		
		//@34ce8af7(인스턴스 주소값을 출력)
		System.out.println(tv);
		System.out.println(tv1);
		
		
		//new Student();만 사용하면 인스턴스는 생성되고 접근하려 변수 선언
		Student stud1 = new Student();
		stud1.name = "홍길동";
		stud1.studNo = "22-12345";
		stud1.age = 20;
		stud1.height = 174.5;
		
		Student stud2 = new Student();
		stud2.name = "정임경";
		stud2.studNo = "22-22222";
		stud2.age = 30;
		stud2.height = 162.5;
		
		
		//생성자를 통해 필드에 값을 담음(필드에 직접 넣기, 생성자를 통해서 넣어도 됨)
		//컨트롤 클릭하면 이동 됨
		Student stud3 = new Student("정임경", "22-1234");
		stud3.age = 25;
		stud3.height = 164.5;
		
		
		Student stud4 = new Student("정임경", "22-1234", 30);
		stud4.height = 162;
		
		stud1.study();
		stud2.study();
		stud4.showInfo();
	}

}
