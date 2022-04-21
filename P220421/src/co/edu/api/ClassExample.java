package co.edu.api;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

//Class 클래스
public class ClassExample {

	public static void main(String[] args) {

		try {
			Class cls = Class.forName("java.lang.String");
			Method[] methods = cls.getDeclaredMethods(); //결과값은 메서드클래스를 갖고 있는 배열타입으로 받아오겠다.
			for(Method method : methods) {
				System.out.println(method.getName());
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		Class obj = ObjectExample.class;
		Constructor[] cons = obj.getDeclaredConstructors(); //obj가 갖고 있는 생성자를 배열로 갖고 오겠다. (반환타입이 배열)
		for(Constructor construct : cons) {
			System.out.println(construct.getName());
		}
	}

}
