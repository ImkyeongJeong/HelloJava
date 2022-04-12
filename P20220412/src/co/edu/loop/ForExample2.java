package co.edu.loop;

public class ForExample2 {

	public static void main(String[] args) {
		// 1 ~ 100까지 반복 (sum에 더해라)
		// 31번째 종료. 
		int sum = 0;
		
		for(int i=1; i<=100; i++) {
			if(i == 31) {
				break;
			}
			
			if(i % 2 == 0) {
				System.out.println("현재 i의 값 = " + i);
				continue;	//continue구분 아래 코드 실행 없이 다음 순번 실행
			}
			sum += i;  //if문 위에 있을 때 결과값과 if문 아래 있을 때 결과값이 다르다. (위치가 중요!)
		}
		System.out.println(sum);
		
	}

}
