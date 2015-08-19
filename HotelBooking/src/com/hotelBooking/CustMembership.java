package com.hotelBooking;

public class CustMembership {
	//private String member_id;
	private boolean isRewardeeMember = false;
	
	
	public void checkMembership(String member_id)
	{
		if (member_id.matches("^(DEL|RIT|REN).*$"))
		{
			isRewardeeMember = true;
		}
		
	}


	/**
	 * @return the isRewardeeMember
	 */
	public boolean isRewardeeMember() {
		return isRewardeeMember;
	}


	/**
	 * @param isRewardeeMember the isRewardeeMember to set
	 */
	public void setRewardeeMember(boolean isRewardeeMember) {
		this.isRewardeeMember = isRewardeeMember;
	}

}
