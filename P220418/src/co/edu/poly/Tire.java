package co.edu.poly;

public class Tire {
	//필드
	public int maxRotation;			// 최대 수명 10
	public int accumulateRotation; 	// 누적 회전수
	public String location;			// 타이어의 위치
	
	//생성자
	Tire(String location, int maxRotation){
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	//메소드
	public boolean roll() {
		accumulateRotation++;
		if(accumulateRotation < maxRotation) {
			System.out.println(location + " Tire수명 " + (maxRotation - accumulateRotation) + "회");
			return true;
		} else {
			System.out.println("***" + location + " Tire 펑크 ***");
			return false;
		}
	}
}
