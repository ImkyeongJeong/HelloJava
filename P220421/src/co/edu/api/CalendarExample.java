package co.edu.api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

//LocalDateTime 날짜 시간
public class CalendarExample {

	public static void main(String[] args) {

		int year = 2020;
		int month = 5;
		
		Calendar today = Calendar.getInstance();
		
		today.set(year, month-1, 1);
		System.out.println("년: " + today.get(Calendar.YEAR));
		System.out.println("월: " + today.get(Calendar.MONTH));			//1월: 시작값 0
		System.out.println("일: " + today.get(Calendar.DAY_OF_MONTH));	//일요일: 시작값 1
		System.out.println("요일: " + today.get(Calendar.DAY_OF_WEEK));
		System.out.println("마지막날: " + today.getActualMaximum(Calendar.DATE));
		
		///////////////////////////////////////////////////////////////////////
		
		Date todate = new Date();
		todate = new Date("2021/05/05");
		todate.setYear(2022); //1900기준 = > 결과 1900+2022 => 3992 
		System.out.println(todate.toString());
		
		
		
		//년,월,일 2022-10-10
		LocalDate ldate = LocalDate.of(2022, 10, 10);
		System.out.println(ldate.toString());
		
		//시간 10:10:10
		LocalTime ltime = LocalTime.of(10, 10, 10);
		System.out.println(ltime.toString());
		
		//2022-04-21T10:48:29.238008400
		LocalDateTime ldt = LocalDateTime.now(); //현재 시간 기준
		System.out.println(ldt.toString());
		
		//Formatter를 사용하면 원하는 형식으로 나타낼 수 있다. 2022-04-21 10:51:14
		LocalDateTime ldt2 = LocalDateTime.now();
		ldt2 = LocalDateTime.of(2022, 10, 5, 10, 20, 30);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
		System.out.println(ldt.format(dtf));
		
		
	}

}
