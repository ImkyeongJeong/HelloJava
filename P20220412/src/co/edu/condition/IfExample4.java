package co.edu.condition;

public class IfExample4 {

	public static void main(String[] args) {
		// 임의의 값을 생성해주는 Math.random()
		int randomVal = (int) (Math.random() * 100) + 1; //반환값 : double타입 /  값은 0부터 1보다 작은 값
		System.out.println(randomVal);
		
		// 생성된 값이 1~50, 51~60, 61~70, 71~80, 81~90, 91~100범위
		//System.out.println("생성된 값은 61~70까지 범위 값입니다.");
		
		if(randomVal >= 1 && randomVal <=50) {
			System.out.println("생성된 값은 1 ~ 50까지 범위 값입니다.");
		} else if(randomVal >= 51 && randomVal <=60) {
			System.out.println("생성된 값은 51 ~ 60까지 범위 값입니다.");
		} else if(randomVal >= 61 && randomVal <=70) {
			System.out.println("생성된 값은 61 ~ 70까지 범위 값입니다.");
		} else if(randomVal >= 71 && randomVal <=80) {
			System.out.println("생성된 값은 71 ~ 80까지 범위 값입니다.");
		} else if(randomVal >= 81 && randomVal <=90) {
			System.out.println("생성된 값은 81 ~ 90까지 범위 값입니다.");
		} else if(randomVal >= 91 && randomVal <=100) {
			System.out.println("생성된 값은 91 ~ 100까지 범위 값입니다.");
		}
		
	}

}
