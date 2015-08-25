package com.hotelBooking;

public class DisplayChoices {
	void availableHotelOptions(boolean rewardee, boolean weekday, String starPref, String hotelPref)
	{
		DisplayDefaultChoices disp = new DisplayDefaultChoices();
		System.out.println("Preferences as entered are: " + rewardee + "\n" + weekday + "\n" + starPref + "\n" + hotelPref);
		
		if (starPref.equals("") && hotelPref.equals("")){
			
			System.out.println("No star preference and hotel preference provided");
			disp.SetDefChoices(rewardee, weekday);
			disp.DispDefChoices();
			
		} else if (starPref.equals("5") ? hotelPref.equals("Del") : hotelPref.equals("")){
			
			System.out.println("Your preference matches Delta Hotels");
			disp.DisplayDelta(rewardee, weekday);			
		} else if (starPref.equals("4") ? hotelPref.equals("Rit") : hotelPref.equals("")) {
			
			System.out.println("Your preference matches Ritz-Carlton Hotel");
			disp.DisplayRitz(rewardee, weekday);
			
		} else if (starPref.equals("3") ? hotelPref.equals("Ren") : hotelPref.equals("")){
			
			System.out.println("Your preference matches Renaissance Hotels");
			disp.DisplayRenais(rewardee, weekday);
			
		} else {
			
			System.out.println("Sorry we don't have hotels available with preferences provided");
			System.out.println("Following are the suggestions we have for you:");
			disp.SetDefChoices(rewardee, weekday);
			disp.DispDefChoices();
			
		}
	}
}
