package com.hotelBooking;

public class DisplayChoices {
	void availableHotelOptions(boolean rewardee, boolean weekday, String starPref, String hotelPref)
	{
		System.out.println("Preferences as entered are: " + rewardee + "\n" + weekday + "\n" + starPref + "\n" + hotelPref);
		
		if (starPref.equals("") && hotelPref.equals("")){
			System.out.println("No star preference and hotel preference provided");
			//TODO
		} else if (starPref.equals("5") | hotelPref.equals("Del")){
			System.out.println("Your preference matches Delta Hotels");
			//TODO
		} else if (starPref.equals("4") | hotelPref.equals("Rit")) {
			System.out.println("Your preference matches Ritz-Carlton Hotel");
			//TODO
		} else if (starPref.equals("3") | hotelPref.equals("Ren")){
			System.out.println("Your preference matches Renaissance Hotels");
			//TODO
		} else {
			System.out.println("Sorry we don't have hotels available with preferences provided");
			System.out.println("Please select again without preferences for hotel suggestions");
		}
	}
}
