package com.hotelBooking;

public class DisplayDefaultChoices extends DisplayChoices {
	
	private int deltaPrice;
	private int ritzPrice;
	private int renaisPrice;

	void DispDefChoices(boolean member, boolean weekday){
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
