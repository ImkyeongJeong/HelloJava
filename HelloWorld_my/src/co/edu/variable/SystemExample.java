package co.edu.variable;

import java.io.IOException;
import java.util.Scanner;

public class SystemExample {

	public static void main(String[] args) {
//		//표준입출력 System.in, System.out
//		Scanner scn = new Scanner(System.in);
//		System.out.println("세개의 단어를 입력. 예) 안녕 방가 잘가");
//		
//		while(scn.hasNext()) { //다음 읽어들일 내용이 있는지 확인(True라면 아래 코드 실행)
//			String str = scn.next();
//			System.out.println(str);
//			if(str.equals("exit")) {
//				break;
//			}
//		}
		
			System.out.println("숫자를 입력하세요.");
			while(true) {
				int readByte;
				try {
					readByte = System.in.read(); //System.in.read(); 사용자가 입력한 값을 읽어들이겠다
					System.out.println(readByte);
					if(readByte == 97) //무한 반복 못하도록 (a가 입력되면 반복문 종료)
						break;
				} catch (IOException e) {
					e.printStackTrace();
				} 
			}
		System.out.println("end of program");
	}
}
