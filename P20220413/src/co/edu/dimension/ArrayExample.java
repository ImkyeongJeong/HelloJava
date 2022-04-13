package co.edu.dimension;

public class ArrayExample {

	public static void main(String[] args) {

		// [행][열]
		// length의 크기는 첫 번째 [행]의 크기
//		int[][] intAry = new int [4][3];
//		
//		intAry[0][0] = 10;
//		intAry[1][0] = 20;
//		intAry[3][2] = 100;
//		
//		
//		for(int j=0; j<intAry.length; j++) {
//			for(int i=0; i<intAry[3].length; i++) {
//				System.out.print("[" + j + "]" + "[" + i + "] = " + intAry[j][i]);
//			}
//			System.out.println();
//		}
		
		
		
		
		int[][] intAry = new int[5][5];
		int day=1;
		
		//배열에서는 인덱스 주소값으로 값을 지정, 호출한다.
		for (int i = 0; i < intAry.length; i++) {
			for (int j = 0; j < intAry.length; j++) {
				intAry[i][j] = day++; 
				System.out.printf("%3d" ,intAry[j][i]);
			}
			System.out.println();
		}
	}

}
