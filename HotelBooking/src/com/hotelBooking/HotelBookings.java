package com.hotelBooking;

import java.util.Scanner;

public class HotelBookings {
	
	private static String member_id;
	private static String date_input;
	private static String starRating;
	private static String hotelPref;

	public static void main(String[] args)
	{
		
		//Take all inputs from customer
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome to Marriott Hotels and Resorts !!!");
		System.out.println("\n\n");
		System.out.println("Please select the following to find a hotel:");
		System.out.println("\n");
		System.out.println("Enter desired date for stay in following format \"MM-dd-yyyy\"");
		
		date_input = scanner.next();
		
		System.out.println("Are you our existing privileged customer?");
		System.out.println("If Yes please enter your membership ID: ");
		
		member_id = scanner.next();
		
		System.out.println("Please enter hotel's star rating if any: ");
		//To prevent nextLine() reading previous lines return as an input
		scanner.nextLine();
		starRating = (scanner.nextLine());
		
		System.out.println("Please enter hotel preference if any, enter as given below:");
		System.out.println("Del for \"Delta Hotels\"");
		System.out.println("Rit for \"Ritz-Carlton\"");
		System.out.println("Ren for \"Renaissance Hotels\"");
		
		hotelPref = scanner.nextLine();
		
		//Method call to verify day of the week
		CheckDayOfWeek chkday = new CheckDayOfWeek();
		chkday.checkDay(date_input);
		
		
		//Method call to check hotel membership
		CustMembership custMem = new CustMembership();
		custMem.checkMembership(member_id);
		
		
		//Method call to display choices
		DisplayChoices choices = new DisplayChoices();
		choices.availableHotelOptions(custMem.isRewardeeMember(), CheckDayOfWeek.weekday, starRating, hotelPref);
		
		//For testing functionality - temporary lines of code
		/*System.out.println("Membership detail: " + custMem.isRewardeeMember());
		System.out.println("Star preference is: " + starRating);
		System.out.println("Hotel preference as provided is: " + hotelPref);
		*/
		
		
		//To close scanner object to prevent resource leak
		if (scanner != null){
			scanner.close();
		}
	}

}
