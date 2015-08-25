package com.hotelBooking;

import java.util.Arrays;

public class DisplayDefaultChoices {
	
	private int deltaPrice;
	private int ritzPrice;
	private int renaisPrice;

	
	//Method to set price for different available hotels
	void SetDefChoices(boolean member, boolean weekday){
		if (member == true){
			if (weekday == true){
				setDeltaPrice(1 * 210);
				setRitzPrice(1 * 120);
				setRenaisPrice(1 * 90);
			}else {
				setDeltaPrice(1 * 230);
				setRitzPrice(1 * 180);
				setRenaisPrice(1 * 95);
			}
		}else if (member == false){
			if (weekday == true){
				setDeltaPrice(1 * 250);
				setRitzPrice(1 * 195);
				setRenaisPrice(1 * 100);
			}else {
				setDeltaPrice(1 * 290);
				setRitzPrice(1 * 250);
				setRenaisPrice(1 * 120);
			}
		}
	}
	
	//Defining an array to find price in sorted order
	//int[] priceArray = new int[3];
	
	
	//Method to display available choices of hotels
	void DispDefChoices(){
		int[] priceArray = new int[3];
		priceArray[0] = deltaPrice;
		priceArray[1] = ritzPrice;
		priceArray[2] = renaisPrice;
		
		//To test if array functions well:
		//System.out.println(Arrays.toString(priceArray));
		Arrays.sort(priceArray);
		//System.out.println(Arrays.toString(priceArray));
		
		
		
		for (int i=0; i<=2; i++){
			if (priceArray[i] == deltaPrice){
				System.out.println("\nHotel name: Delta Hotels");
				System.out.println("Total cost: " + deltaPrice);
			}else if (priceArray[i] == ritzPrice){
				System.out.println("\nHotel name: Ritz-Carlton");
				System.out.println("Total cost: " + ritzPrice);
			}else {
				System.out.println("\nHotel name: Renaissance Hotels");
				System.out.println("Total cost: " + renaisPrice);
			}
		}		
	}
	
	
	//Method to display individual hotel results
	void DisplayDelta(boolean member, boolean weekday){
		if (member == true){
			if (weekday == true){
				setDeltaPrice(1 * 210);
			}else {
				setDeltaPrice(1 * 230);
			}
		}else if (member == false){
			if (weekday == true){
				setDeltaPrice(1 * 250);
			}else {
				setDeltaPrice(1 * 290);
			}
		}
		
		System.out.println("Total cost of stay: Rs." + deltaPrice);
		
	}
	
	
	void DisplayRitz(boolean member, boolean weekday){
		if (member == true){
			if (weekday == true){
				setRitzPrice(1 * 120);
			}else {
				setRitzPrice(1 * 180);
			}
		}else if (member == false){
			if (weekday == true){
				setRitzPrice(1 * 195);
			}else {
				setRitzPrice(1 * 250);
			}
		}
		System.out.println("Total cost of stay: Rs." + ritzPrice);
		
	}
	
	
	
	void DisplayRenais(boolean member, boolean weekday){
		if (member == true){
			if (weekday == true){
				setRenaisPrice(1 * 90);
			}else {
				setRenaisPrice(1 * 95);
			}
		}else if (member == false){
			if (weekday == true){
				setRenaisPrice(1 * 100);
			}else {
				setRenaisPrice(1 * 120);
			}
		}
		System.out.println("Total cost of stay: Rs." + renaisPrice);
		
	}
	
	

	public int getDeltaPrice() {
		return deltaPrice;
	}

	public void setDeltaPrice(int deltaPrice) {
		this.deltaPrice = deltaPrice;
	}

	public int getRitzPrice() {
		return ritzPrice;
	}

	public void setRitzPrice(int ritzPrice) {
		this.ritzPrice = ritzPrice;
	}

	public int getRenaisPrice() {
		return renaisPrice;
	}

	public void setRenaisPrice(int renaisPrice) {
		this.renaisPrice = renaisPrice;
	}

}
