package co.edu.loop;

public class ForExample3 {

	public static void main(String[] args) {
		// 1 ~ 100번 반복
		// 최초로 1000보다 큰 값중 최소값을 구하고, 몇 번째인가?
		int sum = 0;
		int cnt = 0;
		
		for(int i=1; i<=100; i++) {
			sum+=i;
		
			if(sum>=1000) {
				cnt = i;
				break;
			}
		}
		System.out.println("1000보다 큰 최소 합계:" + sum + ", 순번 : " + cnt);
		

		
		// 1 ~10번 반복 sum = sum * 1; 곱한 값 누적
		sum=1;
		
		for(int i=1; i<=10; i++) {
			sum = sum*i;
		}
		System.out.println("1 ~ 10까지 곱한 결과" + sum);
	
		

		// 숫자 100의 약수를 출력하도록 1,2,4,5,10
		for(int i=1; i<=100; i++) {
			if(100%i==0) {
				System.out.println(i);
			}
		}
	}
}
