package co.edu.collection.generic;


//선언할 때 타입을 파라미터로 선언해둔다.
public class Box<String> {
	//최상위클래스 / 문자, 숫자, 또다른 클래스타입 다 받을 수 있음
	String field;
	
	
	public void setField(String field) {	//어떤타입이든 받을 수 있음
		this.field = field;
	}
	
	public String getField() {
		return field;
	}
}
