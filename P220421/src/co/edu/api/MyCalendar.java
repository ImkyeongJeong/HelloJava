package co.edu.api;

import java.util.Calendar;

public class MyCalendar {

	public static void main(String[] args) {
		String y = "2022";
		String m = "5"; // "06" || "6"
		
		showCal(y, m);
	}
	
	public static void showCal(String year, String month) {
		// 달력출력
		Calendar cal = Calendar.getInstance();
		
		String[] days = { "Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat" };
		
		cal.set(Integer.parseInt(year), Integer.parseInt(month)+1, 1);
		
		cal.getActualMaximum(0);
		
		System.out.print("\t " + cal.get(Calendar.YEAR) + "년 ");
		System.out.println(cal.get(Calendar.MONTH) + "월");
		
		//요일 출력
		for (int i = 0; i < days.length; i++) {
			System.out.printf("%4s", days[i]);
		}
		
		//날짜 출력
		
	}

}
