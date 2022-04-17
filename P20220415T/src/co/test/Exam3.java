package co.test;

// 배열의 사용.
// 크기가 10인 배열에 1 ~ 10까지의 임의의 수를 저장.
// 평균값보다 큰 값을 새로운 배열에 저장하도록 하세요. 1~10담는 배열1개, 평균보다 큰 녀석을 담는 배열1개(그 중에 큰놈만 배열에 담기) ) 
public class Exam3 {
	public static void main(String[] args) {
		int[] intAry = new int[10];
		int[] maxAry = new int[10];
		
		int sum = 0;
		double avg = 0;

		for (int i = 0; i < 10; i++) {
			int randomVal = (int)(Math.random()*10) +1;
			intAry[i] = randomVal;
			sum += randomVal;

			System.out.print(intAry[i] + " ");
		}			

		avg = sum/10.0;
		System.out.println();
		System.out.println("배열의 합 : " + sum + "  / 배열의 평균 : " + avg);
		
		for (int i = 0; i < intAry.length; i++) {
			if(intAry[i] > avg) {
				maxAry[i] = intAry[i];
				System.out.print(maxAry[i] + " ");
			}

		}
	}
}
