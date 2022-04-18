package co.edu.abstracts;

import java.util.Scanner;

public class CarMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Car car = null;
		
//		Sonata car = new Sonata();
//		Avante car = new Avante();	//추상메서드 상속받지 않다면 각 메서드이름이 달라서 다 수정해줘야함
		
		
		//변수에 어떤 인스턴스를 할당하느냐만 달라지고 기능은 동일하다. (추상클래스 장점)
		car = new Sonata();	
		car = new Avante();
		
		//1.시동켜기 2.출발하기 3.운행 4.멈추기 5.시동끄기
		while(true) {
			System.out.println("1.시동켜기 2.출발하기 3.운행 4.멈추기 5.시동끄기");
			int menu = sc.nextInt();
			
			if(menu == 1) {
				car.turnOn();
			} else if(menu == 2) {
				car.start();
			} else if(menu == 3) {
				car.run();
			} else if(menu == 4) {
				car.stop();
			} else if(menu == 5) {
				car.turnOff();
			} else {
				break;
			}
		}
		
	}

}
