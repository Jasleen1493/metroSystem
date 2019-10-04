package com.sapient.exception;

import com.sapient.entity.Traveller;

public class TravellerWithNoSmartCardException extends MetroSystemException {
	public TravellerWithNoSmartCardException(String s) {
		super(s);
	}
	
	public static TravellerWithNoSmartCardException validate(Traveller traveller) throws TravellerWithNoSmartCardException {
		if(traveller.getSmartCard() == null)
			throw new TravellerWithNoSmartCardException("Traveller does not have smart card");
		else
			return new TravellerWithNoSmartCardException("Traveller having smart card");
	}
}
