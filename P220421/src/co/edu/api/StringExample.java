package co.edu.api;

import java.util.Scanner;

public class StringExample {

	public static void main(String[] args) {
		// 주민번호 => 생년월일, 남/여, 구분
		// ex)950405-2345678 => 95년 4월 5일 생, 여자입니다.
		// ex)991001-1234567 => 99년 10월 1일 생, 남자입니다.
		
		// ex)9704051234567 => 97년 4월 5일 생, 남자입니다.
		// ex)0505053456789 => 05년생 5월 5일 생, 남자입니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주민번호를 입력하세요");
		String juminNo = sc.nextLine(); 
		
		String result = checkInfo(juminNo);
		System.out.println(result);
	}
	
	public static String checkInfo(String jumin) {
		
		String year = jumin.substring(0, 2);
		String month = jumin.substring(2,4);
		String day = jumin.substring(4,6);
		String gender = jumin.substring(jumin.length()-7,jumin.length()-6);
		
		
		//month에 0이 포함되어 있지 않다면 
		if(month.indexOf("0") == -1) {
			month = jumin.substring(2,4);
		} else {
			month = jumin.substring(3,4);
		}
		
		if(gender.equals("1") || gender.equals("3") ) {
			gender = "남자";
		} else if(gender.equals("2") || gender.equals("4")) {
			gender = "여자";
		}
		
		//return "95년 4월 5일 생, 여자입니다.";
		return year + "년 " + month + "월 " + day + "일 생, " + gender + "입니다.";
	}

}
