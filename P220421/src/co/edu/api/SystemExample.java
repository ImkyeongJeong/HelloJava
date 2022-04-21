package co.edu.api;

//System.exit(0);
//현재 실행하고 있는 프로세스를 강제 종료시키는 역할
//System.currentTimeMillis();
//현재 시각 읽기
public class SystemExample {

	public static void main(String[] args) {
		System.out.println("start");
//		System.exit(0);
		System.out.println("end");

		long start = System.currentTimeMillis(); 
		long sum = 0;
		
		for (int i = 0; i < 1000000; i++) {
			sum += i;
		}
		
		long end = System.currentTimeMillis();
		System.out.println(sum);
		System.out.println(end-start);
	}

}
