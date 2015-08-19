package com.hotelBooking;

//import java.util.Calendar;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class CheckDayOfWeek {
	
		public static boolean weekday = true;
		
		java.util.Date date1 = null;
		
		void checkDay(String date_input){
		
		SimpleDateFormat format1 = new SimpleDateFormat("MM-dd-yyyy");
		try {
			date1 = format1.parse(date_input);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		DateFormat format2 = new SimpleDateFormat("EE");
		String dayOfTheWeek = format2.format(date1);
		System.out.println("\n" + dayOfTheWeek);
		
		if (dayOfTheWeek.compareTo("Sat") == 0 | dayOfTheWeek.compareTo("Sun") == 0)
		{
			weekday = false;
		}
		
		System.out.println("Weekday = " + weekday);
		}
		
	

}
