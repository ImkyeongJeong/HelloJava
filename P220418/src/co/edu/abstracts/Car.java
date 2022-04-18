package co.edu.abstracts;

public abstract class Car {

	private String model;
	//1.시동켜기 2.출발하기 3.운행 4.멈추기 5.시동끄기
	public abstract void turnOn();	//시동 켜는 기능
	public abstract void start();	//출발 기능	
	public abstract void run();		//운전 기능
	public abstract void stop();		//멈춤 기능
	public abstract void turnOff(); //시동 끄는 기능
	
	
	
}
