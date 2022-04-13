package co.edu.array;

public class ArrayExample3 {

	public static void main(String[] args) {
		int[] intAry = {78, 83, 88, 92, 63};
		
		// 각 배열 요소의 합을 구하는 코드 작성
		// 첫 번째, 세 번째, 다섯 번째 합
		// 가져온 값이 짝수인 값만 더해서 평균 구하기
		
		int sum = 0;
		double avg = 0;
		int cnt = 0;
		
		//배열에 선언된 크기 length(배열의 길이 변경이 생겼을 때 코드 변경하지 않아도 된다.)
		for(int i=0; i< intAry.length; i++) {
			if(intAry[i]%2==0) {
				sum += intAry[i];
				cnt ++;
			}
		}
		avg = sum/cnt;
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
	}
}
